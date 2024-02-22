package com.bedu.ex1.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Task implements Serializable {
    private Long id ;
    private String title;
    private boolean completed;
}
