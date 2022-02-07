package com.example.polls.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*
 * Created by itamar at 2022-02-07
 */
@AllArgsConstructor
@Getter
@Setter
public class UserSummary {
    private Long id;
    private String username;
    private String name;
}
