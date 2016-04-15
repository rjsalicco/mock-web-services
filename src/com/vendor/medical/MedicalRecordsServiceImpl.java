package com.vendor.medical;

import java.util.UUID;
import java.util.logging.Logger;

import javax.jws.WebService;

import com.vendor.medical.model.MedicalRequest;
import com.vendor.medical.model.MedicalResponse;
import com.vendor.medical.model.MedicalStatusResponse;
import com.vendor.model.RequestStatus;

/**
 * 
 * @author rj
 *
 */
@WebService(endpointInterface = "com.vendor.medical.MedicalRecordsService")
public class MedicalRecordsServiceImpl implements MedicalRecordsService {

	/**
	 * 
	 */
	private Logger logger = Logger.getLogger("com.vendor.medical.MedicalRecordsServiceImpl");
	
	@Override
	public MedicalStatusResponse checkRequestStatus(String transactionId) {
		logger.info("Received transaction ID: " + transactionId);
		
		MedicalStatusResponse medicalStatusResponse = new MedicalStatusResponse();
		medicalStatusResponse.setRequestStatus(RequestStatus.INPROGRESS);
		medicalStatusResponse.setTransactionId(transactionId);
		
		return medicalStatusResponse;
	}

	@Override
	public MedicalResponse requestMedicalRecords(MedicalRequest request) {
		logger.info("Received last name: " + request.getLastName());
		logger.info("Received government ID: " + request.getGovernmentId());
		
		String transactionId = UUID.randomUUID().toString();
		logger.info("Generated transaction ID: " + transactionId);
		
		MedicalResponse medicalResponse = new MedicalResponse();
		medicalResponse.setTransactionId(transactionId);
		medicalResponse.setTransactionSuccessful(true);
		
		return medicalResponse;
	}
}
