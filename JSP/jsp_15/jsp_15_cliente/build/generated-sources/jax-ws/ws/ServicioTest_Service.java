
package ws;

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
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Servicio_Test", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/jsp_15_server/Servicio_Test?wsdl")
public class ServicioTest_Service
    extends Service
{

    private final static URL SERVICIOTEST_WSDL_LOCATION;
    private final static WebServiceException SERVICIOTEST_EXCEPTION;
    private final static QName SERVICIOTEST_QNAME = new QName("http://ws/", "Servicio_Test");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/jsp_15_server/Servicio_Test?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOTEST_WSDL_LOCATION = url;
        SERVICIOTEST_EXCEPTION = e;
    }

    public ServicioTest_Service() {
        super(__getWsdlLocation(), SERVICIOTEST_QNAME);
    }

    public ServicioTest_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOTEST_QNAME, features);
    }

    public ServicioTest_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOTEST_QNAME);
    }

    public ServicioTest_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOTEST_QNAME, features);
    }

    public ServicioTest_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioTest_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioTest
     */
    @WebEndpoint(name = "Servicio_TestPort")
    public ServicioTest getServicioTestPort() {
        return super.getPort(new QName("http://ws/", "Servicio_TestPort"), ServicioTest.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioTest
     */
    @WebEndpoint(name = "Servicio_TestPort")
    public ServicioTest getServicioTestPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "Servicio_TestPort"), ServicioTest.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOTEST_EXCEPTION!= null) {
            throw SERVICIOTEST_EXCEPTION;
        }
        return SERVICIOTEST_WSDL_LOCATION;
    }

}