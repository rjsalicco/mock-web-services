package com.company.handler.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.company.model.Request;

/**
 * 
 * @author rj
 *
 */
@XmlType(name = "handlerRequest")
public class HandlerRequest implements Request {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9194266317685870747L;
	
	private String transactionId;
	private List<byte[]> files;
	
	
	public String getTransactionId() {
		return transactionId;
	}
	@XmlElement(name="transactionId", required=true)
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public List<byte[]> getFiles() {
		return files;
	}
	@XmlElement(name="files", required=true)
	public void setFiles(List<byte[]> files) {
		this.files = files;
	}
}