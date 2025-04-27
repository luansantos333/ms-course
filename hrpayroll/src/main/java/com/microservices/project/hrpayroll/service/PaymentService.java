package com.microservices.project.hrpayroll.service;

import com.microservices.project.hrpayroll.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment (Long workerId, int days) {

        return new Payment("TESTE", 100.0, days);


    }


}
