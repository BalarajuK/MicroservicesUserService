package dev.microservices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String email;
    private String password;
    private Date createAt;
    private Date lastModifiedAt;
}
