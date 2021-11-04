package com.wyw.springboot.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder
@Getter
@Setter
public class User implements Serializable {
    private Long id;
    private String name;
    private int age;
    private String pwd;
}
