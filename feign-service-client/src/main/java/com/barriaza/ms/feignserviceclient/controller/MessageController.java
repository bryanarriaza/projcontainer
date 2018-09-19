package com.barriaza.ms.feignserviceclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barriaza.ms.feignserviceclient.domain.Message;
import com.barriaza.ms.feignserviceclient.error.MicroservicesHystrixClient;

@RestController
public class MessageController {

	@Autowired
	private MicroservicesHystrixClient client;

	@RequestMapping("/")
	ResponseEntity<Message> home() {
		return new ResponseEntity<Message>(
				new Message(client.helloworld().getMessage() + " - " + client.greetings().getMessage()),
				HttpStatus.ACCEPTED);
	}

}
