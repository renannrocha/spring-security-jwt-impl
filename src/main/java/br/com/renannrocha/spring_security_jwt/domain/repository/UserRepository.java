package br.com.renannrocha.spring_security_jwt.domain.repository;

import br.com.renannrocha.spring_security_jwt.domain.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUsername(String username);
}
