package com.spring.jwt.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.jwt.models.ERole;
import com.spring.jwt.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
