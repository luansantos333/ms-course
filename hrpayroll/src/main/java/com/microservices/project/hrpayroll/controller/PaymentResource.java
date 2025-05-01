package com.microservices.project.hrpayroll.controller;

import com.microservices.project.hrpayroll.entity.Payment;
import com.microservices.project.hrpayroll.service.PaymentService;
import com.microservices.project.hrpayroll.service.exceptions.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/payment")
public class PaymentResource {
    private final PaymentService paymentService;

    public PaymentResource(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @GetMapping ("/{workerId}/days/{workedDays}")
    public ResponseEntity<Payment> getWorkerPayment (@PathVariable (name = "workerId") Long workerId, @PathVariable (name = "workedDays") Integer workedDays) throws ResourceNotFoundException {

        Payment payment = paymentService.getPayment(workerId, workedDays);

        return ResponseEntity.ok(payment);

    }


}
