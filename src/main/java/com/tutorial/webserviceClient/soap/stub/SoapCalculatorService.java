
package com.tutorial.webserviceClient.soap.stub;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SoapCalculatorService", targetNamespace = "http://soap.webservice.tutorial.com/", wsdlLocation = "http://localhost:7080/calculation?wsdl")
public class SoapCalculatorService
    extends Service
{

    private final static URL SOAPCALCULATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException SOAPCALCULATORSERVICE_EXCEPTION;
    private final static QName SOAPCALCULATORSERVICE_QNAME = new QName("http://soap.webservice.tutorial.com/", "SoapCalculatorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7080/calculation?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPCALCULATORSERVICE_WSDL_LOCATION = url;
        SOAPCALCULATORSERVICE_EXCEPTION = e;
    }

    public SoapCalculatorService() {
        super(__getWsdlLocation(), SOAPCALCULATORSERVICE_QNAME);
    }

    public SoapCalculatorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPCALCULATORSERVICE_QNAME, features);
    }

    public SoapCalculatorService(URL wsdlLocation) {
        super(wsdlLocation, SOAPCALCULATORSERVICE_QNAME);
    }

    public SoapCalculatorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPCALCULATORSERVICE_QNAME, features);
    }

    public SoapCalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapCalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SoapCalculator
     */
    @WebEndpoint(name = "SoapCalculatorPort")
    public SoapCalculator getSoapCalculatorPort() {
        return super.getPort(new QName("http://soap.webservice.tutorial.com/", "SoapCalculatorPort"), SoapCalculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapCalculator
     */
    @WebEndpoint(name = "SoapCalculatorPort")
    public SoapCalculator getSoapCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.webservice.tutorial.com/", "SoapCalculatorPort"), SoapCalculator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPCALCULATORSERVICE_EXCEPTION!= null) {
            throw SOAPCALCULATORSERVICE_EXCEPTION;
        }
        return SOAPCALCULATORSERVICE_WSDL_LOCATION;
    }

}
