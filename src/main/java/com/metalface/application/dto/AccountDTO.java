package com.metalface.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.metalface.application.enums.Role;

import java.util.UUID;

public class AccountDTO {
    @JsonProperty("accountId")
    private UUID accountId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("role")
    private Role role;

}
