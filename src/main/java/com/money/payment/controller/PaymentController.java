package com.money.payment.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.money.payment.entity.PaymentEntity;
import com.money.payment.service.PaymentService;

@RestController
public class PaymentController {
	private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);
	
	@Autowired
	PaymentService service;
	String response;
	
	@PostMapping("/pay")
	public String pay(@RequestBody PaymentEntity entity) {
		response = "Payment done duccessfully.";
		logger.info(response);
		return service.pay(entity);
	}
	
	@GetMapping("/getPaymentDetails")
	public List<PaymentEntity> getPaymentDetails(){
		return service.getPaymentDetails();
	}
	
	@GetMapping("/getPaymentDetailsById")
	public Optional<PaymentEntity> getPaymentDetailsById(@RequestParam int id){
		//logger.info(entity.toString());
		return service.getPaymentDetailsById(id);
	}
}
