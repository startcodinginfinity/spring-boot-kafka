package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ProducerService;

@RestController
@RequestMapping("/api/v1")
public class KafkaController {
	
	@Autowired
	private ProducerService producerService;
	
	@GetMapping("/producer/message")
	public void getMessage(@RequestParam("message") String message) {
		
		producerService.sendMessage(message);
		
	}

}
