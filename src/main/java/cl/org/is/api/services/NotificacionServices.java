/**
 * @name NotificacionServices
 * 
 * @version 1.0
 *
 * @date 11 de Septiembre de 2015
 * 
 * @author cmachado
 * 
 * @copyright Inversiones Security. All rights reserved.
 */

package cl.org.is.api.services;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;

/*
import cl.com.is.common.exception.AdvertenciaFuncionalException;
import cl.com.is.common.exception.ErrorOperacionalException;
import cl.com.is.common.exception.ISException;
import cl.com.is.common.exception.ManejadorException;
*/
import cl.com.is.common.mail.CuerpoCorreo;
import cl.com.is.common.mail.ParametrosCorreo;

//import cl.com.is.common.util.MetaCode;

import cl.org.is.api.constantes.Constantes;
import cl.org.is.api.util.Correo;
import cl.org.is.api.util.InicializarMIS;

/**
 * @description Clase que implementa todas aquellas notificaciones necesarias dentro de la aplicacion que son de tipo correo
*/

public class NotificacionServices {
	
	private static final Logger	logger	= Logger.getLogger(NotificacionServices.class);
	
	/**
	 * Objeto que envia el correo
	 */
	private Correo				correo;
	
	/**
	 * Parametros del correo: cuerpo, asunto, etc
	 */
	private ParametrosCorreo		parametrosCorreo;
	
	/**
	 * Metodo que realiza el envio de un correo electronico
	 * 
	 * @param String transaccion ques e esta ejecutando
	 * @param String[] destinatarios a quien se le enviara correo
	 * @param String cuerpo del correo
	 */
	public void enviarCorreo(String transaccion, String[] destinatarios, String textoCorreo, String asunto, Map<String, byte[]> adjuntos, String tipoAdjunto) {
	
		logger.info("enviarCorreo");
		//final String origen = "", tipoTransaccion = "", tipoObjeto = "", aplicacion = Constantes.APLICACION_NOMBRE, plataforma = "";
		final String origen = "";
		logger.info("origen"+origen);
		try
		{
			parametrosCorreo = new ParametrosCorreo();
			
			getParametrosCorreo().setDestinatarios(destinatarios);
			getParametrosCorreo().setAsunto(asunto);
			getParametrosCorreo().setTextoCorreo(CuerpoCorreo.textoCorreo(textoCorreo));
			
			if(adjuntos !=null && !adjuntos.isEmpty()){
				getParametrosCorreo().setAdjuntos(adjuntos);
				getParametrosCorreo().setTipoAdjunto(tipoAdjunto);
			}
						
			enviar(transaccion, parametrosCorreo);
			
		} catch (Exception ex)
		{
			logger.error("AdvertenciaFuncionalException: " + ex.getMessage());
			ex.getStackTrace();
			/*
			ISException e = ManejadorException.manejar(transaccion, origen, tipoTransaccion,
					tipoObjeto, aplicacion, plataforma, ex);
			if (e instanceof ErrorOperacionalException)
			{
				logger.error("ErrorOperacionalException: " + ex.getMessage());
				ex.getStackTrace();
			} else
				if (e instanceof AdvertenciaFuncionalException)
				{
					logger.error("AdvertenciaFuncionalException: " + ex.getMessage());
					ex.getStackTrace();
				} else
					if (e instanceof ISException)
					{
						logger.error("ISException: " + ex.getMessage());
						ex.getStackTrace();
					}
			*/
		}
		
		logger.info("Fin:" + "");
	}
	
	/**
	 * Método que agrega los parametros de conexión para enviar el correo, así
	 * como algunos datos del correo
	 * 
	 * @param ParametrosCorreo todos los parametros necesarios para enviar el correo
	 * @throws ISException
	 */
	private boolean enviar(String transaccion, ParametrosCorreo parametrosCorreo)
			throws IOException {
	
		logger.info("enviar");
		
		//final String origen = MetaCode.getMethodName(), tipoTransaccion = ISException.TIPO_TRANSACCION_APP, tipoObjeto = ISException.TIPO_OBJETO_CLASE, aplicacion = Constantes.APLICACION_NOMBRE, plataforma = "";
		final String origen = "";
		logger.info("origen"+origen);
		boolean result = false;
		correo = new Correo();
		
		try
		{
			parametrosCorreo.setRemitente(InicializarMIS.getPropiedad(Constantes.MAIL_FROM));
			parametrosCorreo.setNombreRemitente(InicializarMIS
					.getPropiedad(Constantes.MAIL_FROM_NAME));
			
			result = correo.enviarCorreo2(parametrosCorreo);
			
		} catch (Exception ex)
		{
			logger.error("AdvertenciaFuncionalException2: " + ex.getMessage());
			ex.getStackTrace();
			/*
			ISException e = ManejadorException.manejar(transaccion, origen, tipoTransaccion,
					tipoObjeto, aplicacion, plataforma, ex);
			if (e instanceof ErrorOperacionalException)
			{
				throw ((ErrorOperacionalException) e);
			} else
				if (e instanceof AdvertenciaFuncionalException)
				{
					throw ((AdvertenciaFuncionalException) e);
				} else
					if (e instanceof ISException)
					{
						throw (e);
					}
			*/
		}
		
		logger.info("Respuesta del envio de correo:" + result);
		logger.info("Fin:" + "");
		return result;
	}
	
	public Correo getCorreo() {
	
		return correo;
	}
	
	public void setCorreo(Correo correo) {
	
		this.correo = correo;
	}
	
	public ParametrosCorreo getParametrosCorreo() {
	
		return parametrosCorreo;
	}
	
	public void setParametrosCorreo(ParametrosCorreo parametrosCorreo) {
	
		this.parametrosCorreo = parametrosCorreo;
	}
	
}
