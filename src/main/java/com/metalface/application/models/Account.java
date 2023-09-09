package com.metalface.application.models;


import com.metalface.application.enums.Role;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID accountId;

    @Column(name="username", length = 80, nullable = false, unique = true)
    private String username;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @Column(name="password", length = 255, nullable = false, unique = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

}
