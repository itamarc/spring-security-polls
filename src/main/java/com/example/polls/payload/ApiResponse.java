package com.example.polls.payload;

import lombok.Getter;
import lombok.Setter;

/*
 * Created by itamar at 2022-02-06
 */
@Getter
@Setter
public class ApiResponse {
    private Boolean success;
    private String message;

    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
