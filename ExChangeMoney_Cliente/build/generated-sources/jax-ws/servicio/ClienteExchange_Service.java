
package servicio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ClienteExchange", targetNamespace = "http://Servicio/", wsdlLocation = "http://localhost:8080/ClienteExchange/ClienteExchange?wsdl")
public class ClienteExchange_Service
    extends Service
{

    private final static URL CLIENTEEXCHANGE_WSDL_LOCATION;
    private final static WebServiceException CLIENTEEXCHANGE_EXCEPTION;
    private final static QName CLIENTEEXCHANGE_QNAME = new QName("http://Servicio/", "ClienteExchange");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ClienteExchange/ClienteExchange?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTEEXCHANGE_WSDL_LOCATION = url;
        CLIENTEEXCHANGE_EXCEPTION = e;
    }

    public ClienteExchange_Service() {
        super(__getWsdlLocation(), CLIENTEEXCHANGE_QNAME);
    }

    public ClienteExchange_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLIENTEEXCHANGE_QNAME, features);
    }

    public ClienteExchange_Service(URL wsdlLocation) {
        super(wsdlLocation, CLIENTEEXCHANGE_QNAME);
    }

    public ClienteExchange_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLIENTEEXCHANGE_QNAME, features);
    }

    public ClienteExchange_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClienteExchange_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClienteExchange
     */
    @WebEndpoint(name = "ClienteExchangePort")
    public ClienteExchange getClienteExchangePort() {
        return super.getPort(new QName("http://Servicio/", "ClienteExchangePort"), ClienteExchange.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClienteExchange
     */
    @WebEndpoint(name = "ClienteExchangePort")
    public ClienteExchange getClienteExchangePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicio/", "ClienteExchangePort"), ClienteExchange.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTEEXCHANGE_EXCEPTION!= null) {
            throw CLIENTEEXCHANGE_EXCEPTION;
        }
        return CLIENTEEXCHANGE_WSDL_LOCATION;
    }

}
