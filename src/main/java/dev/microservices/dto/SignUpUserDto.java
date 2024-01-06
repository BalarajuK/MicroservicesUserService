package dev.microservices.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpUserDto {
    private String email;
    private String password;
}
