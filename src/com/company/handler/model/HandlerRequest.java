package com.company.handler.model;

import java.awt.Image;
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
	private Image file;
	private List<byte[]> files;
	
	
	public Image getFile() {
		return file;
	}
	@XmlElement(name="file", required=true)
	public void setFile(Image file) {
		this.file = file;
	}
	public List<byte[]> getFiles() {
		return files;
	}
	@XmlElement(name="files", required=true)
	public void setFiles(List<byte[]> files) {
		this.files = files;
	}
}