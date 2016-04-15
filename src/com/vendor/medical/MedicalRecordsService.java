package com.vendor.medical;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.vendor.medical.model.MedicalRequest;
import com.vendor.medical.model.MedicalResponse;
import com.vendor.medical.model.MedicalStatusResponse;

/**
 * 
 * @author rj
 *
 */
@WebService
public interface MedicalRecordsService {

	@WebMethod
	@WebResult(name = "response")
	public MedicalStatusResponse checkRequestStatus(@WebParam(name = "transactionId")String transactionId);
	
	@WebMethod
	@WebResult(name = "response")
	public MedicalResponse requestMedicalRecords(@WebParam(name = "request")MedicalRequest request);
}
