package com.converge.application.infrastructure.repository;

import com.converge.application.infrastructure.model.user.UserJpa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserJpa, Long> {
}
