package com.microservices.hruser.controller;

import com.microservices.hruser.dto.UserRoleDTO;
import com.microservices.hruser.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping ("/user/{username}")
    ResponseEntity<UserRoleDTO> getUserRoleByUsername (@PathVariable (name = "username") String username) {

        UserRoleDTO userRoleDTOByUsername = userService.getUserRoleDTOByUsername(username);


        return ResponseEntity.ok(userRoleDTOByUsername);
    }







}
