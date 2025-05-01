package com.microservices.project.hrworker.controller;

import ch.qos.logback.classic.Logger;
import com.microservices.project.hrworker.dto.WorkerDTO;
import com.microservices.project.hrworker.service.WorkerService;
import com.microservices.project.hrworker.service.exceptions.ResourceNotFoundException;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/worker")
public class WorkerResource {


    private final WorkerService workerService;
    private final Environment environment;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(WorkerResource.class);

    public WorkerResource(WorkerService workerService, Environment environment) {
        this.workerService = workerService;
        this.environment = environment;
    }

    @GetMapping
    public ResponseEntity<List<WorkerDTO>> findAllWorkers() {

        List<WorkerDTO> allWorkers = workerService.findAllWorkers();

        return ResponseEntity.ok(allWorkers);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerDTO> findWorkerById(@PathVariable(name = "id") Long id) throws ResourceNotFoundException {

        logger.warn("PORT=" + environment.getProperty("local.server.port"));

        WorkerDTO worker = workerService.findWorkerByID(id);

        return ResponseEntity.ok(worker);
    }


}
