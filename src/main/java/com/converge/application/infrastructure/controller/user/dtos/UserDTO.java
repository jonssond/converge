package com.converge.application.infrastructure.controller.user.dtos;

import com.converge.application.domain.entity.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationalId;

    public UserDTO(
            Long id,
            String firstName,
            String lastName,
            String email,
            String phone,
            String nationalId
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.nationalId = nationalId;
    }

    public User toEntity(){
        return new User(
                this.id,
                this.firstName,
                this.lastName,
                this.email,
                this.phone,
                this.nationalId
        );
    }

    public static UserDTO fromEntity(User user) {
            return new UserDTO(
                    user.getId(),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getEmail(),
                    user.getPhone(),
                    user.getNationalId()
            );
    }
}
