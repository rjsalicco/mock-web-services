package com.publish;

import java.util.logging.Logger;

import javax.xml.ws.Endpoint;

import com.company.DocumentHandlerServiceImpl;
import com.vendor.medical.MedicalRecordsServiceImpl;
import com.vendor.rx.RxDataRecordsServiceImpl;

/**
 * 
 * @author rj
 *
 */
public class Publisher {

	/**
	 * 
	 */
	private Logger logger = Logger.getLogger("com.vendor.publish.Publisher");
	
	private String portNumber = "8080";
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Publisher publisher = new Publisher();
		publisher.startService(new MedicalRecordsServiceImpl(), "medical");
		publisher.startService(new RxDataRecordsServiceImpl(), "rx");
		publisher.startService(new DocumentHandlerServiceImpl(), "document");
	}
	
	/**
	 * 
	 * @param webServiceImpl
	 * @param context
	 */
	public void startService(Object webServiceImpl, String context) {

		logger.info("Starting " + webServiceImpl + " on port: " + portNumber);
		Endpoint.publish("http://localhost:"+ portNumber + "/ws/" + context, webServiceImpl);
		logger.info("Web service started and the wsdl is here: http://localhost:"+ portNumber + "/ws/" + context + "?wsdl");
	}
}