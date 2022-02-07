package com.example.polls.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/*
 * Created by itamar at 2022-02-06
 */
@Getter
@Setter
public class LoginRequest {
    @NotBlank
    private String usernameOrEmail;

    @NotBlank
    private String password;
}
