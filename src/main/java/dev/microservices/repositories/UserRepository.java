package dev.microservices.repositories;

import dev.microservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    Optional<User> findByEmail(String email);

}
