package com.example.polls.payload;

import lombok.Getter;
import lombok.Setter;

/*
 * Created by itamar at 2022-02-06
 */
@Getter
@Setter
public class JwtAuthenticationResponse {
    private String accessToken;
    private String tokenType = "Bearer";

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
