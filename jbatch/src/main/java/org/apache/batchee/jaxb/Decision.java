//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 09:45:12 AM CEST 
//


package org.apache.batchee.jaxb;

import org.apache.batchee.container.jsl.ExecutionElement;
import org.apache.batchee.container.jsl.TransitionElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Decision complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Decision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="properties" type="{http://xmlns.jcp.org/xml/ns/javaee}Properties" minOccurs="0"/>
 *         &lt;group ref="{http://xmlns.jcp.org/xml/ns/javaee}TransitionElements" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ref" use="required" type="{http://xmlns.jcp.org/xml/ns/javaee}artifactRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Decision", propOrder = {
    "properties",
    "transitionElements"
})
public class Decision implements ExecutionElement {

    protected JSLProperties properties;
    @XmlElements({
        @XmlElement(name = "next", type = Next.class),
        @XmlElement(name = "stop", type = Stop.class),
        @XmlElement(name = "fail", type = Fail.class),
        @XmlElement(name = "end", type = End.class)
    })
    protected List<TransitionElement> transitionElements;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ref", required = true)
    protected String ref;

    /**
     * Gets the value of the properties property.
     *
     * @return possible object is
     * {@link JSLProperties }
     */
    public JSLProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     *
     * @param value allowed object is
     *              {@link JSLProperties }
     */
    public void setProperties(JSLProperties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the transitionElements property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitionElements property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitionElements().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Next }
     * {@link Stop }
     * {@link Fail }
     * {@link End }
     */
    public List<TransitionElement> getTransitionElements() {
        if (transitionElements == null) {
            transitionElements = new ArrayList<TransitionElement>();
        }
        return this.transitionElements;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ref property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
