package com.example.polls.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/*
 * Created by itamar at 2022-02-07
 */
@Getter
@Setter
public class ChoiceRequest {
    @NotBlank
    @Size(max = 40)
    private String text;
}
