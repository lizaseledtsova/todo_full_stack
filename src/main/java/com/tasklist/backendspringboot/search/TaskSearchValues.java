package com.tasklist.backendspringboot.search;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TaskSearchValues {

    private String title;
    private Integer completed;
    private Long priorityId;
    private Long categoryId;

    private Integer pageNumber;
    private Integer pageSize;

    private String sortColumn;
    private String sortDirection;

}
