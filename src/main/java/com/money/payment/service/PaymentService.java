package com.money.payment.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.money.payment.entity.PaymentEntity;
import com.money.payment.entity.PaymentRepository;
@Service
public class PaymentService {
	private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);
	@Autowired
	PaymentRepository repository;
	String response;
	
	public String pay(PaymentEntity entity) {
		// TODO Auto-generated method stub
		repository.save(entity);
		logger.info(entity.toString());
		response = "Payment done";
		logger.info(response);
		return response;
	}

	public List<PaymentEntity> getPaymentDetails() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Optional<PaymentEntity> getPaymentDetailsById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
