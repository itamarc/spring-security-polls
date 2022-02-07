package com.example.polls.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/*
 * Created by itamar at 2022-02-07
 */
@Getter
@Setter
public class VoteRequest {
    @NotNull
    private Long choiceId;
}
