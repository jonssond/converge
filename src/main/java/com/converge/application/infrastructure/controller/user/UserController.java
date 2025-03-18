package com.converge.application.infrastructure.controller.user;

import com.converge.application.domain.services.IUserService;
import com.converge.application.infrastructure.controller.user.dtos.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService service;

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return this.service.createUser(userDTO.toEntity());
    }
}
