/**
 * @name ParametrosCorreo
 * 
 * @version 1.0
 *
 * @date 11 de Septiembre de 2015
 * 
 * @author cmachado
 * 
 * @copyright Inversiones Security. All rights reserved.
 */
package cl.com.is.common.mail;

import java.util.Map;


/**
 * @description Clase que implementa todas aquellas notificaciones necesarias dentro de la aplicacion que son de tipo correo
*/
public class ParametrosCorreo {
	
	private String[] destinatarios;
	private String remitente;
	private String nombreRemitente;
	private String[] copias;
	private String[] ocultas;
	private String asunto;
	private String textoCorreo;
	private Map<String, byte[]> adjuntos;
	private String tipoAdjunto;
	
	/**
	 * @return the destinatarios
	 */
	public String[] getDestinatarios() {
		return destinatarios;
	}
	/**
	 * @param destinatarios2 the destinatarios to set
	 */
	public void setDestinatarios(String[] destinatarios) {
		this.destinatarios = destinatarios;
	}
	/**
	 * @return the remitente
	 */
	public String getRemitente() {
		return remitente;
	}
	/**
	 * @param remitente the remitente to set
	 */
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	/**
	 * @return the nombreRemitente
	 */
	public String getNombreRemitente() {
		return nombreRemitente;
	}
	/**
	 * @param nombreRemitente the nombreRemitente to set
	 */
	public void setNombreRemitente(String nombreRemitente) {
		this.nombreRemitente = nombreRemitente;
	}
	/**
	 * @return the copias
	 */
	public String[] getCopias() {
		return copias;
	}
	/**
	 * @param copias the copias to set
	 */
	public void setCopias(String[] copias) {
		this.copias = copias;
	}
	/**
	 * @return the ucultas
	 */
	public String[] getOcultas() {
		return ocultas;
	}
	/**
	 * @param ucultas the ucultas to set
	 */
	public void setOcultas(String[] ocultas) {
		this.ocultas = ocultas;
	}
	/**
	 * @return the asunto
	 */
	public String getAsunto() {
		return asunto;
	}
	/**
	 * @param asunto the asunto to set
	 */
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	/**
	 * @return the textoCorreo
	 */
	public String getTextoCorreo() {
		return textoCorreo;
	}
	/**
	 * @param textoCorreo the textoCorreo to set
	 */
	public void setTextoCorreo(String textoCorreo) {
		this.textoCorreo = textoCorreo;
	}
	/**
	 * @return the adjunto
	 */
	public Map<String, byte[]> getAdjuntos() {
		return adjuntos;
	}
	/**
	 * @param adjunto the adjunto to set
	 */
	public void setAdjuntos(Map<String, byte[]> adjuntos) {
		this.adjuntos = adjuntos;
	}
	/**
	 * @return the tipoAdjunto
	 */
	public String getTipoAdjunto() {
		return tipoAdjunto;
	}
	/**
	 * @param tipoAdjunto the tipoAdjunto to set
	 */
	public void setTipoAdjunto(String tipoAdjunto) {
		this.tipoAdjunto = tipoAdjunto;
	}
	
	

}
