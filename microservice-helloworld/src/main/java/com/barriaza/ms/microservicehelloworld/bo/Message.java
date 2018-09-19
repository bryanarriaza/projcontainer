package com.barriaza.ms.microservicehelloworld.bo;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	private String message;

	public Message() {
		this.message = "";
	}

	public Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}