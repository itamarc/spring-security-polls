package com.example.polls.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

/*
 * Created by itamar at 2022-02-07
 */
@AllArgsConstructor
@Getter
@Setter
public class UserProfile {
    private Long id;
    private String username;
    private String name;
    private Instant joinedAt;
    private Long pollCount;
    private Long voteCount;
}
