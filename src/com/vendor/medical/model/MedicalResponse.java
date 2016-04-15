package com.vendor.medical.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.vendor.model.Response;

/**
 * 
 * @author rj
 *
 */
@XmlType(name = "medicalResponse")
public class MedicalResponse implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -103333606987852683L;

	private String transactionId;
	private boolean transactionSuccessful;
	
	public String getTransactionId() {
		return transactionId;
	}
	@XmlElement(name = "transactionId")
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public boolean isTransactionSuccessful() {
		return transactionSuccessful;
	}
	@XmlElement(name = "transactionSucessful")
	public void setTransactionSuccessful(boolean transactionSuccessful) {
		this.transactionSuccessful = transactionSuccessful;
	}
}
