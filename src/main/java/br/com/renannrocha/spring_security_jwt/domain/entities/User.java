package br.com.renannrocha.spring_security_jwt.domain.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "USERS")
@Data
public class User {
    @Id
    private String username;
    private String password;
}
