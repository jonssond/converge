package com.converge.application.domain.services;

import com.converge.application.domain.entity.user.User;
import com.converge.application.domain.gateway.user.UserPersistenceGateway;
import com.converge.application.infrastructure.controller.user.dtos.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{

    private final UserPersistenceGateway persistenceGateway;

    @Override
    public UserDTO createUser(User user) {
        User entity = this.persistenceGateway.createUser(user);
        return UserDTO.fromEntity(entity);
    }
}
