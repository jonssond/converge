package com.converge.application.infrastructure.model.user;


import com.converge.application.domain.entity.user.User;
import com.converge.application.infrastructure.model.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_users")
@Getter
@Setter
@NoArgsConstructor
public class UserJpa extends Model {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationalId;

    public UserJpa(User user) {
        super(user.getId());
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.nationalId = user.getNationalId();
    }

    public User toEntity(){
        return new User(
                this.getId(),
                this.firstName,
                this.lastName,
                this.email,
                this.phone,
                this.nationalId
        );
    }
}
