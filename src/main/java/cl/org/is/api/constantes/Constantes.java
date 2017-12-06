/**
 *@name Constantes 
 * 
 *@version 1.0 
 * 
 *@date 30-03-2017
 * 
 *@author Jose Garrido
 * 
 *@copyright Cencosud. All rights reserved.
 */

package cl.org.is.api.constantes;

/**
 * @description Clase que contiene todos los valores almacenados en constantes
 * necesarias para la aplicacion.
 * 
 */
public class Constantes {
	
	/** Constantes de la aplicacion */
	public static final String	APLICACION_NOMBRE					= "MIDDLEWARE CENCOSUD";
	
	public static final String	ASUNTO_CARGA_ARCHIVOS				= "CARGA DE ARCHIVOS CENCOSUD";
															
	public static final String	APLICACION_NOMBRE_CORTO				= "MIS";
															
	public static final String	XMLREQUEST						= "REQUEST";
															
	public static final String	XMLRESPONSE						= "RESPONSE";
															
	public static final String	TRANSACCION						= "TRANSACCION";
															
	public static final String	DIRECCIONIP						= "IP";
															
	public static final String	SERVICE							= "Servicio";
															
	public static final String	ACCEPT							= "Accept";
															
	public static final String	MENSAJE_EXITO						= "PROCESO FINALIZADO CORRECTAMENTE";
															
	public static final String	MENSAJE_EXITO2						= "PROCESO FINALIZADO CORRECTAMENTE, PERO NO HAY RESULTADOS PARA LOS DATOS ENVIADOS";
															
	public static final String	MENSAJE_ERROR						= "ERROR GENERAL";
															
	public static final String	CODIGO_EXITO						= "0";
															
	public static final String	CODIGO_EXITO2						= "1";
															
	public static final String	CODIGO_JOB						= "1";
															
	public static final String	CODIGO_ERROR						= "-1";
															
	public static final String	CODIGO_DIVISA						= "USD";
															
	public static final String	OK_BLOQUEO						= "SI";
															
	public static final String	NOK_BLOQUEO						= "NO";
															
	public static final String	LATIDO							= "latido";
															
	/** lookup de los EJB */
	
	public static final String	LOOKUPRECEPCIONSERVICE				= "java:global/MIS/RecepcionService!es.indra.ets.AdaptadorTib.XClienteInterfaceDocument";
															
	public static final String	LOOKUPMISMAIL						= "java:jboss/mail/MISMail";
															
	public static final String	PERSISTENCEUNIT1					= "persistenceUnit1";
															
	public static final String	PERSISTENCEUNIT2					= "persistenceUnit2";
															
	public static final String	PERSISTENCEUNIT3					= "persistenceUnit3";
															
	public static final String	PERSISTENCEUNIT4					= "persistenceUnit4";
															
	/** Nombres de archivos de configuracion */
	
	public static final String	CONFIGFILE						= "CONFIGFILE.xml";
															
	public static final String	RECEPCIONFILE						= "RECEPCION.xml";
															
	public static final String	PROPERTIESAPP						= "applicationMIS.properties";
															
	/** Informacion del correo*/
	
	public static final String	MAIL_FROM							= "from";
															
	public static final String	MAIL_FROM_NAME						= "from.name";
															
	public static final String	NOTIFICACION1						= "msg.email1";
															
	public static final String	NOTIFICACION2						= "msg.email2";
															
	public static final String	NOTIFICACION3						= "msg.email3";
	
	public static final String	NOTIFICACION4						= "msg.email4";
	
	public static final String	NOTIFICACION5						= "msg.email5";
	
	public static final String	NOTIFICACION6						= "msg.email6";
															
	/** Nombres de los key del properties */
	
	public static final String	FTPORIGEN1						= "ftpOrigen1";
															
	public static final String	FTPDESTINO1						= "ftpDestino1";
															
	public static final String	DESTINATIONFOLDER					= "destinationFolder";
															
	public static final String	SCHEDULE_DIA						= "dia";
															
	public static final String	EJECUCION_JOB						= "ejecutarJob";
															
	public static final String	SERVER_LDAP						= "serverLdap";
															
	public static final String	LLAVE_PUBLICA						= "llavePublica";
															
	public static final String	LLAVE_PRIVADA						= "llaveSecreta";
															
	public static final String	PASSWORDPGP						= "passphrase";
															
	public static final String	TIMER_NAME						= "TIMER";
															
	public static final String	DESKEY1							= "hexKey";
															
	public static final String	DESKEY2							= "hexKey2";
															
	public static final String	KEY_CODIGO_INTERNO					= "codigoInterno";
															
	public static final String	KEY_CODIGO_INSTITUCION				= "codigoInstitucion";
															
	public static final String	KEY_CODIGO_CUENTA_PROPIA				= "codigoCuentaPropia";
															
	public static final String	KEY_MAX_REINTENTOS					= "maxReintentos";
															
	public static final String	KEY_MAX_TIME_REINTENTOS				= "maxTiempoReintento";
															
	public static final String	KEY_ALTO_IMAGEN					= "altoImagen";
															
	public static final String	KEY_ANCHO_IMAGEN					= "anchoImagen";
															
	public static final String	KEY_DIRECTORIO_ENTRADA				= "directorioEntrada";
	
	public static final String	KEY_FILE_BATCH						= "archivoBatch";
	
	public static final String	SERVER							= "instancia";
	
	public static final String	KEY_FILE_BATCH_ERROR				= "rutaError";
	
	public static final String	KEY_FILE_BATCH_LOG					= "rutaLog";
															
	public static final String	KEY_DIRECTORIO_RESULTADO				= "directorioResultado";
															
	public static final String	KEY_TEXTO_CORREO					= "textoCorreo";
															
	public static final String	KEY_ASUNTO_CORREO					= "asuntoCorreo";
															
	/** Nombres de los adaptadores y servicio contra Inversis */
	
	public static final String	ADAPTADOR_CLIENTE					= "CLIENTE";
															
	public static final String	ADAPTADOR_RECEPCION					= "RECEPCION";
															
	public static final String	SERVICIO_CRUZADOS					= "CRUZADOS";
															
	public static final String	SERVICIO_ENVIOS					= "ENVIOS";
															
	public static final String	SERVICIO_SAFI						= "SAFI";
															
	public static final String	SERVICIO_SSO						= "SSO";
															
	public static final String	SERVICIO_ALTACUENTAMB				= "ALTACUENTAMB";
															
	public static final String	SERVICIO_ALTAUSUARIO				= "ALTAUSUARIO";
															
	public static final String	SERVICIO_ELIMREPANTESMB				= "ELIMREPANTESMB";
															
	public static final String	SERVICIO_MODDATOSCUENTAMB			= "MODDATOSCUENTAMB";
															
	public static final String	SERVICIO_MODDATOSUSUARIOMB			= "MODDATOSUSUARIOMB";
															
	public static final String	SERVICIO_MODESTADOMB				= "MODESTADOMB";
															
	public static final String	SERVICIO_ANELAUTORMB				= "ANELAUTORMB";
															
	public static final String	SERVICIO_BLOQUEOUSUARIO				= "BLOQUEOUSUARIO";
															
	public static final String	SERVICIO_MODIFICARFIRMA				= "MODIFICARFIRMA";
															
	public static final String	SERVICIO_SOLICITARFIRMA				= "SOLICITARFIRMA";
															
	public static final String	SERVICIO_BLOQUEARSALDO				= "BLOQUEARSALDO";
															
	public static final String	SERVICIO_PUBDESBLOQUEO				= "PUBDESBLOQUEO";
															
	public static final String	SERVICIO_PUBOPERACION				= "PUBOPERACION";
															
	public static final String	SERVICIO_PUBSITUORDEN				= "PUBSITUORDEN";
															
	public static final String	SERVICIO_RESPUESTABLOQUEO			= "RESPUESTABLOQUEO";
															
	public static final String	SERVICIO_SIMULARORDEN				= "SIMULARORDEN";
															
