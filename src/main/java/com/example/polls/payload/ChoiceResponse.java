package com.example.polls.payload;

import lombok.Getter;
import lombok.Setter;

/*
 * Created by itamar at 2022-02-07
 */
@Getter
@Setter
public class ChoiceResponse {
    private long id;
    private String text;
    private long voteCount;
}
