package com.vendor.rx.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.vendor.model.Request;

@XmlType(name = "rxDataRequest")
public class RxDataRequest implements Request {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4213915879890624986L;

	private String clientId;
	private String firstName;
	private String lastName;
	private String governmentId;
	private String addressLine1;
	private String postalCode;
	
	
	public String getClientId() {
		return clientId;
	}
	@XmlElement(name= "clientId", required=true)
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getFirstName() {
		return firstName;
	}
	@XmlElement(name = "firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@XmlElement(name = "lastName", required=true)
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGovernmentId() {
		return governmentId;
	}
	@XmlElement(name = "governmentId", required=true)
	public void setGovernmentId(String governmentId) {
		this.governmentId = governmentId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	@XmlElement(name = "addressLine1")
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getPostalCode() {
		return postalCode;
	}
	@XmlElement(name = "postalCode", required=true)
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
