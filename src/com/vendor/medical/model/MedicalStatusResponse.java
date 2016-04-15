package com.vendor.medical.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.vendor.model.Response;
import com.vendor.model.RequestStatus;

/**
 * 
 * @author rj
 *
 */
@XmlType(name = "medicalStatusResponse")
public class MedicalStatusResponse implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1207189056128552365L;
	
	private String transactionId;
	private RequestStatus requestStatus;

	
	public String getTransactionId() {
		return transactionId;
	}
	@XmlElement(name="transactionId")
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public RequestStatus getRequestStatus() {
		return requestStatus;
	}
	@XmlElement(name="requestStatus")
	public void setRequestStatus(RequestStatus requestStatus) {
		this.requestStatus = requestStatus;
	}
}
