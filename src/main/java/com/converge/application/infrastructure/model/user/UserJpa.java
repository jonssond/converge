package com.converge.application.infrastructure.model.user;


import com.converge.application.infrastructure.model.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_users")
@Getter
@Setter
public class UserJpa extends Model {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationalId;
    private LocalDateTime birthDate;
}
