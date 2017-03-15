
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
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

    private final static QName _CalculoConversion_QNAME = new QName("http://Servicio/", "CalculoConversion");
    private final static QName _CalculoConversionResponse_QNAME = new QName("http://Servicio/", "CalculoConversionResponse");
    private final static QName _Monedas_QNAME = new QName("http://Servicio/", "Monedas");
    private final static QName _MonedasResponse_QNAME = new QName("http://Servicio/", "MonedasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculoConversion }
     * 
     */
    public CalculoConversion createCalculoConversion() {
        return new CalculoConversion();
    }

    /**
     * Create an instance of {@link CalculoConversionResponse }
     * 
     */
    public CalculoConversionResponse createCalculoConversionResponse() {
        return new CalculoConversionResponse();
    }

    /**
     * Create an instance of {@link Monedas }
     * 
     */
    public Monedas createMonedas() {
        return new Monedas();
    }

    /**
     * Create an instance of {@link MonedasResponse }
     * 
     */
    public MonedasResponse createMonedasResponse() {
        return new MonedasResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculoConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "CalculoConversion")
    public JAXBElement<CalculoConversion> createCalculoConversion(CalculoConversion value) {
        return new JAXBElement<CalculoConversion>(_CalculoConversion_QNAME, CalculoConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculoConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "CalculoConversionResponse")
    public JAXBElement<CalculoConversionResponse> createCalculoConversionResponse(CalculoConversionResponse value) {
        return new JAXBElement<CalculoConversionResponse>(_CalculoConversionResponse_QNAME, CalculoConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Monedas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "Monedas")
    public JAXBElement<Monedas> createMonedas(Monedas value) {
        return new JAXBElement<Monedas>(_Monedas_QNAME, Monedas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonedasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "MonedasResponse")
    public JAXBElement<MonedasResponse> createMonedasResponse(MonedasResponse value) {
        return new JAXBElement<MonedasResponse>(_MonedasResponse_QNAME, MonedasResponse.class, null, value);
    }

}
