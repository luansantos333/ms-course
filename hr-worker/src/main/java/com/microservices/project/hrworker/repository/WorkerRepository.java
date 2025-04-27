package com.microservices.project.hrworker.repository;

import com.microservices.project.hrworker.entitie.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository <Worker, Long> {




}
