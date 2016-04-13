package com.vendor.rx.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.vendor.model.Response;

@XmlType(name = "rxDataResponse")
public class RxDataResponse implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4146351302747552256L;
	
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
	@XmlElement(name = "transactionSuccessful")
	public void setTransactionSuccessful(boolean transactionSuccessful) {
		this.transactionSuccessful = transactionSuccessful;
	}
}
