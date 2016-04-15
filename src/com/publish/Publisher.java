package com.vendor.publish;

import javax.xml.ws.Endpoint;

import com.vendor.medical.MedicalRecordsServiceImpl;
import com.vendor.rx.RxDataRecordsServiceImpl;

/**
 * 
 * @author T61JH19
 *
 */
public class Publisher {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/ws/medical", new MedicalRecordsServiceImpl());
		
		Endpoint.publish("http://localhost:8080/ws/rx", new RxDataRecordsServiceImpl());
	}
}