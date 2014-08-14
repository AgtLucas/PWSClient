
package uk.com.megabrew.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.com.megabrew.service package. 
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

    private final static QName _ListBeers_QNAME = new QName("http://service.megabrew.com.uk/", "listBeers");
    private final static QName _ListBeersResponse_QNAME = new QName("http://service.megabrew.com.uk/", "listBeersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.com.megabrew.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListBeers_Type }
     * 
     */
    public ListBeers_Type createListBeers_Type() {
        return new ListBeers_Type();
    }

    /**
     * Create an instance of {@link ListBeersResponse }
     * 
     */
    public ListBeersResponse createListBeersResponse() {
        return new ListBeersResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListBeers_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.megabrew.com.uk/", name = "listBeers")
    public JAXBElement<ListBeers_Type> createListBeers(ListBeers_Type value) {
        return new JAXBElement<ListBeers_Type>(_ListBeers_QNAME, ListBeers_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListBeersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.megabrew.com.uk/", name = "listBeersResponse")
    public JAXBElement<ListBeersResponse> createListBeersResponse(ListBeersResponse value) {
        return new JAXBElement<ListBeersResponse>(_ListBeersResponse_QNAME, ListBeersResponse.class, null, value);
    }

}
