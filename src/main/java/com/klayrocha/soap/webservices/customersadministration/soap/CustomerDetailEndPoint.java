package com.klayrocha.soap.webservices.customersadministration.soap;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.klayrocha.CustomerDetail;
import br.com.klayrocha.GetCustomerDetailRequest;
import br.com.klayrocha.GetCustomerDetailResponse;

public class CustomerDetailEndPoint {
	@PayloadRoot(namespace="http://klayrocha.com.br", localPart="GetCustomerDetailRequest")
	@ResponsePayload
	public GetCustomerDetailResponse processCustomerDetailRequest(@RequestPayload GetCustomerDetailRequest req) {
		GetCustomerDetailResponse response = new GetCustomerDetailResponse();
		CustomerDetail customerDetail = new CustomerDetail();
		customerDetail.setId(1);
		customerDetail.setName("Bob");
		customerDetail.setPhone("999999");
		customerDetail.setEmail("bob@gmail.com");
		response.setCustomerDetail(customerDetail);
		return response;
	}

}
