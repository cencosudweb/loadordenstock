/**
 * @name Correo
 * 
 * @version 1.0
 *
 * @date 11 de Septiembre de 2015 
 * 
 * @author cmachado
 * 
 * @copyright Inversiones Security. All rights reserved.
 */

package cl.org.is.api.util;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import org.apache.log4j.Logger;

import cl.com.is.common.mail.ParametrosCorreo;
import cl.org.is.api.constantes.Constantes;

/**
 * @description Esta clase tiene como objetivo realizar el ejecucion del envio de correos.
 */

public class Correo {
 
	/** Variable que gestiona la impresion del log */
    private static final Logger logger = Logger.getLogger(Correo.class);
    /**
     * Objeto que contiene la sesion para el envio de correo
     */
    private Session mailSession;
 
    public Session getMailSession() {
        return mailSession;
    }
 
    public void setMailSession(Session mailSession) {
        this.mailSession = mailSession;
    }
     
    public boolean enviarCorreo(ParametrosCorreo parametros) {
    	 
    	
    	/**
         * Validacion de argumentos de entrada
         */
        if (parametros.getDestinatarios() == null || parametros.getDestinatarios().length == 0) {
            return false;
        }
 
        try {
             
            /**
             * Se asigna la sesion que el correo usara para su envio.
             */
        	 Message correo = new MimeMessage(mailSession);

            /**
             * Se incluye el correo de origen configurado en la sesion
             */
            correo.setFrom(new InternetAddress(parametros.getRemitente().trim(), parametros.getNombreRemitente().trim()));
 
            /**
             * Se agregan los destinatarios del correo.
             */
            for (String destinatario : parametros.getDestinatarios()) {
                correo.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            }
            
 
            /**
             * Se agregan destinatarios que recibiran una copia del correo.
             */
            if (parametros.getCopias() != null && parametros.getCopias().length >= 0) {
                for (String copia : parametros.getCopias()) {
                    correo.addRecipient(Message.RecipientType.CC, new InternetAddress(copia));
                }
            }
 
            /**
             * Se agregan destinatarios que recibiran una copia oculta del correo.
             */
            if (parametros.getOcultas() != null && parametros.getOcultas().length >= 0) {
                for (String oculta : parametros.getOcultas()) {
                    correo.addRecipient(Message.RecipientType.BCC, new InternetAddress(oculta));
                }
            }
 
            /**
             * Se asigna el asunto y fecha de envio al objeto del correo
             */
            correo.setSubject(parametros.getAsunto());
            correo.setSentDate(new Date());
 
            /**
             * Se construye el cuerpo del correo (usando MIME multi-part)
             */
            MimeBodyPart mbp = new MimeBodyPart();
            
            //mbp.setText(parametros.getTextoCorreo(),"text/html");
            //mbp.setDataHandler(new javax.activation.DataHandler(new ByteArrayDataSource(parametros.getTextoCorreo().toString(), Constantes.TEXT_HTML)));
 
            /**
             * Se agrega todas las partes al correo.
             */
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(mbp);
            
            /**
             * Se adjunta los archivos al correo.
             */
            if (parametros.getAdjuntos() != null) {
                String mime = "application/".trim() + parametros.getTipoAdjunto().trim();
                MimeBodyPart attachment = new MimeBodyPart();
                
                for (Map.Entry<String, byte[]> entry : parametros.getAdjuntos().entrySet()) {
                    String nombreArchivo = entry.getKey().toString().trim() + "." + parametros.getTipoAdjunto().trim();
                    byte[] adjunto = entry.getValue();
                    if (adjunto == null || nombreArchivo == null) {
                        continue;
                    }
 
                    ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(adjunto, mime);
                    attachment.setHeader(Constantes.CONTENT_TYPE, mime);
                    attachment.setDataHandler(new DataHandler(byteArrayDataSource));
                    attachment.setFileName(nombreArchivo);
                    mp.addBodyPart(attachment);
                }
                
            }
 
            /**
             * Se realiza el proceso de envio del correo
             */
            
            //Transport transport = mailSession.getTransport("smtp");
            // System.out.println("success point 5");
            //transport.connect("smtp.gmail.com", "jose.floyd.jose@gmail.com", "3712JlGj");
            correo.setContent(mp);
            Transport.send(correo, correo.getAllRecipients());
            
           // correo.setContent(mp);
            //Transport.send(correo, correo.getAllRecipients());
 
        } catch (MessagingException messagingException) {
            logger.error("Error al enviar el correo: ", messagingException);
            return false;
        } catch (Exception exception) {
            logger.error("Error al enviar el correo: ", exception);
            return false;
        }
        return true;
    }
    
