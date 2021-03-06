package com.example.polls.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

/*
 * Created by itamar at 2022-02-06
 */
@Getter
@Setter
public class SignUpRequest {
    @NotBlank
    @Size(min = 4, max = 40)
    private String name;

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;
}
