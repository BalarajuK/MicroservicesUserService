package dev.microservices.services;

import dev.microservices.model.User;
import dev.microservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository repository;

    @Value("${server.port}")
    private String port;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User signUp(String email, String password){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setCreateAt(new Date(System.currentTimeMillis()));
        return repository.save(user);
    }

    public boolean verifyUser(String email, String password){

        System.out.println("Request to verify user at port: "+port);
        Optional<User> user = repository.findByEmail(email);
        return user.map(value -> value.getPassword().equals(password)).orElse(false);
    }
}
