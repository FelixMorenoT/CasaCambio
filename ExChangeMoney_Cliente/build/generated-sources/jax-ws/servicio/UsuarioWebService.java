
package servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UsuarioWebService", targetNamespace = "http://Servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UsuarioWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "EliminarUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EliminarUsuario", targetNamespace = "http://Servicio/", className = "servicio.EliminarUsuario")
    @ResponseWrapper(localName = "EliminarUsuarioResponse", targetNamespace = "http://Servicio/", className = "servicio.EliminarUsuarioResponse")
    @Action(input = "http://Servicio/UsuarioWebService/EliminarUsuarioRequest", output = "http://Servicio/UsuarioWebService/EliminarUsuarioResponse")
    public boolean eliminarUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "InsertarUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "InsertarUsuario", targetNamespace = "http://Servicio/", className = "servicio.InsertarUsuario")
    @ResponseWrapper(localName = "InsertarUsuarioResponse", targetNamespace = "http://Servicio/", className = "servicio.InsertarUsuarioResponse")
    @Action(input = "http://Servicio/UsuarioWebService/InsertarUsuarioRequest", output = "http://Servicio/UsuarioWebService/InsertarUsuarioResponse")
    public boolean insertarUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IniciarSesion")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "IniciarSesion", targetNamespace = "http://Servicio/", className = "servicio.IniciarSesion")
    @ResponseWrapper(localName = "IniciarSesionResponse", targetNamespace = "http://Servicio/", className = "servicio.IniciarSesionResponse")
    @Action(input = "http://Servicio/UsuarioWebService/IniciarSesionRequest", output = "http://Servicio/UsuarioWebService/IniciarSesionResponse")
    public boolean iniciarSesion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ActualizarUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ActualizarUsuario", targetNamespace = "http://Servicio/", className = "servicio.ActualizarUsuario")
    @ResponseWrapper(localName = "ActualizarUsuarioResponse", targetNamespace = "http://Servicio/", className = "servicio.ActualizarUsuarioResponse")
    @Action(input = "http://Servicio/UsuarioWebService/ActualizarUsuarioRequest", output = "http://Servicio/UsuarioWebService/ActualizarUsuarioResponse")
    public boolean actualizarUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}