package com.microservices.project.hrworker.controller;

import ch.qos.logback.classic.Logger;
import com.microservices.project.hrworker.dto.WorkerDTO;
import com.microservices.project.hrworker.service.WorkerService;
import com.microservices.project.hrworker.service.exceptions.ResourceNotFoundException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/worker")
@RefreshScope

public class WorkerResource {


    private final WorkerService workerService;

    @Value("${test.config}")
    private String testConfig;


    public WorkerResource(WorkerService workerService) {
        this.workerService = workerService;
    }



    @GetMapping ("/configs")
    public ResponseEntity<Void> getAllConfigs () {

        System.out.println("CONFIG=" + testConfig);

        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<WorkerDTO>> findAllWorkers() {

        List<WorkerDTO> allWorkers = workerService.findAllWorkers();

        return ResponseEntity.ok(allWorkers);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerDTO> findWorkerById(@PathVariable(name = "id") Long id) throws ResourceNotFoundException {

        WorkerDTO worker = workerService.findWorkerByID(id);

        return ResponseEntity.ok(worker);
    }


}
