package com.microservices.project.hrworker.controller;

import com.microservices.project.hrworker.dto.WorkerDTO;
import com.microservices.project.hrworker.entitie.Worker;
import com.microservices.project.hrworker.repository.WorkerRepository;
import com.microservices.project.hrworker.service.WorkerService;
import com.microservices.project.hrworker.service.exceptions.ResourceNotFoundException;
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

    public WorkerResource(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping
    public ResponseEntity<List<WorkerDTO>> findAllWorkers () {

        List<WorkerDTO> allWorkers = workerService.findAllWorkers();

        return ResponseEntity.ok(allWorkers);

    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<WorkerDTO> findWorkerById (@PathVariable (name = "id") Long id) throws ResourceNotFoundException {

        WorkerDTO worker = workerService.findWorkerByID(id);

        return ResponseEntity.ok(worker);
    }



}
