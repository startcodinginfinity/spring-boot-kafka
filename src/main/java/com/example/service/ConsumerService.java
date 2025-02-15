package com.example.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	
	@KafkaListener(topics = "codeInfinity",groupId = "codeInfinityGroup")
	public void listenToTopic(String receivedMessage) {
		
		System.out.println("The message received is "+receivedMessage);
		
	}

}
