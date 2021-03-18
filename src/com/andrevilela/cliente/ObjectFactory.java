
package com.andrevilela.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.andrevilela.cliente package. 
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

    private final static QName _Nome_QNAME = new QName("http://andrevilela.com/", "nome");
    private final static QName _NomeResponse_QNAME = new QName("http://andrevilela.com/", "nomeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.andrevilela.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Nome }
     * 
     */
    public Nome createNome() {
        return new Nome();
    }

    /**
     * Create an instance of {@link NomeResponse }
     * 
     */
    public NomeResponse createNomeResponse() {
        return new NomeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://andrevilela.com/", name = "nome")
    public JAXBElement<Nome> createNome(Nome value) {
        return new JAXBElement<Nome>(_Nome_QNAME, Nome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://andrevilela.com/", name = "nomeResponse")
    public JAXBElement<NomeResponse> createNomeResponse(NomeResponse value) {
        return new JAXBElement<NomeResponse>(_NomeResponse_QNAME, NomeResponse.class, null, value);
    }

}
