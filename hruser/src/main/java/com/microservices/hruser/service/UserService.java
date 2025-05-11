package com.microservices.hruser.service;

import com.microservices.hruser.dto.UserRoleDTO;
import com.microservices.hruser.entity.User;
import com.microservices.hruser.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Transactional (readOnly = true)
    public UserRoleDTO getUserRoleDTOByUsername (String username) {
        User userByUsername = repository.findUserByUsername(username);
        return new UserRoleDTO(userByUsername);

    }


    public UserRoleDTO getUserRoleDTOByUserId(Long id) {
        User user = repository.findById(id).orElseThrow(() -> new NoSuchElementException("Could not found any user with this id!"));
        return new UserRoleDTO(user);

    }
}
