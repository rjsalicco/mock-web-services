package com.vendor.rx;

import java.util.UUID;
import java.util.logging.Logger;

import javax.jws.WebService;

import com.vendor.model.RequestStatus;
import com.vendor.rx.model.RxDataRequest;
import com.vendor.rx.model.RxDataResponse;
import com.vendor.rx.model.RxDataStatusResponse;

/**
 * 
 * @author rj
 *
 */
@WebService(endpointInterface = "com.vendor.rx.RxDataRecordsService")
public class RxDataRecordsServiceImpl implements RxDataRecordsService {

	/**
	 * 
	 */
	private Logger logger = Logger.getLogger("com.vendor.rx.RxDataRecordsServiceImpl");
	
	@Override
	public RxDataStatusResponse checkRequestStatus(String transactionId) {
		logger.info("Received transaction ID: " + transactionId);
		
		RxDataStatusResponse rxDataStatusResponse = new RxDataStatusResponse();
		rxDataStatusResponse.setRequestStatus(RequestStatus.INPROGRESS);
		rxDataStatusResponse.setTransactionId(transactionId);
		
		return rxDataStatusResponse;
	}

	@Override
	public RxDataResponse requestRxDataRecords(RxDataRequest request) {
		logger.info("Received last name: " + request.getLastName());
		logger.info("Received government ID: " + request.getGovernmentId());
		
		String transactionId = UUID.randomUUID().toString();
		logger.info("Generated transaction ID: " + transactionId);
		
		RxDataResponse rxDataResponse = new RxDataResponse();
		rxDataResponse.setTransactionId(transactionId);
		rxDataResponse.setTransactionSuccessful(true);
		
		return rxDataResponse;
	}
}