    public boolean enviarCorreo2(ParametrosCorreo parametros) {
	    Properties props = System.getProperties();
	    String host = "smtp.gmail.com";
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.ssl.trust", host);
	    props.put("mail.smtp.user", "cencosudweb.panel@gmail.com");
	    props.put("mail.smtp.password", "cencosud2017");
	    props.put("mail.smtp.port", "587");//587
	    props.put("mail.smtp.auth", "true");
	   //System.out.println("success point 1");
	    
	    Session session = Session.getDefaultInstance(props);

	    /**
         * Validacion de argumentos de entrada
         */
        if (parametros.getDestinatarios() == null || parametros.getDestinatarios().length == 0) {
            return false;
        }

	    try {
	         //System.out.println("success point 2");
	    	
	    	/**
             * Se asigna la sesion que el correo usara para su envio.
             */
        	 Message correo = new MimeMessage(session);
        	 
        	 
        	 /**
              * Se incluye el correo de origen configurado en la sesion
              */
             correo.setFrom(new InternetAddress(parametros.getRemitente().trim(), parametros.getNombreRemitente().trim()));
  
             /**
              * Se agregan los destinatarios del correo.
              */
             for (String destinatario : parametros.getDestinatarios()) {
                 correo.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
             }
             
  
             /**
              * Se agregan destinatarios que recibiran una copia del correo.
              */
             if (parametros.getCopias() != null && parametros.getCopias().length >= 0) {
                 for (String copia : parametros.getCopias()) {
                     correo.addRecipient(Message.RecipientType.CC, new InternetAddress(copia));
                 }
             }
  
             /**
              * Se agregan destinatarios que recibiran una copia oculta del correo.
              */
             if (parametros.getOcultas() != null && parametros.getOcultas().length >= 0) {
                 for (String oculta : parametros.getOcultas()) {
                     correo.addRecipient(Message.RecipientType.BCC, new InternetAddress(oculta));
                 }
             }
  
             /**
              * Se asigna el asunto y fecha de envio al objeto del correo
              */
             correo.setSubject(parametros.getAsunto());
             correo.setSentDate(new Date());
	         
             
             /**
              * Se construye el cuerpo del correo (usando MIME multi-part)
              */
             MimeBodyPart mbp = new MimeBodyPart();
             
             logger.info("Essssssssssss " + parametros.getTextoCorreo());
             
             //mbp.setText(parametros.getTextoCorreo(),"text/html");
             mbp.setDataHandler(new javax.activation.DataHandler(new ByteArrayDataSource(parametros.getTextoCorreo().toString(), Constantes.TEXT_HTML)));
  
             /**
              * Se agrega todas las partes al correo.
              */
             Multipart mp = new MimeMultipart();
             mp.addBodyPart(mbp);
             
             /**
              * Se adjunta los archivos al correo.
              */
             
             /*
             if (parametros.getAdjuntos() != null) {
                 String mime = "application/".trim() + parametros.getTipoAdjunto().trim();
                 MimeBodyPart attachment = new MimeBodyPart();
                 for (Map.Entry<String, byte[]> entry : parametros.getAdjuntos().entrySet()) {
                     String nombreArchivo = entry.getKey().toString().trim() + "." + parametros.getTipoAdjunto().trim();
                     byte[] adjunto = entry.getValue();
                     if (adjunto == null || nombreArchivo == null) {
                         continue;
                     }
  
                     ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(adjunto, mime);
                     attachment.setHeader(Constantes.CONTENT_TYPE, mime);
                     attachment.setDataHandler(new DataHandler(byteArrayDataSource));
                     attachment.setFileName(nombreArchivo);
                     mp.addBodyPart(attachment);
                 }
             } 
              */
             if (parametros.getAdjuntos() != null) {
            	 logger.info("getAdjuntos " + "");
                 String mime = "text/".trim() + parametros.getTipoAdjunto().trim();
                 MimeBodyPart attachment = new MimeBodyPart();
                 //MimeBodyPart attachment2 = new MimeBodyPart();

                 //attachment.attachFile("D:\\PROYECTOS\\C8INVERSIS\\LOG\\test.txt");
                
                 for (Map.Entry<String, byte[]> entry : parametros.getAdjuntos().entrySet()) {
                     //String nombreArchivo = entry.getKey().toString().trim() + "." + parametros.getTipoAdjunto().trim();
                     String nombreArchivo = entry.getKey().toString().trim() ;
                     byte[] adjunto = entry.getValue();
                     if (adjunto == null || nombreArchivo == null) {
                         continue;
                     }
                     /*
                     File f = new File("D:\\PROYECTOS\\C8INVERSIS\\LOG\\test.tx");
                     if( f.exists() ){
                        DataSource source = new FileDataSource( "D:\\PROYECTOS\\C8INVERSIS\\LOG\\test.tx" );
                        mbp.setDataHandler( new DataHandler(source) );
                        mbp.setFileName( f.getName() );
                        mbp.addBodyPart(attachment);
                     }
                     */
                     
                     logger.info("adjunto " + adjunto);
                     logger.info("nombreArchivo " + nombreArchivo);
                     logger.info("onstantes.CONTENT_TYPE " + Constantes.CONTENT_TYPE);
                     logger.info("mime " + mime);
                     logger.info("attachment " + attachment);
                      
                     //ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(adjunto, "application/xml");
                     attachment.setHeader(Constantes.CONTENT_TYPE, "text/txt");
                     //attachment.setDataHandler(new DataHandler(byteArrayDataSource));
                     attachment.setFileName(nombreArchivo);
                     attachment.attachFile("\\\\172.18.150.41/datamart\\test.txt");
                     mp.addBodyPart(attachment);

                     /*
                     attachment2.setHeader(Constantes.CONTENT_TYPE, "text/txt");
                     //attachment.setDataHandler(new DataHandler(byteArrayDataSource));
                     attachment2.setFileName(nombreArchivo);
                     attachment2.setFileName(nombreArchivo);
                     attachment2.attachFile("C:\\PROYECTOS\\C8INVERSIS\\LOG\\test.txt");
                     mp.addBodyPart(attachment2);
                     */

                 }
                
                 
             }
             
             //correo.setText(body);
             correo.setContent(mp);
             // System.out.println("success point 4");

	         Transport transport = session.getTransport("smtp");
	         // System.out.println("success point 5");

	         transport.connect(host, "cencosudweb.panel@gmail.com", "cencosud2017");
	         transport.sendMessage(correo, correo.getAllRecipients());
	         transport.close();
	    }
	    catch (MessagingException messagingException) {
            logger.error("Error al enviar el correo: ", messagingException);
            return false;
        } catch (Exception exception) {
            logger.error("Error al enviar el correo: ", exception);
            return false;
        }
        return true;
	  }
}