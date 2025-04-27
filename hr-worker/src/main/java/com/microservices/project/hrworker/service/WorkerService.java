package com.microservices.project.hrworker.service;

import com.microservices.project.hrworker.dto.WorkerDTO;
import com.microservices.project.hrworker.entitie.Worker;
import com.microservices.project.hrworker.repository.WorkerRepository;
import com.microservices.project.hrworker.service.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Transactional(readOnly = true)
    public List<WorkerDTO> findAllWorkers() {

        List<Worker> workers = workerRepository.findAll();
        List<WorkerDTO> workersDTO = workers.stream().map(x -> new WorkerDTO(x)).collect(Collectors.toList());
        return workersDTO;
    }


    public WorkerDTO findWorkerByID(Long id) throws ResourceNotFoundException {

        return new WorkerDTO(workerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No worker find with the id provided")));

    }
}
