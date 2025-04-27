package com.microservices.project.hrworker.dto;

import com.microservices.project.hrworker.entitie.Worker;

public class WorkerDTO {

    private Long id;
    private String name;
    private Double dailyIncome;


    public WorkerDTO(Worker w) {

        this.id = w.getId();
        this.name = w.getName();
        this.dailyIncome = w.getDailyIncome();

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }
}
