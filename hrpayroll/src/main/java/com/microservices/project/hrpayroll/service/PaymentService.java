package com.microservices.project.hrpayroll.service;

import com.microservices.project.hrpayroll.entity.Payment;
import com.microservices.project.hrpayroll.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${hr-worker.host}")
    private String apiURI;


    public Payment getPayment(Long workerId, int days) {

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", workerId.toString());
        Worker worker = restTemplate.getForObject(apiURI + "/api/worker/{id}", Worker.class, uriVariables);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);


    }


}
