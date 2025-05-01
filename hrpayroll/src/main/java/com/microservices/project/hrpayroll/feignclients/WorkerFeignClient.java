package com.microservices.project.hrpayroll.feignclients;

import com.microservices.project.hrpayroll.dto.WorkerDTO;
import com.microservices.project.hrpayroll.service.exceptions.ResourceNotFoundException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient (name = "hr-worker", url = "localhost:8001", path = "/api/worker")
public interface WorkerFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<WorkerDTO> findWorkerById(@PathVariable(name = "id") Long id) throws ResourceNotFoundException;


}
