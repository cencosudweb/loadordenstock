/**
 *@name InicializarMIS 
 * 
 *@version 1.0 
 * 
 *@date 03 de Julio de 2015 
 * 
 *@author Cesar Machado 
 * 
 *@copyright Inversiones Security. All rights reserved.
 */

package cl.org.is.api.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


import org.apache.log4j.Logger;

import cl.org.is.api.constantes.Constantes;

/**
 * @description clase que carga todos las transacciones y las deja en cache. Carga el archivo de propiedades.
 * 			 carga la programacion de los Job y carga el objeto listener que recibira las peticiones desde Inversis.
 */

public class InicializarMIS {
	
	/** Variable que gestiona la impresion del log */
	
	private static Logger			logger		= Logger.getLogger(InicializarMIS.class);
											
	/** 
								
	/** Objeto de propiedades */
	//static Properties				properties	= null;
	private static Properties properties	= null;
	
	 public String getFilePathToSave() {

			Properties prop = new Properties();
			String filePath = "";

			try {

			  InputStream inputStream =
			    getClass().getClassLoader().getResourceAsStream("applicationMIS.properties");

			  prop.load(inputStream);
			  filePath = prop.getProperty("horaLimpiarJob");

		        } catch (IOException e) {
				e.printStackTrace();
			}

			return filePath;

		  }

								
	/**
	* metodo inicial que se ejecuta cuando inicia la aplicacion para realizar tareas requerida para la aplicacion
	* 
	*/
	public void init() throws Exception {
		
		logger.info(""+this.getClass());
		
		/** buscar todas las transacciones para que queden almacenadas en cache */
		cargarEntitys();
		
		/** Se carga el archivo de propiedades */
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(Constantes.PROPERTIESAPP);
		
		//InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("cl.org.is.api.util/"+Constantes.PROPERTIESAPP);
		logger.info("InputStream is: " + inputStream.toString());
		
		properties = new Properties();
		
		
		/** cargar el inputStream con archivo de propiedades */
		getProperties().load(inputStream);
		
		/** Metodo que activa el listener TIBCO para recibir las peticion enviada por TIBCO */
		//this.activatorlistenerRecepcionServices();
		
		logger.info("Fin:" + "");
	}
	
	/**
	* metodo que inicializa el listener que recibira las peticiones desde Inversis 
	* 
	*/
	/*
	private void activatorlistenerRecepcionServices() {
		
		logger.info("");
		
		String adaptador = Constantes.ADAPTADOR_RECEPCION;
		String servicio = Constantes.SERVICIO_ENVIOS;
		
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(Constantes.RECEPCIONFILE);
				
		try
		{
		} catch (Exception e)
		{
			logger.info("Error al crear el adaptador de recepcion");
			e.printStackTrace();
		}
		
		logger.info("Fin:" + "");
	}
	*/
	/**
	* Metodo que carga desde la base de datos todos los entitys  
	* que seran usado en la aplicacion y quedan cargada en cache de segundo nivel.
	*/
	private void cargarEntitys() {
		
		logger.info("");
		
		try
		{
			// se cargan las transacciones en cache
			
		} catch (Exception e)
		{
			logger.error("Algo fallo en la carga de los entitys de la aplicacion");
			e.printStackTrace();
		}
		
		logger.info("Fin:" + "");
	}
	
	/**
	* metodo Get y Set del objeto Properties
	* 
	*/
	public static String getPropiedad(String key) {
		
		logger.info("");
		String resp= null;
		try
		{
			logger.info("Propiedad obtenida " + key + " => " + getProperties().getProperty(key));
			 resp = getProperties().getProperty(key);
		} catch (Exception e)
		{
			logger.error("Algo fallo en getPropiedad()");
			e.printStackTrace();
		}
		
		logger.info("Fin:" + "");
		return resp;
	}
	
	public static Properties getProperties() {
		
		return properties;
	}
}