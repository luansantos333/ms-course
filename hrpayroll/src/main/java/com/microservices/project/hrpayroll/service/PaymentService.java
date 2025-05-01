package com.microservices.project.hrpayroll.service;

import com.microservices.project.hrpayroll.dto.WorkerDTO;
import com.microservices.project.hrpayroll.entity.Payment;
import com.microservices.project.hrpayroll.feignclients.WorkerFeignClient;
import com.microservices.project.hrpayroll.service.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final WorkerFeignClient feignClient;


    public PaymentService(WorkerFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    public Payment getPayment(Long workerId, int days) throws ResourceNotFoundException {

        WorkerDTO worker = feignClient.findWorkerById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }


}
