package com.converge.application.domain.services;

import com.converge.application.domain.entity.user.User;
import com.converge.application.infrastructure.controller.user.dtos.UserDTO;

public interface IUserService {

    public UserDTO createUser(User user);

}
