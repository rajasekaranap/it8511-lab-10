
package com.airline;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SpiceJetService", targetNamespace = "http://airline.com/", wsdlLocation = "http://localhost:5000/spicejet?wsdl")
public class SpiceJetService
    extends Service
{

    private final static URL SPICEJETSERVICE_WSDL_LOCATION;
    private final static WebServiceException SPICEJETSERVICE_EXCEPTION;
    private final static QName SPICEJETSERVICE_QNAME = new QName("http://airline.com/", "SpiceJetService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:5000/spicejet?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SPICEJETSERVICE_WSDL_LOCATION = url;
        SPICEJETSERVICE_EXCEPTION = e;
    }

    public SpiceJetService() {
        super(__getWsdlLocation(), SPICEJETSERVICE_QNAME);
    }

    public SpiceJetService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SPICEJETSERVICE_QNAME, features);
    }

    public SpiceJetService(URL wsdlLocation) {
        super(wsdlLocation, SPICEJETSERVICE_QNAME);
    }

    public SpiceJetService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SPICEJETSERVICE_QNAME, features);
    }

    public SpiceJetService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SpiceJetService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SpiceJet
     */
    @WebEndpoint(name = "SpiceJetPort")
    public SpiceJet getSpiceJetPort() {
        return super.getPort(new QName("http://airline.com/", "SpiceJetPort"), SpiceJet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpiceJet
     */
    @WebEndpoint(name = "SpiceJetPort")
    public SpiceJet getSpiceJetPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://airline.com/", "SpiceJetPort"), SpiceJet.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SPICEJETSERVICE_EXCEPTION!= null) {
            throw SPICEJETSERVICE_EXCEPTION;
        }
        return SPICEJETSERVICE_WSDL_LOCATION;
    }

}