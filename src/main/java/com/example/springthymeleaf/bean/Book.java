package com.example.springthymeleaf.bean;

import java.io.Serializable;

public class Book implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
