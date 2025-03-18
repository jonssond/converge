package com.converge.application.domain.entity.user;

import com.converge.application.domain.entity.DomainEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User extends DomainEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationalId;
    private LocalDateTime birthDate;

    public User(
            Long id,
            String firstName,
            String lastName,
            String email,
            String phone,
            String nationalId,
            LocalDateTime birthDate
    ) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.nationalId = nationalId;
        this.birthDate = birthDate;
    }
}