	public static final String	SERVICIO_ENTRADAORDENES				= "ENTRADAORDENES";
															
	public static final String	SERVICIO_CONSULTASALDODISPONIBLE		= "CONSULTASALDODISPONIBLE";
															
	public static final String	SERVICIO_CAMBIODIA					= "PUBCAMBIODIA";
															
	public static final String	SERVICIO_MBTESTASIN					= "MBTESTASIN";
															
	public static final String	SERVICIO_TRATARREENVIOS				= "TRATARREENVIOS";
															
	public static final String	SERVICIO_SIMULACIONALTATRASPASOS		= "SIMULACIONALTATRASPASOS";
															
	public static final String	SERVICIO_PUBEJECUCION				= "PUBEJECUCION";
															
	/** Nombres de los servicio de maestros */
	
	public static final String	SERVICIO_GETCANALES					= "GETCANALES";
															
	public static final String	SERVICIO_GETCATEGORIAETFS			= "GETCATEGORIAETFS";
															
	public static final String	SERVICIO_GETCATEGORIAFONDOS			= "GETCATEGORIAFONDOS";
															
	public static final String	SERVICIO_GETCLASEOPERACIONES			= "GETCLASEOPERACIONES";
															
	public static final String	SERVICIO_GETCLASEORDENES				= "GETCLASEORDENES";
															
	public static final String	SERVICIO_GETCNAE					= "GETCNAE";
															
	public static final String	SERVICIO_GETCORTEGESTORA				= "GETCORTEGESTORA";
															
	public static final String	SERVICIO_GETDIVISAS					= "GETDIVISAS";
															
	public static final String	SERVICIO_GETESTADOSCIVIL				= "GETESTADOSCIVIL";
															
	public static final String	SERVICIO_GETESTADOSCUENTA			= "GETESTADOSCUENTA";
															
	public static final String	SERVICIO_GETESTADOORDEN				= "GETESTADOORDEN";
															
	public static final String	SERVICIO_GETESTADOSTRASPASOORDEN		= "GETESTADOSTRASPASOORDEN";
															
	public static final String	SERVICIO_GETESTADOSVALOR				= "GETESTADOSVALOR";
															
	public static final String	SERVICIO_GETFAMILIAOPERACIONES		= "GETFAMILIAOPERACIONES";
															
	public static final String	SERVICIO_GETIDIOMAS					= "GETIDIOMAS";
															
	public static final String	SERVICIO_GETINSTRUCCIONESOPERACIONES	= "GETINSTRUCCIONESOPERACIONES";
															
	public static final String	SERVICIO_GETMERCADOS				= "GETMERCADOS";
															
	public static final String	SERVICIO_GETPAISES					= "GETPAISES";
															
	public static final String	SERVICIO_GETPERIODICIDAD				= "GETPERIODICIDAD";
															
	public static final String	SERVICIO_GETPROVINCIAS				= "GETPROVINCIAS";
															
	public static final String	SERVICIO_GETSECTORESCONTABLES			= "GETSECTORESCONTABLES";
															
	public static final String	SERVICIO_GETSECTORESVALORES			= "GETSECTORESVALORES";
															
	public static final String	SERVICIO_GETSEXO					= "GETSEXO";
															
	public static final String	SERVICIO_GETSUBCATEGORIAETFS			= "GETSUBCATEGORIAETFS";
															
	public static final String	SERVICIO_GETSUBMERCADOS				= "GETSUBMERCADOS";
															
	public static final String	SERVICIO_GETSUBYACENTESETFS			= "GETSUBYACENTESETFS";
															
	public static final String	SERVICIO_GETTERRITORIOFISCAL			= "GETTERRITORIOFISCAL";
															
	public static final String	SERVICIO_GETTERRITORIOIVA			= "GETTERRITORIOIVA";
															
	public static final String	SERVICIO_GETCOTIZACION				= "GETCOTIZACION";
															
	public static final String	SERVICIO_GETTIPOINSTRUCCIONESOPERACION	= "GETTIPOINSTRUCCIONESOPERACION";
															
	public static final String	SERVICIO_GETTIPOOPERACIONES			= "GETTIPOOPERACIONES";
															
	public static final String	SERVICIO_GETTIPOSALDO				= "GETTIPOSALDO";
															
	public static final String	SERVICIO_GETTIPOSALDOXPRODUCTO		= "GETTIPOSALDOXPRODUCTO";
															
	public static final String	SERVICIO_GETTIPOTARIFA				= "GETTIPOTARIFA";
															
	public static final String	SERVICIO_GETTIPOACTIVOS				= "GETTIPOACTIVOS";
															
	public static final String	SERVICIO_GETTIPODOCUMENTOS			= "GETTIPODOCUMENTOS";
															
	public static final String	SERVICIO_GETTIPOOPERACION			= "GETTIPOOPERACION";
															
	public static final String	SERVICIO_GETTIPOORDEN				= "GETTIPOORDEN";
															
	public static final String	SERVICIO_GETTIPOPRODUCTOS			= "GETTIPOPRODUCTOS";
															
	public static final String	SERVICIO_GETTIPOTITULARES			= "GETTIPOTITULARES";
															
	public static final String	SERVICIO_GETTIPOVIAS				= "GETTIPOVIAS";
															
	public static final String	SERVICIO_GETPLATAFORMA				= "GETPLATAFORMA";
															
	public static final String	SERVICIO_GETPRODUCTO				= "GETPRODUCTO";
															
	public static final String	SERVICIO_GETTRANSACCIONPRODUCTO		= "GETTRANSACCIONPRODUCTO";
															
	public static final String	SERVICIO_GETCUENTA					= "GETCUENTA";
	
	public static final String	SERVICIO_INFOGRUPO					= "INFOGRUPO";
															
	public static final String	SERVICIO_GETGESTORA					= "GETGESTORA";
															
	public static final String	SERVICIO_GETINSTRUMENTOS				= "GETINSTRUMENTOS";
															
	public static final String	SERVICIO_GETPRECIOINSTRUMENTO			= "GETPRECIOINSTRUMENTO";
															
	public static final String	SERVICIO_COMISION					= "GETCOMISION";
															
	public static final String	SERVICIO_COMISIONCLIENTE				= "GETCOMISIONCLIENTE";
															
	public static final String	SERVICIO_GETCUENTAINVERSIS			= "GETCUENTAINVERSIS";
															
	public static final String	SERVICIO_GETPATRIMONIO				= "GETPATRIMONIO";
															
	public static final String	SERVICIO_GETSOLICITUD				= "GETSOLICITUD";
															
	public static final String	SERVICIO_PUTSOLICITUD				= "PUTSOLICITUD";
															
	public static final String	SERVICIO_GETSALDO					= "GETSALDO";
															
	public static final String	SERVICIO_GETOPERACIONES				= "GETOPERACIONES";
															
	public static final String	SERVICIO_GETINFOCLIENTE				= "GETINFOCLIENTE";
															
	public static final String	SERVICIO_GETCUSTODIAVALORIZADA		= "GETCUSTODIAVALORIZADA";
															
	public static final String	SERVICIO_GETULTIMOMOVIMIENTO			= "GETULTIMOMOVIMIENTO";
															
	/** Tags y atributos de peticion/respuesta XML/JSON */
	
	public static final String	ACCION							= "ACCION";
															
	public static final String	ACEPTACION_BLOQUEO					= "ACEPTACION_BLOQUEO";
															
	public static final String	AGENTE							= "AGENTE";
															
	public static final String	AJUSTE_DECIMALES_PARTICIP			= "AJUSTE_DECIMALES_PARTICIP";
															
	public static final String	BASE_CALCULO						= "BASE_CALCULO";
															
	public static final String	BIC								= "BIC";
															
	public static final String	BODY								= "BODY";
															
	public static final String	CANAL							= "CANAL";
															
	public static final String	CANAL2							= "Canal";
															
	public static final String	CANAL_PREFERENCIA					= "CANAL_PREFERENCIA";
															
