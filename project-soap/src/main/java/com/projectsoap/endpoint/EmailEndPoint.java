package com.projectsoap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.projectsoap.services.EmailService;

import io.spring.guides.gs_producing_web_service.SaveMailRequest;
import io.spring.guides.gs_producing_web_service.SaveMailResponse;

@Endpoint
public class EmailEndPoint {

	private static final String NAMESPACE = "http://spring.io/guides/gs-producing-web-service";
	
	@Autowired
	private EmailService emailService;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "saveMailRequest")
	@ResponsePayload
	public SaveMailResponse getResponse(@RequestPayload SaveMailRequest request) {
		return emailService.mensaje(request);
	}
}
