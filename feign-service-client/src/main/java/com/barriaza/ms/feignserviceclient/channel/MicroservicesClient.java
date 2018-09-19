package com.barriaza.ms.feignserviceclient.channel;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.barriaza.ms.feignserviceclient.domain.Message;

@FeignClient("zuul-service")
public interface MicroservicesClient {

	@RequestMapping(method = RequestMethod.GET, value = "/helloworld")
	public Message helloworld();

	@RequestMapping(method = RequestMethod.GET, value = "/greetings")
	public Message greetings();

}
