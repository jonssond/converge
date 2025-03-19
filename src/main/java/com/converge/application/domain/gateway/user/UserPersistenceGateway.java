package com.converge.application.domain.gateway.user;

import com.converge.application.domain.entity.user.User;

public interface UserPersistenceGateway {

    public User createUser(User user);
}
