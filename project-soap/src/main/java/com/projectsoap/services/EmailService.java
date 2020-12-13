package com.projectsoap.services;

import org.springframework.stereotype.Service;

import io.spring.guides.gs_producing_web_service.SaveMailRequest;
import io.spring.guides.gs_producing_web_service.SaveMailResponse;

@Service
public class EmailService {
	
	public SaveMailResponse mensaje (SaveMailRequest request) {
		SaveMailResponse saveMailResponse = new SaveMailResponse();
		saveMailResponse.setResponse("Correo Enviado");
		return saveMailResponse;
	}
}
