
package com.mytrip;

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
@WebServiceClient(name = "TicketSearchImplService", targetNamespace = "http://mytrip.com/", wsdlLocation = "http://localhost:5002/ticketservice?wsdl")
public class TicketSearchImplService
    extends Service
{

    private final static URL TICKETSEARCHIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException TICKETSEARCHIMPLSERVICE_EXCEPTION;
    private final static QName TICKETSEARCHIMPLSERVICE_QNAME = new QName("http://mytrip.com/", "TicketSearchImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:5002/ticketservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TICKETSEARCHIMPLSERVICE_WSDL_LOCATION = url;
        TICKETSEARCHIMPLSERVICE_EXCEPTION = e;
    }

    public TicketSearchImplService() {
        super(__getWsdlLocation(), TICKETSEARCHIMPLSERVICE_QNAME);
    }

    public TicketSearchImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TICKETSEARCHIMPLSERVICE_QNAME, features);
    }

    public TicketSearchImplService(URL wsdlLocation) {
        super(wsdlLocation, TICKETSEARCHIMPLSERVICE_QNAME);
    }

    public TicketSearchImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TICKETSEARCHIMPLSERVICE_QNAME, features);
    }

    public TicketSearchImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TicketSearchImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TicketSearchImpl
     */
    @WebEndpoint(name = "TicketSearchImplPort")
    public TicketSearchImpl getTicketSearchImplPort() {
        return super.getPort(new QName("http://mytrip.com/", "TicketSearchImplPort"), TicketSearchImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TicketSearchImpl
     */
    @WebEndpoint(name = "TicketSearchImplPort")
    public TicketSearchImpl getTicketSearchImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mytrip.com/", "TicketSearchImplPort"), TicketSearchImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TICKETSEARCHIMPLSERVICE_EXCEPTION!= null) {
            throw TICKETSEARCHIMPLSERVICE_EXCEPTION;
        }
        return TICKETSEARCHIMPLSERVICE_WSDL_LOCATION;
    }

}
