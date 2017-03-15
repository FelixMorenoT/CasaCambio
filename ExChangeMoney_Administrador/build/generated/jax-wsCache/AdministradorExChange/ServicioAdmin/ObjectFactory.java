
package ServicioAdmin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ServicioAdmin package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarConversion_QNAME = new QName("http://Servicio/", "ActualizarConversion");
    private final static QName _ActualizarConversionResponse_QNAME = new QName("http://Servicio/", "ActualizarConversionResponse");
    private final static QName _EliminarConversion_QNAME = new QName("http://Servicio/", "EliminarConversion");
    private final static QName _EliminarConversionResponse_QNAME = new QName("http://Servicio/", "EliminarConversionResponse");
    private final static QName _InsercionConversion_QNAME = new QName("http://Servicio/", "InsercionConversion");
    private final static QName _InsercionConversionResponse_QNAME = new QName("http://Servicio/", "InsercionConversionResponse");
    private final static QName _MostrarConversion_QNAME = new QName("http://Servicio/", "MostrarConversion");
    private final static QName _MostrarConversionResponse_QNAME = new QName("http://Servicio/", "MostrarConversionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ServicioAdmin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarConversion }
     * 
     */
    public ActualizarConversion createActualizarConversion() {
        return new ActualizarConversion();
    }

    /**
     * Create an instance of {@link ActualizarConversionResponse }
     * 
     */
    public ActualizarConversionResponse createActualizarConversionResponse() {
        return new ActualizarConversionResponse();
    }

    /**
     * Create an instance of {@link EliminarConversion }
     * 
     */
    public EliminarConversion createEliminarConversion() {
        return new EliminarConversion();
    }

    /**
     * Create an instance of {@link EliminarConversionResponse }
     * 
     */
    public EliminarConversionResponse createEliminarConversionResponse() {
        return new EliminarConversionResponse();
    }

    /**
     * Create an instance of {@link InsercionConversion }
     * 
     */
    public InsercionConversion createInsercionConversion() {
        return new InsercionConversion();
    }

    /**
     * Create an instance of {@link InsercionConversionResponse }
     * 
     */
    public InsercionConversionResponse createInsercionConversionResponse() {
        return new InsercionConversionResponse();
    }

    /**
     * Create an instance of {@link MostrarConversion }
     * 
     */
    public MostrarConversion createMostrarConversion() {
        return new MostrarConversion();
    }

    /**
     * Create an instance of {@link MostrarConversionResponse }
     * 
     */
    public MostrarConversionResponse createMostrarConversionResponse() {
        return new MostrarConversionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ActualizarConversion")
    public JAXBElement<ActualizarConversion> createActualizarConversion(ActualizarConversion value) {
        return new JAXBElement<ActualizarConversion>(_ActualizarConversion_QNAME, ActualizarConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ActualizarConversionResponse")
    public JAXBElement<ActualizarConversionResponse> createActualizarConversionResponse(ActualizarConversionResponse value) {
        return new JAXBElement<ActualizarConversionResponse>(_ActualizarConversionResponse_QNAME, ActualizarConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "EliminarConversion")
    public JAXBElement<EliminarConversion> createEliminarConversion(EliminarConversion value) {
        return new JAXBElement<EliminarConversion>(_EliminarConversion_QNAME, EliminarConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "EliminarConversionResponse")
    public JAXBElement<EliminarConversionResponse> createEliminarConversionResponse(EliminarConversionResponse value) {
        return new JAXBElement<EliminarConversionResponse>(_EliminarConversionResponse_QNAME, EliminarConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsercionConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "InsercionConversion")
    public JAXBElement<InsercionConversion> createInsercionConversion(InsercionConversion value) {
        return new JAXBElement<InsercionConversion>(_InsercionConversion_QNAME, InsercionConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsercionConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "InsercionConversionResponse")
    public JAXBElement<InsercionConversionResponse> createInsercionConversionResponse(InsercionConversionResponse value) {
        return new JAXBElement<InsercionConversionResponse>(_InsercionConversionResponse_QNAME, InsercionConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "MostrarConversion")
    public JAXBElement<MostrarConversion> createMostrarConversion(MostrarConversion value) {
        return new JAXBElement<MostrarConversion>(_MostrarConversion_QNAME, MostrarConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "MostrarConversionResponse")
    public JAXBElement<MostrarConversionResponse> createMostrarConversionResponse(MostrarConversionResponse value) {
        return new JAXBElement<MostrarConversionResponse>(_MostrarConversionResponse_QNAME, MostrarConversionResponse.class, null, value);
    }

}
