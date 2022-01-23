
package com.tutorial.webserviceClient.soap.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Math", targetNamespace = "http://soap.webservice.tutorial.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Math {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://soap.webservice.tutorial.com/Math/calculateRectangleRequest", output = "http://soap.webservice.tutorial.com/Math/calculateRectangleResponse")
    public int calculateRectangle(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0,
        @WebParam(name = "arg1", partName = "arg1")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://soap.webservice.tutorial.com/Math/calculateSquareRequest", output = "http://soap.webservice.tutorial.com/Math/calculateSquareResponse")
    public int calculateSquare(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

}