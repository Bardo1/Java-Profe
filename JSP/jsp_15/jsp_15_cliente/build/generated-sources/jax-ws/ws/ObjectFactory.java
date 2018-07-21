
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _GetEjemplo_QNAME = new QName("http://ws/", "getEjemplo");
    private final static QName _GetEjemploResponse_QNAME = new QName("http://ws/", "getEjemploResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEjemploResponse }
     * 
     */
    public GetEjemploResponse createGetEjemploResponse() {
        return new GetEjemploResponse();
    }

    /**
     * Create an instance of {@link GetEjemplo }
     * 
     */
    public GetEjemplo createGetEjemplo() {
        return new GetEjemplo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEjemplo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEjemplo")
    public JAXBElement<GetEjemplo> createGetEjemplo(GetEjemplo value) {
        return new JAXBElement<GetEjemplo>(_GetEjemplo_QNAME, GetEjemplo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEjemploResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEjemploResponse")
    public JAXBElement<GetEjemploResponse> createGetEjemploResponse(GetEjemploResponse value) {
        return new JAXBElement<GetEjemploResponse>(_GetEjemploResponse_QNAME, GetEjemploResponse.class, null, value);
    }

}
