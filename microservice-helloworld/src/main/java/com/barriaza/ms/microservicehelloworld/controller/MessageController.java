package com.barriaza.ms.microservicehelloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barriaza.ms.microservicehelloworld.bo.Message;

@RestController
public class MessageController {

	@Value("${nombre}")
	private String nombre;

	@RequestMapping("/")
	ResponseEntity<Message> home() {
		return new ResponseEntity<Message>(new Message("Hello " + nombre), HttpStatus.ACCEPTED);
	}

}