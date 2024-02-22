package com.bedu.actividad2.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String name;
    private String lastName;
    private int age;
    private Long id;
}
