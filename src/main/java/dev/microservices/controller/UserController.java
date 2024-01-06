package dev.microservices.controller;

import dev.microservices.dto.SignUpUserDto;
import dev.microservices.dto.VerifyUserDto;
import dev.microservices.model.User;
import dev.microservices.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService service;

    public UserController(UserService service){
        this.service = service;
    }
    @PostMapping("")
    public User createUser(@RequestBody SignUpUserDto signUpUserDto){
        return service.signUp(signUpUserDto.getEmail(), signUpUserDto.getPassword());
    }

    @PostMapping("verify")
    public boolean verifyUser(@RequestBody VerifyUserDto verifyUserDto){
        return service.verifyUser(verifyUserDto.getEmail(), verifyUserDto.getPassword());
    }


}
