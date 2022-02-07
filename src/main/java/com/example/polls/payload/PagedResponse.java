package com.example.polls.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/*
 * Created by itamar at 2022-02-07
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PagedResponse<T> {
    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
    private boolean last;
}
