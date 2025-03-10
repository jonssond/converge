package com.converge.application.domain.entity.user;

import com.converge.application.domain.entity.DomainEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User<ID> extends DomainEntity<ID> {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationalId;
    private LocalDateTime birthDate;

}
