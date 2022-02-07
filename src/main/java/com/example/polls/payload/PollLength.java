package com.example.polls.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/*
 * Created by itamar at 2022-02-07
 */
@Getter
@Setter
public class PollLength {
    @NotNull
    @Max(7)
    private Integer days;

    @NotNull
    @Max(23)
    private Integer hours;
}
