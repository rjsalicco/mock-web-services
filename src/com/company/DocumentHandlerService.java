package com.company;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.company.handler.model.HandlerRequest;
import com.company.handler.model.HandlerResponse;

/**
 * 
 * @author rj
 *
 */
@WebService
public interface DocumentHandlerService {

	@WebMethod
	@WebResult(name = "response")
	public HandlerResponse handleRecords(@WebParam(name = "request")HandlerRequest request);
}
