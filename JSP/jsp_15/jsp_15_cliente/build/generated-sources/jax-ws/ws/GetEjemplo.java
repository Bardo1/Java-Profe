
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getEjemplo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getEjemplo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="texto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="texto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEjemplo", propOrder = {
    "texto1",
    "texto2"
})
public class GetEjemplo {

    protected String texto1;
    protected String texto2;

    /**
     * Obtiene el valor de la propiedad texto1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto1() {
        return texto1;
    }

    /**
     * Define el valor de la propiedad texto1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto1(String value) {
        this.texto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad texto2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto2() {
        return texto2;
    }

    /**
     * Define el valor de la propiedad texto2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto2(String value) {
        this.texto2 = value;
    }

}
