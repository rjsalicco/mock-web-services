package com.company;

import java.util.logging.Logger;

import javax.jws.WebService;

import com.company.handler.model.HandlerRequest;
import com.company.handler.model.HandlerResponse;

/**
 * 
 * @author rj
 *
 */
@WebService(endpointInterface = "com.company.DocumentHandlerService")
public class DocumentHandlerServiceImpl implements DocumentHandlerService {

	/**
	 * 
	 */
	private Logger logger = Logger.getLogger("com.company.DocumentHandlerServiceImpl");
	
	@Override
	public HandlerResponse handleRecords(HandlerRequest request) {
		logger.info("Received...");
		return null;
	}
}
