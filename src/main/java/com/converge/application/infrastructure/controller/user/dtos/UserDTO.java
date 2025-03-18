package com.converge.application.infrastructure.controller.user.dtos;

import com.converge.application.domain.entity.user.User;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationalId;
    private LocalDateTime birthDate;

    public UserDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.nationalId = user.getNationalId();
        this.birthDate = user.getBirthDate();
    }

    public User toEntity(){
        return new User(
                this.id,
                this.firstName,
                this.lastName,
                this.email,
                this.phone,
                this.nationalId,
                this.birthDate
        );
    }
}
