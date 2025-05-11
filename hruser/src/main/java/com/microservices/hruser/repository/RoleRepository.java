package com.microservices.hruser.repository;

import com.microservices.hruser.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository <Role,Long> {
}
