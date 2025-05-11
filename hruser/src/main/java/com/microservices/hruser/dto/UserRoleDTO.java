package com.microservices.hruser.dto;

import com.microservices.hruser.entity.Role;
import com.microservices.hruser.entity.User;

import java.util.HashSet;
import java.util.Set;

public class UserRoleDTO {

    private Long id;
    private String name;
    private String username;
    private Set<String> role = new HashSet<>();


    public UserRoleDTO(User userEntity){

        this.id = userEntity.getId();
        this.name = userEntity.getName();
        this.username = userEntity.getUsername();

        for (Role r: userEntity.getUserRoles()) {
            this.role.add(r.getRoleName());
        }
    }

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
