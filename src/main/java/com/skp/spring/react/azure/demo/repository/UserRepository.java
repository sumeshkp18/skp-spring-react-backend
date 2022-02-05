package com.skp.spring.react.azure.demo.repository;

import com.skp.spring.react.azure.demo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends DatabaseRepository<User> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
