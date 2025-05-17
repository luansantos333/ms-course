package com.microservices.hrauth.feignclients;

import com.microservices.hrauth.dto.UserRoleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient (name = "hruser", path = "/api")
public interface UserFeignClient {

    @GetMapping("/user/{username}")
    ResponseEntity<UserRoleDTO> getUserRoleByUsername(@PathVariable(name = "username") String username);


}
