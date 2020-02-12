//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 04:14:20 PM MSD 
//

package org.opentelecoms.gsm0348.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandSPI", propOrder = {

})
public class CommandSPI {

  @XmlElement(name = "CertificationMode", required = true)
  protected CertificationMode certificationMode;
  @XmlElement(name = "SynchroCounterMode", required = true)
  protected SynchroCounterMode synchroCounterMode;
  @XmlElement(name = "Ciphered")
  protected boolean ciphered;

  /**
   * Gets the value of the certificationMode property.
   *
   * @return possible object is
   * {@link CertificationMode }
   */
  public CertificationMode getCertificationMode() {
    return certificationMode;
  }

  /**
   * Sets the value of the certificationMode property.
   *
   * @param value allowed object is
   *              {@link CertificationMode }
   */
  public void setCertificationMode(CertificationMode value) {
    this.certificationMode = value;
  }

  /**
   * Gets the value of the synchroCounterMode property.
   *
   * @return possible object is
   * {@link SynchroCounterMode }
   */
  public SynchroCounterMode getSynchroCounterMode() {
    return synchroCounterMode;
  }

  /**
   * Sets the value of the synchroCounterMode property.
   *
   * @param value allowed object is
   *              {@link SynchroCounterMode }
   */
  public void setSynchroCounterMode(SynchroCounterMode value) {
    this.synchroCounterMode = value;
  }

  /**
   * Gets the value of the ciphered property.
   *
   * @return possible object is
   * {@link boolean }
   */
  public boolean isCiphered() {
    return ciphered;
  }

  /**
   * Sets the value of the ciphered property.
   *
   * @param value allowed object is
   *              {@link boolean }
   */
  public void setCiphered(boolean value) {
    this.ciphered = value;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((certificationMode == null) ? 0 : certificationMode.hashCode());
    result = prime * result + (ciphered ? 1231 : 1237);
    result = prime * result + ((synchroCounterMode == null) ? 0 : synchroCounterMode.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof CommandSPI)) {
      return false;
    }
    CommandSPI other = (CommandSPI) obj;
    if (certificationMode != other.certificationMode) {
      return false;
    }
    if (ciphered != other.ciphered) {
      return false;
    }
    if (synchroCounterMode != other.synchroCounterMode) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("CommandSPI [certificationMode=");
    builder.append(certificationMode);
    builder.append(", synchroCounterMode=");
    builder.append(synchroCounterMode);
    builder.append(", ciphered=");
    builder.append(ciphered);
    builder.append("]");
    return builder.toString();
  }

}
