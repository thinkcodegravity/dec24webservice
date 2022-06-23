
package com.tutorial.webserviceClient.soap.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tutorial.webserviceClient.soap.stub package. 
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

    private final static QName _Add_QNAME = new QName("http://soap.webservice.tutorial.com/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://soap.webservice.tutorial.com/", "addResponse");
    private final static QName _GetRestaurantAddress_QNAME = new QName("http://soap.webservice.tutorial.com/", "getRestaurantAddress");
    private final static QName _GetRestaurantAddressResponse_QNAME = new QName("http://soap.webservice.tutorial.com/", "getRestaurantAddressResponse");
    private final static QName _Greeting_QNAME = new QName("http://soap.webservice.tutorial.com/", "greeting");
    private final static QName _GreetingResponse_QNAME = new QName("http://soap.webservice.tutorial.com/", "greetingResponse");
    private final static QName _Sub_QNAME = new QName("http://soap.webservice.tutorial.com/", "sub");
    private final static QName _SubResponse_QNAME = new QName("http://soap.webservice.tutorial.com/", "subResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tutorial.webserviceClient.soap.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetRestaurantAddress }
     * 
     */
    public GetRestaurantAddress createGetRestaurantAddress() {
        return new GetRestaurantAddress();
    }

    /**
     * Create an instance of {@link GetRestaurantAddressResponse }
     * 
     */
    public GetRestaurantAddressResponse createGetRestaurantAddressResponse() {
        return new GetRestaurantAddressResponse();
    }

    /**
     * Create an instance of {@link Greeting }
     * 
     */
    public Greeting createGreeting() {
        return new Greeting();
    }

    /**
     * Create an instance of {@link GreetingResponse }
     * 
     */
    public GreetingResponse createGreetingResponse() {
        return new GreetingResponse();
    }

    /**
     * Create an instance of {@link Sub }
     * 
     */
    public Sub createSub() {
        return new Sub();
    }

    /**
     * Create an instance of {@link SubResponse }
     * 
     */
    public SubResponse createSubResponse() {
        return new SubResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRestaurantAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRestaurantAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "getRestaurantAddress")
    public JAXBElement<GetRestaurantAddress> createGetRestaurantAddress(GetRestaurantAddress value) {
        return new JAXBElement<GetRestaurantAddress>(_GetRestaurantAddress_QNAME, GetRestaurantAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRestaurantAddressResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRestaurantAddressResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "getRestaurantAddressResponse")
    public JAXBElement<GetRestaurantAddressResponse> createGetRestaurantAddressResponse(GetRestaurantAddressResponse value) {
        return new JAXBElement<GetRestaurantAddressResponse>(_GetRestaurantAddressResponse_QNAME, GetRestaurantAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Greeting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Greeting }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "greeting")
    public JAXBElement<Greeting> createGreeting(Greeting value) {
        return new JAXBElement<Greeting>(_Greeting_QNAME, Greeting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GreetingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "greetingResponse")
    public JAXBElement<GreetingResponse> createGreetingResponse(GreetingResponse value) {
        return new JAXBElement<GreetingResponse>(_GreetingResponse_QNAME, GreetingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "sub")
    public JAXBElement<Sub> createSub(Sub value) {
        return new JAXBElement<Sub>(_Sub_QNAME, Sub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "subResponse")
    public JAXBElement<SubResponse> createSubResponse(SubResponse value) {
        return new JAXBElement<SubResponse>(_SubResponse_QNAME, SubResponse.class, null, value);
    }

}
