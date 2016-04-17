package com.company.handler.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.company.model.ProcessStatus;
import com.company.model.Response;

/**
 * 
 * @author rj
 *
 */
@XmlType(name = "handlerResponse")
public class HandlerResponse implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5883401441083678902L;
	
	private String transactionId;
	private ProcessStatus processStatus;
	
	
	public String getTransactionId() {
		return transactionId;
	}
	@XmlElement(name="transactionId", required=true)
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public ProcessStatus getProcessStatus() {
		return processStatus;
	}
	@XmlElement(name="processStatus", required=true)
	public void setProcessStatus(ProcessStatus processStatus) {
		this.processStatus = processStatus;
	}
	
	
}