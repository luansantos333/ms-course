package com.microservices.hrauth.resources;

import com.microservices.hrauth.dto.UserRoleDTO;
import com.microservices.hrauth.services.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/auth")
public class AuthResource {

    private final AuthService service;

    public AuthResource(AuthService service) {
        this.service = service;
    }


    @GetMapping("/{username}")
    public ResponseEntity<UserRoleDTO> findUserRoleByUsername(@PathVariable String username) {

        try {
            UserRoleDTO byEmail = service.findByEmail(username);
            return ResponseEntity.ok(byEmail);

        } catch (NoSuchElementException e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }


}
