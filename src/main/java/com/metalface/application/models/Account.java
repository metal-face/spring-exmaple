package com.metalface.application.models;

import com.metalface.application.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="account_id")
    private UUID accountId;

    @Basic
    @Column(name="username", length = 80, nullable = false, unique = true)
    private String username;

    @Basic
    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @Basic
    @Column(name="password", length = 255, nullable = false, unique = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name="role", nullable = false)
    private Role role;

    @Basic
    @Column(name="created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Basic
    @Column(name="updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

}
