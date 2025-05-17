package com.microservices.hrauth.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserRoleDTO implements Serializable {

    private Long id;
    private String name;
    private String username;
    private Set<String> role = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public Set<String> getRole() {
        return role;
    }
}
