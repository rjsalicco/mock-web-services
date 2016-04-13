package com.vendor.rx;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.vendor.rx.model.RxDataRequest;
import com.vendor.rx.model.RxDataResponse;
import com.vendor.rx.model.RxDataStatusResponse;

/**
 * 
 * @author t61jh19
 *
 */
@WebService
public interface RxDataRecordsService {

	@WebMethod
	@WebResult(name = "response")
	public RxDataStatusResponse checkRequestStatus(@WebParam(name = "transactionId")String transactionId);
	
	@WebMethod
	@WebResult(name = "response")
	public RxDataResponse requestRxDataRecords(@WebParam(name = "request")RxDataRequest request);
}
