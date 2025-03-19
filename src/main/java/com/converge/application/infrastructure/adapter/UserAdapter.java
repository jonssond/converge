package com.converge.application.infrastructure.adapter;

import com.converge.application.domain.entity.user.User;
import com.converge.application.domain.gateway.user.UserPersistenceGateway;
import com.converge.application.infrastructure.model.user.UserJpa;
import com.converge.application.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAdapter implements UserPersistenceGateway {

    private final UserRepository repository;

    public User createUser(User user) {
        UserJpa userJpa = new UserJpa(user);
        return this.repository.save(userJpa).toEntity();
    }
}