	public static final String	CANON_CONTRATACION					= "CANON_CONTRATACION";
															
	public static final String	CANON_CONTRATACION_EN_DIVISA			= "CANON_CONTRATACION_EN_DIVISA";
															
	public static final String	CANON_LIQUIDACION					= "CANON_LIQUIDACION";
															
	public static final String	CANON_LIQUIDACION_EN_DIVISA			= "CANON_LIQUIDACION_EN_DIVISA";
															
	public static final String	CATEGORIA_MIFID					= "CATEGORIA_MIFID";
															
	public static final String	CLASE_ORDEN						= "CLASE_ORDEN";
															
	public static final String	CLAVE_ACCESO						= "CLAVE_ACCESO";
															
	public static final String	CLAVE_ACCESO_PRE_EXPIRADA			= "CLAVE_ACCESO_PRE_EXPIRADA";
															
	public static final String	CLAVE_ACCESO_REPETIDA				= "CLAVE_ACCESO_REPETIDA";
															
	public static final String	CNAE								= "CNAE";
															
	public static final String	COD_CLASIFICACION_NORMATIVA			= "COD_CLASIFICACION_NORMATIVA";
															
	public static final String	COD_CUENTA_VALORES_EXTERNA_2			= "COD_CUENTA_VALORES_EXTERNA_2";
															
	public static final String	COD_CUENTA_VALORES_EXTERNA_3			= "COD_CUENTA_VALORES_EXTERNA_3";
															
	public static final String	COD_DET_INSTRUCCION_MASIVA			= "COD_DET_INSTRUCCION_MASIVA";
															
	public static final String	COD_DISCLAIM_FONDO_OTRA_ENTI			= "COD_DISCLAIM_FONDO_OTRA_ENTI";
															
	public static final String	COD_INT_CUENTA_EFECTIVO				= "COD_INT_CUENTA_EFECTIVO";
															
	public static final String	COD_OPERACION_REPO_CANCELAR			= "COD_OPERACION_REPO_CANCELAR";
															
	public static final String	COD_TIPO_COMP_DISCLAIMER_MIFID		= "COD_TIPO_COMP_DISCLAIMER_MIFID";
															
	public static final String	CODIGO							= "CODIGO";
															
	public static final String	CODIGO_CONDUCTA					= "CODIGO_CONDUCTA";
															
	public static final String	CODIGO_CTA_TRANSITORIA				= "CODIGO_CTA_TRANSITORIA";
															
	public static final String	CODIGO_CTA_TRANSITORIA_EXTERNA		= "CODIGO_CTA_TRANSITORIA_EXTERNA";
															
	public static final String	CODIGO_CUENTA_PROPIA				= "CODIGO_CUENTA_PROPIA";
															
	public static final String	CODIGO_CUENTA_PROPIA2				= "CodigoCuentaPropia";
															
	public static final String	CODIGO_CUENTA_VALORES				= "CODIGO_CUENTA_VALORES";
															
	public static final String	CODIGO_CUENTA_VALORES_EXTERNA			= "CODIGO_CUENTA_VALORES_EXTERNA";
															
	public static final String	CODIGO_CUENTA_VALORES_EXTERNA_2		= "CODIGO_CUENTA_VALORES_EXTERNA_2";
															
	public static final String	CODIGO_DISCLAIMER					= "CODIGO_DISCLAIMER";
															
	public static final String	CODIGO_DISCLAIMER_CHECK				= "CODIGO_DISCLAIMER_CHECK";
															
	public static final String	CODIGO_DIVISA_LIQUIDACION			= "CODIGO_DIVISA_LIQUIDACION";
															
	public static final String	CODIGO_ENTIDAD_CONTRAPARTIDA			= "CODIGO_ENTIDAD_CONTRAPARTIDA";
															
	public static final String	CODIGO_EXTERNO						= "CODIGO_EXTERNO";
															
	public static final String	CODIGO_ERROR_ESPECIFICO				= "CODIGOERRORESPECIFICO";
															
	public static final String	CODIGO_FORMA_CALCULO				= "CODIGO_FORMA_CALCULO";
															
	public static final String	CODIGO_HERRAMIENTA_EXTERNA			= "CODIGO_HERRAMIENTA_EXTERNA";
															
	public static final String	CODIGO_INCIDENCIA					= "CODIGO_INCIDENCIA";
															
	public static final String	CODIGO_INCLUIR_AGENTES				= "CODIGO_INCLUIR_AGENTES";
															
	public static final String	CODIGO_INSTITUCION					= "CODIGO_INSTITUCION";
															
	public static final String	CODIGO_INSTITUCION2					= "CodigoInstitucion";
															
	public static final String	CODIGO_INSTRUMENTO					= "CODIGO_INSTRUMENTO";
															
	public static final String	CODIGO_INSTRUMENTO_CONDICIONADO		= "CODIGO_INSTRUMENTO_CONDICIONADO";
															
	public static final String	CODIGO_INTERNO						= "CODIGO_INTERNO";
															
	public static final String	CODIGO_INTERNO2					= "CodigoInterno";
															
	public static final String	CODIGO_USUARIO						= "CodigoUsuario";
															
	public static final String	CODIGO_INTERNO_CTA_TRANSITORIA		= "CODIGO_INTERNO_CTA_TRANSITORIA";
															
	public static final String	CODIGO_INTERNO_TIPO_GESTION			= "CODIGO_INTERNO_TIPO_GESTION";
															
	public static final String	CODIGO_ISIN						= "CODIGO_ISIN";
															
	public static final String	ID_PRODUCTO						= "ID_PRODUCTO";
															
	public static final String	ID_CONCEPTO						= "ID_CONCEPTO";
															
	public static final String	CODIGO_INTERNO_VALOR				= "CODIGO_INTERNO_VALOR";
															
	public static final String	CODIGO_ISIN_CONDICIONADO				= "CODIGO_ISIN_CONDICIONADO";
															
	public static final String	CODIGO_MERCADO						= "CODIGO_MERCADO";
															
	public static final String	CODIGO_MERCADO_CONDICIONADO			= "CODIGO_MERCADO_CONDICIONADO";
															
	public static final String	CODIGO_MIEMBRO_MERCADO				= "CODIGO_MIEMBRO_MERCADO";
															
	public static final String	CODIGO_NORMATIVA					= "CODIGO_NORMATIVA";
															
	public static final String	CODIGO_PERFIL_RIESGO				= "CODIGO_PERFIL_RIESGO";
															
	public static final String	CODIGO_POSTAL						= "CODIGO_POSTAL";
															
	public static final String	CODIGO_RECHAZO						= "CODIGO_RECHAZO";
															
	public static final String	CODIGO_RESPUESTA					= "CODIGO_RESPUESTA";
															
	public static final String	CODIGO_RESPUESTA_INTERNO				= "CODIGO_RESPUESTA_INTERNO";
															
	public static final String	CODIGO_RESULTADO_MIFID				= "CODIGO_RESULTADO_MIFID";
															
	public static final String	CODIGO_ROL						= "CODIGO_ROL";
															
	public static final String	CODIGO_TARIFA						= "CODIGO_TARIFA";
															
	public static final String	CODIGO_TIPO_OPERACION				= "CODIGO_TIPO_OPERACION";
															
	public static final String	CODIGO_TIPO_PAGO					= "CODIGO_TIPO_PAGO";
															
	public static final String	CODIGO_TIPO_PERIODICIDAD				= "CODIGO_TIPO_PERIODICIDAD";
															
	public static final String	CODIGO_TIPO_PRODUCTO				= "CODIGO_TIPO_PRODUCTO";
															
	public static final String	CODIGO_TIPO_RIESGO					= "CODIGO_TIPO_RIESGO";
															
	public static final String	CODIGO_VER_AGENTES					= "CODIGO_VER_AGENTES";
															
	public static final String	COMISION_CEDIDA_INTERMEDIARIO			= "COMISION_CEDIDA_INTERMEDIARIO";
															
