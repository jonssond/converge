package com.converge.application.infrastructure.model.user;


import com.converge.application.domain.entity.user.User;
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

    public UserJpa(User user) {
        super(user.getId());
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.nationalId = user.getNationalId();
        this.birthDate = user.getBirthDate();
    }

    public User toEntity(){
        return new User(
                this.getId(),
                this.firstName,
                this.lastName,
                this.email,
                this.phone,
                this.nationalId,
                this.birthDate
        );
    }
}
