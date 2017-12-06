/**
 *@name Transacciones 
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
* @description Clase que define las transacciones de la aplicacion
*/

public class Transacciones {
	
	/**
	 * Transacciones relacionadas con Inversis
	*/
	public static final String	ENVIO							= "1";
	public static final String	RECEPCION							= "2";
	public static final String	SERVICIO_SSO						= "3";
	public static final String	SERVICIO_ALTACUENTAMB				= "4";
	public static final String	SERVICIO_ALTAUSUARIO				= "5";
	public static final String	SERVICIO_ELIMREPANTESMB				= "6";
	public static final String	SERVICIO_MODDATOSCUENTAMB			= "7";
	public static final String	SERVICIO_MODDATOSUSUARIOMB			= "8";
	public static final String	SERVICIO_MODESTADOMB				= "9";
	public static final String	SERVICIO_ANELAUTORMB				= "10";
	public static final String	SERVICIO_BLOQUEOUSUARIO				= "11";
	public static final String	SERVICIO_BLOQUEARSALDO				= "12";
	public static final String	SERVICIO_PUBDESBLOQUEO				= "13";
	public static final String	SERVICIO_PUBOPERACION				= "14";
	public static final String	SERVICIO_PUBSITUORDEN				= "15";
	public static final String	SERVICIO_RESPUESTABLOQUEO			= "16";
	public static final String	SERVICIO_CAMBIODIA					= "17";
	public static final String	SERVICIO_MBESTASIN					= "18";
	public static final String	SERVICIO_TRATARREENVIOS				= "19";
	public static final String	SERVICIO_SOLICITARFIRMA				= "20";
	public static final String	SERVICIO_MODIFICARFIRMA				= "21";
	public static final String	SERVICIO_SIMULARORDEN				= "22";
	public static final String	SERVICIO_ENTRADAORDENES				= "23";
	public static final String	SERVICIO_CONSULTASALDODISPONIBLE		= "24";
	public static final String	SERVICIO_SIMULACIONALTATRASPASOS		= "25";
	public static final String	SERVICIO_PUBEJECUCION				= "26";
	public static final String	COPIAR_ARCHIVOS					= "27";
	public static final String	VALIDAR_LATIDO					     = "83";
	
	/**
	 * Transacciones de Master y Services
	*/
	public static final String	SERVICIO_GETCANALES					= "28";
	public static final String	SERVICIO_GETCATEGORIAETFS			= "29";
	public static final String	SERVICIO_GETCATEGORIAFONDOS			= "30";
	public static final String	SERVICIO_GETCLASEOPERACIONES			= "31";
	public static final String	SERVICIO_GETCLASEORDENES				= "32";
	public static final String	SERVICIO_GETCNAE					= "33";
	public static final String	SERVICIO_GETCORTEGESTORA				= "34";
	public static final String	SERVICIO_GETDIVISAS					= "35";
	public static final String	SERVICIO_GETESTADOSCIVIL				= "36";
	public static final String	SERVICIO_GETESTADOSCUENTA			= "37";
	public static final String	SERVICIO_GETESTADOORDEN				= "38";
	public static final String	SERVICIO_GETESTADOSTRASPASOORDEN		= "39";
	public static final String	SERVICIO_GETESTADOSVALOR				= "40";
	public static final String	SERVICIO_GETFAMILIAOPERACIONES		= "41";
	public static final String	SERVICIO_GETIDIOMAS					= "42";
	public static final String	SERVICIO_GETINSTRUCCIONESOPERACIONES	= "43";
	public static final String	SERVICIO_GETMERCADOS				= "44";
	public static final String	SERVICIO_GETPAISES					= "45";
	public static final String	SERVICIO_GETPERIODICIDAD				= "46";
	public static final String	SERVICIO_GETPROVINCIAS				= "47";
	public static final String	SERVICIO_GETSECTORESCONTABLES			= "48";
	public static final String	SERVICIO_GETSECTORESVALORES			= "49";
	public static final String	SERVICIO_GETSEXO					= "50";
	public static final String	SERVICIO_GETSUBCATEGORIAETFS			= "51";
	public static final String	SERVICIO_GETSUBMERCADOS				= "52";
	public static final String	SERVICIO_GETSUBYACENTESETFS			= "53";
	public static final String	SERVICIO_GETTERRITORIOFISCAL			= "54";
	public static final String	SERVICIO_GETTERRITORIOIVA			= "55";
	public static final String	SERVICIO_GETCOTIZACION				= "56";
	public static final String	SERVICIO_GETTIPOINSTRUCCIONESOPERACION	= "57";
	public static final String	SERVICIO_GETTIPOOPERACIONES			= "58";
	public static final String	SERVICIO_GETTIPOSALDO				= "59";
	public static final String	SERVICIO_GETTIPOSALDOXPRODUCTO		= "60";
	public static final String	SERVICIO_GETTIPOTARIFA				= "61";
	public static final String	SERVICIO_GETTIPOACTIVOS				= "62";
	public static final String	SERVICIO_GETTIPODOCUMENTOS			= "63";
	public static final String	SERVICIO_GETTIPOOPERACION			= "64";
	public static final String	SERVICIO_GETTIPOORDEN				= "65";
	public static final String	SERVICIO_GETTIPOPRODUCTOS			= "66";
	public static final String	SERVICIO_GETTIPOTITULARES			= "67";
	public static final String	SERVICIO_GETTIPOVIAS				= "68";
	public static final String	SERVICIO_GETPLATAFORMA				= "69";
	public static final String	SERVICIO_GETPRODUCTO				= "70";
	public static final String	SERVICIO_GETTRANSACCIONPRODUCTO		= "71";
	public static final String	SERVICIO_GETCUENTA					= "72";
	public static final String	SERVICIO_GETPATRIMONIO				= "73";
	public static final String	SERVICIO_GETSOLICITUD				= "74";
	public static final String	SERVICIO_PUTSOLICITUD				= "75";
	public static final String	SERVICIO_GETSALDO					= "76";
	public static final String	SERVICIO_GETOPERACIONES				= "77";
	public static final String	SERVICIO_GETCUENTAINVERSIS			= "78";
	public static final String	SERVICIO_GETINFOCLIENTE				= "79";
	public static final String	SERVICIO_GETGESTORA					= "80";
	public static final String	SERVICIO_GETINSTRUMENTOS				= "81";
	public static final String	SERVICIO_GETPRECIOINSTRUMENTO			= "82";
	public static final String	SERVICIO_COMISION					= "84"; //OJO EL 83 FUE CREADO ARRIBA!!!
	public static final String	SERVICIO_GETCUSTODIAVALORIZADA		= "85";
	public static final String	SERVICIO_GETULTIMOMOVIMIENTO		     = "86";
	public static final String	SERVICIO_COMISIONCLIENTE				= "87"; 
	public static final String	SERVICIO_LDAP					     = "88";
	public static final String	SERVICIO_VERIFICACLIENTE				= "89";
	public static final String	SERVICIO_INFOGRUPO					= "90";
	
}