	public static final String	COMISION							= "COMISION";
															
	public static final String	MOVIMIENTO						= "MOVIMIENTO";
	
	public static final String	CLIENTE_INTEGRAL					= "CLIENTE_INTEGRAL";
															
	public static final String	COMISION_EMPRESA					= "COMISION_EMPRESA";
															
	public static final String	COMISION_EMPRESA_BONIFICADA			= "COMISION_EMPRESA_BONIFICADA";
															
	public static final String	COMISION_EMPRESA_BONIFICADA_DIV_LIQ	= "COMISION_EMPRESA_BONIFICADA_DIV_LIQ";
															
	public static final String	COMISION_EMPRESA_EN_DIVISA			= "COMISION_EMPRESA_EN_DIVISA";
															
	public static final String	COMISION_ENTIDAD_LIQUIDADORA			= "COMISION_ENTIDAD_LIQUIDADORA";
															
	public static final String	COMISION_ENTIDAD_LIQUIDADORA_EN_DIVISA	= "COMISION_ENTIDAD_LIQUIDADORA_EN_DIVISA";
															
	public static final String	COMISION_GESTION					= "COMISION_GESTION";
															
	public static final String	COMISION_MIEMBRO					= "COMISION_MIEMBRO";
															
	public static final String	COMISION_MIEMBRO_MERCADO_EN_DIVISA		= "COMISION_MIEMBRO_MERCADO_EN_DIVISA";
															
	public static final String	COMISION_MIEMBRO_MERCADO				= "COMISION_MIEMBRO_MERCADO";
															
	public static final String	CONSULTARSALDO						= "ConsultarSaldo";
															
	public static final String	COMISION_SUSCRIPCION				= "COMISION_SUSCRIPCION";
															
	public static final String	CONJUNTOBENEFICFINALES				= "CONJUNTOBENEFICFINALES";
															
	public static final String	CONJUNTODATOSCUENTAVALORES			= "CONJUNTODATOSCUENTAVALORES";
															
	public static final String	CONJUNTODATOSPARTICIPANTE			= "CONJUNTODATOSPARTICIPANTE";
															
	public static final String	CONJUNTODATOSPERSONA				= "CONJUNTODATOSPERSONA";
															
	public static final String	CONJUNTODATOSPRODUCTO				= "CONJUNTODATOSPRODUCTO";
															
	public static final String	CONJUNTONORMATIVASFISCALES			= "CONJUNTONORMATIVASFISCALES";
															
	public static final String	CONJUNTOPAISES_ADIC_FISC				= "CONJUNTOPAISES_ADIC_FISC";
															
	public static final String	CONJUNTOSOLICITANTES				= "CONJUNTOSOLICITANTES";
															
	public static final String	CONJUNTOTITULARES					= "CONJUNTOTITULARES";
															
	public static final String	CONTROL							= "CONTROL";
															
	public static final String	CORRETAJE_POLIZA					= "CORRETAJE_POLIZA";
															
	public static final String	COSTE_EN_EUROS_FISCAL				= "COSTE_EN_EUROS_FISCAL";
															
	public static final String	CTA_VALORES_ORI_RDTO				= "CTA_VALORES_ORI_RDTO";
															
	public static final String	CTA_VALORES_EXTERNA_ORI_RDTO			= "CTA_VALORES_EXTERNA_ORI_RDTO";
															
	public static final String	CUENTA_CARGO_ABONO					= "CUENTA_CARGO_ABONO";
															
	public static final String	CUENTA_PAGO						= "CUENTA_PAGO";
															
	public static final String	CUPON_CORRIDO						= "CUPON_CORRIDO";
															
	public static final String	DATOSBENEFICIARIO					= "DATOSBENEFICIARIO";
															
	public static final String	DATOSBLOQUEO						= "DATOSBLOQUEO";
															
	public static final String	DATOSCUENTA						= "DATOSCUENTA";
															
	public static final String	DATOSCUENTABANCARIA					= "DATOSCUENTABANCARIA";
															
	public static final String	DATOSCUENTACLIENTE					= "DATOSCUENTACLIENTE";
															
	public static final String	DATOSCUENTACLIENTE2					= "DatosCuentaCliente";
															
	public static final String	DATOSCUENTAEFECTIVO					= "DATOSCUENTAEFECTIVO";
															
	public static final String	DATOSCUENTAEFECTIVO2				= "DatosCuentaEfectivo";
															
	public static final String	DATOSCUENTAVALORES					= "DATOSCUENTAVALORES";
															
	public static final String	DATOSDESTINO						= "DATOSDESTINO";
															
	public static final String	DATOSDOMICILIO						= "DATOSDOMICILIO";
															
	public static final String	DATOSDOMICILIO_CORRES				= "DATOSDOMICILIO_CORRES";
															
	public static final String	DATOSDOMICILIO_CORRESPONDENCIA		= "DATOSDOMICILIO_CORRESPONDENCIA";
															
	public static final String	DATOSDOMICILIO_FISCAL				= "DATOSDOMICILIO_FISCAL";
															
	public static final String	DATOSENTRADA						= "DATOSENTRADA";
															
	public static final String	DATOSINSTRUMENTO					= "DATOSINSTRUMENTO";
															
	public static final String	DATOSMENOR						= "DATOSMENOR";
															
	public static final String	DATOSNORMATIVAFISCAL				= "DATOSNORMATIVAFISCAL";
															
	public static final String	DATOSOPERACION						= "DATOSOPERACION";
															
	public static final String	DATOSORDEN						= "DATOSORDEN";
															
	public static final String	DATOSORDENANTE						= "DATOSORDENANTE";
															
	public static final String	DATOSORIGEN						= "DATOSORIGEN";
															
	public static final String	DATOSPARTICIPANTE					= "DATOSPARTICIPANTE";
															
	public static final String	DATOSPERSONA						= "DATOSPERSONA";
															
	public static final String	DATOSPERSONA2						= "DatosPersona";
															
	public static final String	DATOSPERFIL						= "DATOSPERFIL";
															
	public static final String	DATOSPRODUCTO						= "DATOSPRODUCTO";
															
	public static final String	DATOSREENVIOMENSAJES				= "DATOSREENVIOMENSAJES";
															
	public static final String	DATOSRENTAFIJA						= "DATOSRENTAFIJA";
															
	public static final String	DATOSREPRESENTADO					= "DATOSREPRESENTADO";
															
	public static final String	DATOSSALIDA						= "DATOSSALIDA";
															
	public static final String	DATOSTARJETA						= "DATOSTARJETA";
															
	public static final String	DATOSTIPOENVIO						= "DATOSTIPOENVIO";
															
	public static final String	DATOSTRASPASO						= "DATOSTRASPASO";
															
	public static final String	DATOSTRASPASOIIC					= "DATOSTRASPASOIIC";
															
	public static final String	DATOSUSUARIO						= "DATOSUSUARIO";
															
	public static final String	DC_CCV							= "DC_CCV";
															
	public static final String	DES_ENTIDAD_CONTRAPARTIDA			= "DES_ENTIDAD_CONTRAPARTIDA";
															
	public static final String	DESCRIPCION						= "DESCRIPCION";
															
	public static final String	DESCRIPCION_AGENTE					= "DESCRIPCION_AGENTE";
															
	public static final String	DESCRIPCION_EJECUTIVO				= "DESCRIPCION_EJECUTIVO";
															
	public static final String	DESCRIPCION_FORMA_CALCULO			= "DESCRIPCION_FORMA_CALCULO";
															
	public static final String	DESCRIPCION_INTERMEDIARIO			= "DESCRIPCION_INTERMEDIARIO";
															
	public static final String	DESCRIPCION_LARGA					= "DESCRIPCION_LARGA";
															
	public static final String	DESCRIPCION_PLAZO					= "DESCRIPCION_PLAZO";
															
	public static final String	DESCRIPCION_RESPUESTA				= "DESCRIPCION_RESPUESTA";
															
