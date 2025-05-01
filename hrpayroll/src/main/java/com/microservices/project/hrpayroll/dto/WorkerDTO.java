package com.microservices.project.hrpayroll.dto;

import java.io.Serializable;

public class WorkerDTO implements Serializable {


    private static final Long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Double dailyIncome;


    public WorkerDTO(Long id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public WorkerDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }
}
