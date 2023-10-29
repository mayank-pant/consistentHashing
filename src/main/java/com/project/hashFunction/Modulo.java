package com.project.hashFunction;

import jakarta.inject.Singleton;

@Singleton
public class Modulo {
    public Integer hash(Integer userId) {
        return userId%10;
    }
}