	public static final String	DESCRIPCION_ERROR_ESPECIFICO			= "DESCRIPCIONERRORESPECIFICO";
															
	public static final String	DESCRIPCION_RESULTADO_MIFID			= "DESCRIPCION_RESULTADO_MIFID";
															
	public static final String	DESCRIPCION_SUCURSAL				= "DESCRIPCION_SUCURSAL";
															
	public static final String	DESCRIPCION_TIPO_PAGO				= "DESCRIPCION_TIPO_PAGO";
															
	public static final String	DESCRIPCION_TIPO_RIESGO				= "DESCRIPCION_TIPO_RIESGO";
															
	public static final String	DESTINATARIO						= "DESTINATARIO";
															
	public static final String	DIA_PRIMERA_ORDEN_PERIODICA			= "DIA_PRIMERA_ORDEN_PERIODICA";
															
	public static final String	DIGITO_CONTROL						= "DIGITO_CONTROL";
															
	public static final String	DIVISA							= "DIVISA";
															
	public static final String	DIVISA_CARGO_ABONO					= "DIVISA_CARGO_ABONO";
															
	public static final String	DIVISA_LIQUIDACION					= "DIVISA_LIQUIDACION";
															
	public static final String	DIVISA_OPERACION					= "DIVISA_OPERACION";
															
	public static final String	DURACION_ORDEN						= "DURACION_ORDEN";
															
	public static final String	EFECTIVO							= "EFECTIVO";
															
	public static final String	EFECTIVO_A_VENCIMIENTO				= "EFECTIVO_A_VENCIMIENTO";
															
	public static final String	EFECTIVO_A_VENCIMIENTO_EN_DIVISA		= "EFECTIVO_A_VENCIMIENTO_EN_DIVISA";
															
	public static final String	EFECTIVO_BRUTO						= "EFECTIVO_BRUTO";
															
	public static final String	EFECTIVO_BRUTO_SIMULADO				= "EFECTIVO_BRUTO_SIMULADO";
															
	public static final String	EFECTIVO_BRUTO_SIMULADO_EN_DIVISA		= "EFECTIVO_BRUTO_SIMULADO_EN_DIVISA";
															
	public static final String	EFECTIVO_CARGO_ABONO				= "EFECTIVO_CARGO_ABONO";
															
	public static final String	EFECTIVO_HIST						= "EFECTIVO_HIST";
															
	public static final String	EFECTIVO_NETO						= "EFECTIVO_NETO";
															
	public static final String	EFECTIVO_NETO_EN_DIVISA				= "EFECTIVO_NETO_EN_DIVISA";
															
	public static final String	EFECTIVO_ORDEN						= "EFECTIVO_ORDEN";
															
	public static final String	EFECTIVO_RECOMPRA					= "EFECTIVO_RECOMPRA";
															
	public static final String	EJECUTIVO							= "EJECUTIVO";
															
	public static final String	EMAIL							= "EMAIL";
															
	public static final String	ENTIDAD_CCV						= "ENTIDAD_CCV";
															
	public static final String	ENTIDAD_CENTRO_COMPENSADOR			= "ENTIDAD_CENTRO_COMPENSADOR";
															
	public static final String	ENTIDAD_DEPOSITARIA					= "ENTIDAD_DEPOSITARIA";
															
	public static final String	ENTIDAD_DEPOSITARIA_DESTINO			= "ENTIDAD_DEPOSITARIA_DESTINO";
															
	public static final String	ENTIDAD_LIQUIDADORA					= "ENTIDAD_LIQUIDADORA";
															
	public static final String	ENTIDAD_MIEMBRO					= "ENTIDAD_MIEMBRO";
															
	public static final String	ESTADO							= "ESTADO";
															
	public static final String	ESTADO_ACTUAL						= "ESTADO_ACTUAL";
															
	public static final String	ESTADO_CIVIL						= "ESTADO_CIVIL";
															
	public static final String	ESTADO_OPERACION					= "ESTADO_OPERACION";
															
	public static final String	ESTADO_GESTORA						= "ESTADO_GESTORA";
															
	public static final String	FAMILIA_PRODUCTO					= "FAMILIA_PRODUCTO";
															
	public static final String	FEC_VAL_HIST						= "FEC_VAL_HIST";
															
	public static final String	FECHA							= "FECHA";
															
	public static final String	FECHA_AUDITORIA					= "FECHA_AUDITORIA";
															
	public static final String	FECHA_CADUC_CERTI_RESI				= "FECHA_CADUC_CERTI_RESI";
															
	public static final String	FECHA_CADUCIDAD_DOCUMENTO			= "FECHA_CADUCIDAD_DOCUMENTO";
															
	public static final String	FECHA_CADUCIDAD_NO_RESIDENTE			= "FECHA_CADUCIDAD_NO_RESIDENTE";
															
	public static final String	FECHA_CANCELACION					= "FECHA_CANCELACION";
															
	public static final String	FECHA_COTIZACION					= "FECHA_COTIZACION";
															
	public static final String	FECHA_EJECUCION					= "FECHA_EJECUCION";
															
	public static final String	FECHA_FIN_CONDICIONADA				= "FECHA_FIN_CONDICIONADA";
															
	public static final String	FECHA_FIN_VIGENCIA					= "FECHA_FIN_VIGENCIA";
															
	public static final String	FECHA_HORA						= "FECHA_HORA";
															
	public static final String	FECHA_HORA_EJECUCION				= "FECHA_HORA_EJECUCION";
															
	public static final String	FECHA_INI_COMISION_GESTION			= "FECHA_INI_COMISION_GESTION";
															
	public static final String	FECHA_INICIO_VIGENCIA				= "FECHA_INICIO_VIGENCIA";
															
	public static final String	FECHA_LIQUIDACION					= "FECHA_LIQUIDACION";
															
	public static final String	FECHA_LIQUIDACION_MERCADO			= "FECHA_LIQUIDACION_MERCADO";
															
	public static final String	FECHA_LIMITE						= "FECHA_LIMITE";
															
	public static final String	FECHA_NACIMIENTO_O_CONSTITUCION		= "FECHA_NACIMIENTO_O_CONSTITUCION";
															
	public static final String	FECHA_OPERACION					= "FECHA_OPERACION";
															
	public static final String	FECHA_ORDEN						= "FECHA_ORDEN";
															
	public static final String	FECHA_ULT_ACT						= "FECHA_ULT_ACT";
															
	public static final String	FECHA_VALOR						= "FECHA_VALOR";
															
	public static final String	FECHA_DESDE						= "FECHA_DESDE";
															
	public static final String	FECHA_HASTA						= "FECHA_HASTA";
															
	public static final String	FECHA_VENCIMIENTO					= "FECHA_VENCIMIENTO";
															
	public static final String	FECHA_VENCIMIENTO_REPO				= "FECHA_VENCIMIENTO_REPO";
															
	public static final String	FIRMA							= "FIRMA";
															
	public static final String	FIXING							= "FIXING";
															
	public static final String	FRECUENCIA						= "FRECUENCIA";
															
	public static final String	GASTOS_MERCADO						= "GASTOS_MERCADO";
															
	public static final String	GASTOS_MERCADO_EN_DIVISA				= "GASTOS_MERCADO_EN_DIVISA";
															
	public static final String	GIIN								= "GIIN";
															
	public static final String	GRADO_MINUSVALIA					= "GRADO_MINUSVALIA";
															
	public static final String	GRADO_MINUSVALIA_FISICA				= "GRADO_MINUSVALIA_FISICA";
															
	public static final String	GRADO_MINUSVALIA_PSIQUICA			= "GRADO_MINUSVALIA_PSIQUICA";
															
	public static final String	HORA								= "HORA";
															
	public static final String	HORA_AUDITORIA						= "HORA_AUDITORIA";
															
	public static final String	HORA_CONTACTO						= "HORA_CONTACTO";
															
	public static final String	HORA_COTIZACION					= "HORA_COTIZACION";
															
	public static final String	HORA_EJECUCION						= "HORA_EJECUCION";
															
