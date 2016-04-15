package com.vendor.rx.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.vendor.model.RequestStatus;
import com.vendor.model.Response;

/**
 * 
 * @author rj
 *
 */
@XmlType(name = "rxDataStatusResponse")
public class RxDataStatusResponse implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4602444663321889815L;

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
