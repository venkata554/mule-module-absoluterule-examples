
package com.democompany.models.transactions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.democompany.models.transactions package. 
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

    private final static QName _Transactions_QNAME = new QName("", "transactions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.democompany.models.transactions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Transactions }
     * 
     */
    public Transactions createTransactions() {
        return new Transactions();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactions")
    public JAXBElement<Transactions> createTransactions(Transactions value) {
        return new JAXBElement<Transactions>(_Transactions_QNAME, Transactions.class, null, value);
    }

}