	public static final String	HORA_ORDEN						= "HORA_ORDEN";
															
	public static final String	HORA_ULT_ACT						= "HORA_ULT_ACT";
															
	public static final String	IBAN								= "IBAN";
															
	public static final String	IBAN_CT							= "IBAN_CT";
															
	public static final String	IDENTIF_TIPO_COMP_MIFID				= "IDENTIF_TIPO_COMP_MIFID";
															
	public static final String	IDENTIFICADOR						= "IDENTIFICADOR";
															
	public static final String	IDENTIFICADOR_MENSAJE				= "IDENTIFICADOR_MENSAJE";
															
	public static final String	IDIOMA							= "IDIOMA";
															
	public static final String	IDIOMA2							= "Idioma";
															
	public static final String	IMPORTE							= "IMPORTE";
															
	public static final String	IMPORTE_A_BLOQUEAR					= "IMPORTE_A_BLOQUEAR";
															
	public static final String	IMPORTE_BASE_RETENCION				= "IMPORTE_BASE_RETENCION";
															
	public static final String	IMPORTE_EFECTIVO_INICIAL				= "IMPORTE_EFECTIVO_INICIAL";
															
	public static final String	IMPORTE_FIJO_TARIFA					= "IMPORTE_FIJO_TARIFA";
															
	public static final String	IMPORTE_GARANTIAS					= "IMPORTE_GARANTIAS";
															
	public static final String	IMPORTE_IMPUESTO_SOBRE_TRANS			= "IMPORTE_IMPUESTO_SOBRE_TRANS";
															
	public static final String	IMPORTE_RETE_DEST_JURI				= "IMPORTE_RETE_DEST_JURI";
															
	public static final String	IMPORTE_RETE_DEST_JURI_INSTI			= "IMPORTE_RETE_DEST_JURI_INSTI";
															
	public static final String	IMPUESTOS_SOBRE_GASTOS				= "IMPUESTOS_SOBRE_GASTOS";
															
	public static final String	IMPUESTOS_SOBRE_GASTOS_EN_DIVISA		= "IMPUESTOS_SOBRE_GASTOS_EN_DIVISA";
															
	public static final String	IND_ACCESO_COTI					= "IND_ACCESO_COTI";
															
	public static final String	IND_ACCION_DEFECTO_HECHOS			= "IND_ACCION_DEFECTO_HECHOS";
															
	public static final String	IND_BLOQUEO_OPERACION				= "IND_BLOQUEO_OPERACION";
															
	public static final String	IND_CADUCIDAD_DOCUMENTO				= "IND_CADUCIDAD_DOCUMENTO";
															
	public static final String	IND_CERTIFICADO_ESPECIAL				= "IND_CERTIFICADO_ESPECIAL";
															
	public static final String	IND_CHECK_OBLIGATORIO				= "IND_CHECK_OBLIGATORIO";
															
	public static final String	IND_COMUNICA_CLIENTE				= "IND_COMUNICA_CLIENTE";
															
	public static final String	IND_CONTINUIDAD_TRANS				= "IND_CONTINUIDAD_TRANS";
															
	public static final String	IND_DISCLAIM_FONDO_OTRA_ENTI			= "IND_DISCLAIM_FONDO_OTRA_ENTI";
															
	public static final String	IND_DISCLAIMER_ADECUADO				= "IND_DISCLAIMER_ADECUADO";
															
	public static final String	IND_DISCLAIMER_INSTI				= "IND_DISCLAIMER_INSTI";
															
	public static final String	IND_DIVISA_IMPORTE_FIJO				= "IND_DIVISA_IMPORTE_FIJO";
															
	public static final String	IND_ISIN_ENOTRO_COMERCIALIZ			= "IND_ISIN_ENOTRO_COMERCIALIZ";
															
	public static final String	IND_OPERACION_TRANSACCIONAL			= "IND_OPERACION_TRANSACCIONAL";
															
	public static final String	IND_ORIGEN_DATOS_MIFID				= "IND_ORIGEN_DATOS_MIFID";
															
	public static final String	IND_PERMITIR_BONIFICACION			= "IND_PERMITIR_BONIFICACION";
															
	public static final String	IND_PRODUCTO_COMPLEJO				= "IND_PRODUCTO_COMPLEJO";
															
	public static final String	IND_RENUNCIA_DOCUMENTACION			= "IND_RENUNCIA_DOCUMENTACION";
															
	public static final String	IND_TEXTO_VERIFICACION_MIFID			= "IND_TEXTO_VERIFICACION_MIFID";
															
	public static final String	IND_TRAMO_TARIFA					= "IND_TRAMO_TARIFA";
															
	public static final String	IND_VIGENCIA_MIFID					= "IND_VIGENCIA_MIFID";
															
	public static final String	INDICADOR_BLOQUEO					= "INDICADOR_BLOQUEO";
															
	public static final String	INDICADOR_CERTIFICADO_ADQ			= "INDICADOR_CERTIFICADO_ADQ";
															
	public static final String	INDICADOR_FISCAL_MULTIPAIS			= "INDICADOR_FISCAL_MULTIPAIS";
															
	public static final String	INDICADOR_IMPUESTO_TRANSACCION		= "INDICADOR_IMPUESTO_TRANSACCION";
															
	public static final String	INDICADOR_ORDEN_DIA					= "INDICADOR_ORDEN_DIA";
															
	public static final String	INDICADOR_RECHAZADA					= "INDICADOR_RECHAZADA";
															
	public static final String	INDICADOR_RETENCION_COMPLEMENTARIA		= "INDICADOR_RETENCION_COMPLEMENTARIA";
															
	public static final String	INDICADOR_USUARIO_ASOCIADO			= "INDICADOR_USUARIO_ASOCIADO";
															
	public static final String	INTERESES_DEVENGADOS				= "INTERESES_DEVENGADOS";
															
	public static final String	INTERESES_DEVENGADOS_EN_DIVISA		= "INTERESES_DEVENGADOS_EN_DIVISA";
															
	public static final String	INTERMEDIARIO						= "INTERMEDIARIO";
															
	public static final String	LOCALIDAD							= "LOCALIDAD";
															
	public static final String	NUEVA_FIRMA						= "NUEVA_FIRMA";
															
	public static final String	MERCADO							= "MERCADO";
															
	public static final String	DATOSMERCADO						= "DATOSMERCADO";
															
	public static final String	MIFID_TIPO_ASESORAMIENTO				= "MIFID_TIPO_ASESORAMIENTO";
															
	public static final String	MODO_ENVIO						= "MODO_ENVIO";
															
	public static final String	MOTIVO							= "MOTIVO";
															
	public static final String	MOTIVO_ESTADO						= "MOTIVO_ESTADO";
															
	public static final String	NACIONALIDAD						= "NACIONALIDAD";
															
	public static final String	NAME								= "NAME";
															
	public static final String	NIF_COMERCIALIZADOR					= "NIF_COMERCIALIZADOR";
															
	public static final String	NIVEL_CONFIDENCIALIDAD				= "NIVEL_CONFIDENCIALIDAD";
															
	public static final String	NOMBRE_CALLE						= "NOMBRE_CALLE";
															
	public static final String	NOMBRE_O_RAZONSOCIAL				= "NOMBRE_O_RAZONSOCIAL";
															
	public static final String	NOMBRE_PERSONA						= "NOMBRE_PERSONA";
															
	public static final String	NOMINAL							= "NOMINAL";
															
	public static final String	NUEVO_COD_CUENTA_VALORES_EXT			= "NUEVO_COD_CUENTA_VALORES_EXT";
															
	public static final String	NUEVO_NUM_SECUENCIA					= "NUEVO_NUM_SECUENCIA";
															
	public static final String	NUEVO_NUMERO_DOCUMENTO				= "NUEVO_NUMERO_DOCUMENTO";
															
	public static final String	NUEVO_TIPO_DOCUMENTO				= "NUEVO_TIPO_DOCUMENTO";
															
