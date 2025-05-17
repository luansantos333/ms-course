package com.microservices.hrauth.services;

import com.microservices.hrauth.dto.UserRoleDTO;
import com.microservices.hrauth.feignclients.UserFeignClient;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.logging.Logger;


@Service
public class AuthService {


    private final UserFeignClient feignClient;


    public AuthService(UserFeignClient feignClient) {
        this.feignClient = feignClient;
    }


    public UserRoleDTO findByEmail(String email) throws NoSuchElementException {


        UserRoleDTO userRoleByUsername = feignClient.getUserRoleByUsername(email).getBody();

        if (userRoleByUsername == null) {

            throw new NoSuchElementException("No user found with this username");
        }

//        logger.info("Email found");

        return userRoleByUsername;

    }


}
