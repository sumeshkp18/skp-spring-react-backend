package com.skp.spring.react.azure.demo.repository;

import com.skp.spring.react.azure.demo.models.ERole;
import com.skp.spring.react.azure.demo.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends DatabaseRepository<Role> {
    Optional<Role> findByName(ERole name);
}