	public static final String	NUM_SECUENCIA						= "NUM_SECUENCIA";
															
	public static final String	NUMERO							= "NUMERO";
															
	public static final String	NUMERO_CALLE						= "NUMERO_CALLE";
															
	public static final String	NUMERO_CUENTA						= "NUMERO_CUENTA";
															
	public static final String	NUMERO_CUENTA_EFECTIVO				= "NUMERO_CUENTA_EFECTIVO";
															
	public static final String	NUMERO_CUENTA_EFECTIVO2				= "NUMEROCUENTAEFECTIVO";
															
	public static final String	NUMERO_CUENTA_OTRA_ENT				= "NUMERO_CUENTA_OTRA_ENT";
															
	public static final String	NUMERO_CUENTA_VALORES				= "NUMERO_CUENTA_VALORES";
															
	public static final String	NUMERO_CUENTA_VALORES_EXTERNA			= "NUMERO_CUENTA_VALORES_EXTERNA";
															
	public static final String	NUMERO_CUENTA_VALORES_EXTERNA2		= "NumeroCuentaValoresExterna";
															
	public static final String	NUMERO_DOCUMENTO					= "NUMERO_DOCUMENTO";
															
	public static final String	NUMERO_DOCUMENTO2					= "NumeroDocumento";
															
	public static final String	NUMERO_DOCUMENTO_USUARIO				= "NUMERO_DOCUMENTO_USUARIO";
															
	public static final String	NUMERO_DOCUMENTO_ORDENANTE			= "NUMERO_DOCUMENTO_ORDENANTE";
															
	public static final String	NUMERO_DOCUMENTO_REPR_LEGAL			= "NUMERO_DOCUMENTO_REPR_LEGAL";
															
	public static final String	NUMERO_OPERACION					= "NUMERO_OPERACION";
															
	public static final String	NUMERO_TITULOS_EJECUTADOS			= "NUMERO_TITULOS_EJECUTADOS";
															
	public static final String	NUMERO_TITULOS_ORDEN				= "NUMERO_TITULOS_ORDEN";
															
	public static final String	OBSERVACIONES						= "OBSERVACIONES";
															
	public static final String	OBSERVACIONES_SICAV					= "OBSERVACIONES_SICAV";
															
	public static final String	OPERACION_AJUSTE_RETENCIONES			= "OPERACION_AJUSTE_RETENCIONES";
															
	public static final String	OPERACION_RELACIONADA				= "OPERACION_RELACIONADA";
															
	public static final String	ORDENANTE							= "ORDENANTE";
															
	public static final String	ORIGEN_REBALANCEO					= "ORIGEN_REBALANCEO";
															
	public static final String	OTROS_CARGOS						= "OTROS_CARGOS";
															
	public static final String	OTROS_CARGOS_EN_DIVISA				= "OTROS_CARGOS_EN_DIVISA";
															
	public static final String	PAIS								= "PAIS";
															
	public static final String	PAIS_FISCAL						= "PAIS_FISCAL";
															
	public static final String	PAIS_FISCAL2						= "PaisFiscal";
															
	public static final String	PAIS_FISCAL_ORDENANTE				= "PAIS_FISCAL_ORDENANTE";
															
	public static final String	PAIS_NACIM_O_DOMIC_SOCIAL			= "PAIS_NACIM_O_DOMIC_SOCIAL";
															
	public static final String	PAIS_NORMATIVA						= "PAIS_NORMATIVA";
															
	public static final String	PAIS_RESIDENCIA_REPR_LEGAL			= "PAIS_RESIDENCIA_REPR_LEGAL";
															
	public static final String	PASSWORD							= "PASSWORD";
															
	public static final String	PASSWORD_PRE_EXPIRADA				= "PASSWORD_PRE_EXPIRADA";
															
	public static final String	PERFIL_DISTRIBUCION					= "PERFIL_DISTRIBUCION";
															
	public static final String	PETICION							= "PETICION";
															
	public static final String	PRODUCTO							= "PRODUCTO";
															
	public static final String	LIST								= "LISTA";
															
	public static final String	PLAZO							= "PLAZO";
															
	public static final String	PLATAFORMA						= "PLATAFORMA";
															
	public static final String	TIPO_RESCATE						= "TIPO_RESCATE";
															
	public static final String	INSTRUMENTO						= "INSTRUMENTO";
															
	public static final String	INSTRUMENTO_ORIGEN					= "INSTRUMENTO_ORIGEN";
															
	public static final String	INSTRUMENTO_DESTINO					= "INSTRUMENTO_DESTINO";
															
	public static final String	INSTRUMENTOPK						= "INSTRUMENTOPK";
															
	public static final String	COMISIONPK						= "COMISIONPK";
															
	public static final String	PLAZO_DIAS						= "PLAZO_DIAS";
															
	public static final String	PORC_BONIFICACION					= "PORC_BONIFICACION";
															
	public static final String	PORC_MAX_BONIFICACION				= "PORC_MAX_BONIFICACION";
															
	public static final String	PORC_TARIFA						= "PORC_TARIFA";
															
	public static final String	PORC_TITULARIDAD					= "PORC_TITULARIDAD";
															
	public static final String	PORCENTAJE_CONDICIONADO				= "PORCENTAJE_CONDICIONADO";
															
	public static final String	PRECIO_CON_CUPON					= "PRECIO_CON_CUPON";
															
	public static final String	PRECIO_CONDICIONADO					= "PRECIO_CONDICIONADO";
															
	public static final String	PRECIO_COTIZACION					= "PRECIO_COTIZACION";
															
	public static final String	PRECIO_EJECUCION					= "PRECIO_EJECUCION";
															
	public static final String	PRECIO_EX_CUPON					= "PRECIO_EX_CUPON";
															
	public static final String	PRECIO_EXCUPON						= "PRECIO_EXCUPON";
															
	public static final String	PRECIO_BRUTO						= "PRECIO_BRUTO";
															
	public static final String	PRECIO_NETO						= "PRECIO_NETO";
															
	public static final String	PRECIO_ORDEN						= "PRECIO_ORDEN";
															
	public static final String	PREFIJO_INTERNAC					= "PREFIJO_INTERNAC";
															
	public static final String	PRIMER_APELLIDO					= "PRIMER_APELLIDO";
															
	public static final String	PROVINCIA							= "PROVINCIA";
															
	public static final String	PROVINCIA_FISCAL					= "PROVINCIA_FISCAL";
															
	public static final String	RATIO_CONVERSION					= "RATIO_CONVERSION";
															
	public static final String	RATIO_CONVERSION_EMPRESA				= "RATIO_CONVERSION_EMPRESA";
															
	public static final String	REF_EXT_REPO_CANCELAR				= "REF_EXT_REPO_CANCELAR";
															
	public static final String	REFERENCIA_ADICIONAL_HERR			= "REFERENCIA_ADICIONAL_HERR";
															
	public static final String	REFERENCIA_ANULACION				= "REFERENCIA_ANULACION";
															
	public static final String	REFERENCIA_APLICACION_COLAS			= "REFERENCIA_APLICACION_COLAS";
															
	public static final String	REFERENCIA_EXTERNA_ADICIONAL			= "REFERENCIA_EXTERNA_ADICIONAL";
															
	public static final String	REFERENCIA_CASAR_ORDENES				= "REFERENCIA_CASAR_ORDENES";
															
	public static final String	REFERENCIA_GRUPO_ORDENES				= "REFERENCIA_GRUPO_ORDENES";
															
	public static final String	REFERENCIA_OPERACION				= "REFERENCIA_OPERACION";
															
	public static final String	REFERENCIA_OPERACION_INSTRUCCION		= "REFERENCIA_OPERACION_INSTRUCCION";
															
	public static final String	REFERENCIA_ORDEN					= "REFERENCIA_ORDEN";
															
	public static final String	REFERENCIA_ORDEN_CASADA				= "REFERENCIA_ORDEN_CASADA";
															
	public static final String	REFERENCIA_ORDEN_EXT_HERR			= "REFERENCIA_ORDEN_EXT_HERR";
															
	public static final String	REFERENCIA_ORDEN_EXTERNA				= "REFERENCIA_ORDEN_EXTERNA";
															
	public static final String	REFERENCIA_REPO_CANCELAR				= "REFERENCIA_REPO_CANCELAR";
															
	public static final String	REFERENCIA_TRASPASO					= "REFERENCIA_TRASPASO";
															
	public static final String	REINTENTO							= "REINTENTO";
															
	public static final String	RESIDUAL_ENTITY					= "RESIDUAL_ENTITY";
															
	public static final String	RESPUESTA_BACKOFFICE				= "RESPUESTA_BACKOFFICE";
															
	public static final String	RESPUESTA_EJECUCION					= "ResultadosEjecucion";
															
	public static final String	RESPUESTA_BLOQUEO					= "RESPUESTA_BLOQUEO";
															
	public static final String	RESPUESTA_CAS						= "RESPUESTA_CAS";
															
	public static final String	RESTO_DATOS						= "RESTO_DATOS";
															
	public static final String	RESULTADO_FISCAL					= "RESULTADO_FISCAL";
															
	public static final String	RESULTADO_OPERACION					= "RESULTADO_OPERACION";
															
	public static final String	RETENCION_DESTINO					= "RETENCION_DESTINO";
															
	public static final String	RETENCION_ORIGEN					= "RETENCION_ORIGEN";
															
	public static final String	RETENER							= "RETENER";
															
	public static final String	SALDO							= "SALDO";
															
	public static final String	SECUENCIA_FIN						= "SECUENCIA_FIN";
															
	public static final String	SECUENCIA_INICIO					= "SECUENCIA_INICIO";
															
	public static final String	SEGUNDO_APELLIDO					= "SEGUNDO_APELLIDO";
															
	public static final String	SEGURIDAD							= "SEGURIDAD";
															
	public static final String	SERVICIO							= "SERVICIO";
															
	public static final String	SEXO								= "SEXO";
															
	public static final String	SIGNO_RESULTADO_FISCAL				= "SIGNO_RESULTADO_FISCAL";
															
	public static final String	SIGNO_RESULTADO_OPERACION			= "SIGNO_RESULTADO_OPERACION";
															
	public static final String	SITUACION_PERSONAL					= "SITUACION_PERSONAL";
															
	public static final String	SOLICITANTE						= "SOLICITANTE";
															
	public static final String	SOLICITUD							= "SOLICITUD";
															
	public static final String	INFOCLIENTE						= "INFOCLIENTE";
															
	public static final String	GESTORA							= "GESTORA";
															
	public static final String	SUBMERCADO						= "SUBMERCADO";
															
	public static final String	SUBSISTEMA_CONTRATACION				= "SUBSISTEMA_CONTRATACION";
															
	public static final String	SUCURSAL							= "SUCURSAL";
															
	public static final String	SUCURSAL_CCV						= "SUCURSAL_CCV";
															
	public static final String	TAE								= "TAE";
															
	public static final String	TASAS_MERCADO						= "TASAS_MERCADO";
															
	public static final String	TASAS_MERCADO_EN_DIVISA				= "TASAS_MERCADO_EN_DIVISA";
															
	public static final String	TELEFONO							= "TELEFONO";
															
	public static final String	TERRITORIO_IVA						= "TERRITORIO_IVA";
															
	public static final String	TEXTO_VERIFICACION_MIFID_CLI			= "TEXTO_VERIFICACION_MIFID_CLI";
															
	public static final String	TICKER							= "TICKER";
															
	public static final String	TICKER_CONDICIONADO					= "TICKER_CONDICIONADO";
															
	public static final String	TIN								= "TIN";
															
	public static final String	TIN_NIF							= "TIN_NIF";
															
	public static final String	TIPO								= "TIPO";
															
	public static final String	TIPO_ACCION						= "TIPO_ACCION";
															
	public static final String	TIPO_ACTIVO						= "TIPO_ACTIVO";
															
	public static final String	TIPO_BENEFICIARIO					= "TIPO_BENEFICIARIO";
															
	public static final String	TIPO_BONIFICACION					= "TIPO_BONIFICACION";
															
	public static final String	TIPO_CALCULO						= "TIPO_CALCULO";
															
	public static final String	TIPO_COMPARACION					= "TIPO_COMPARACION";
															
	public static final String	TIPO_CONFIRMACION					= "TIPO_CONFIRMACION";
															
	public static final String	TIPO_COTIZACION					= "TIPO_COTIZACION";
															
	public static final String	TIPO_CUENTA						= "TIPO_CUENTA";
															
	public static final String	TIPO_CUENTA_MIFID					= "TIPO_CUENTA_MIFID";
															
	public static final String	TIPO_DOCUMENTO						= "TIPO_DOCUMENTO";
															
	public static final String	TIPO_DOCUMENTO2					= "TipoDocumento";
															
	public static final String	TIPO_DOCUMENTO_ORDENANTE				= "TIPO_DOCUMENTO_ORDENANTE";
															
	public static final String	TIPO_DOCUMENTO_REPR_LEGAL			= "TIPO_DOCUMENTO_REPR_LEGAL";
															
	public static final String	TIPO_FIRMA						= "TIPO_FIRMA";
															
	public static final String	TIPO_INTERES						= "TIPO_INTERES";
															
	public static final String	TIPO_LEGAL						= "TIPO_LEGAL";
															
	public static final String	TIPO_MENSAJE						= "TIPO_MENSAJE";
															
	public static final String	TIPO_ORDEN						= "TIPO_ORDEN";
															
	public static final String	TIPO_PAGO							= "TIPO_PAGO";
															
	public static final String	TIPO_PRODUCTO						= "TIPO_PRODUCTO";
															
	public static final String	TIPO_RIESGO_MIFID					= "TIPO_RIESGO_MIFID";
															
	public static final String	TIPO_RIESGO_MIFID_ORDEN				= "TIPO_RIESGO_MIFID_ORDEN";
															
	public static final String	TIPO_RIESGO_MIFID_PROD				= "TIPO_RIESGO_MIFID_PROD";
															
	public static final String	TIPO_TARIFA						= "TIPO_TARIFA";
															
	public static final String	TIPO_TITULAR						= "TIPO_TITULAR";
															
	public static final String	TIPO_TRANSACCION					= "TIPO_TRANSACCION";
															
	public static final String	TIPO_VIA							= "TIPO_VIA";
															
	public static final String	TIR								= "TIR";
															
	public static final String	TIR_CON_CUPON						= "TIR_CON_CUPON";
															
	public static final String	TIR_EX_CUPON						= "TIR_EX_CUPON";
															
	public static final String	TITULAR							= "TITULAR";
															
	public static final String	TITULOS							= "TITULOS";
															
	public static final String	TITULOS_MOSTRAR					= "TITULOS_MOSTRAR";
															
	public static final String	TITULOS_OCULTOS					= "TITULOS_OCULTOS";
															
	public static final String	TITULOS_ORDEN						= "TITULOS_ORDEN";
															
	public static final String	TOKEN							= "TOKEN";
															
	public static final String	TOTAL_PARCIAL						= "TOTAL_PARCIAL";
															
	public static final String	USUARIO							= "USUARIO";
															
	public static final String	USUARIO_ASOCIADO					= "USUARIO_ASOCIADO";
															
	public static final String	USUARIO_SSO						= "USUARIO_SSO";
															
	public static final String	VALORACION_2005					= "VALORACION_2005";
															
	public static final String	VALORACION_2006					= "VALORACION_2006";
															
	public static final String	STRINGDATE						= "date";
															
	public static final String	TEXT_HTML							= "text/html";
															
	public static final String	CONTENT_TYPE						= "Content-Type";
															
	public final static String	APPLICATION_JSON_ENCODE				= "application/json; charset=UTF-8";
															
	public static final String	DOMINIO							= "GRP_SECURITY\\";
}
