/*
 * Copyright (c) 2025 Dana-Klesly
 * SPDX-License-Identifier: MIT
 */

package com.example;

import com.google.gson.Gson;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JsonExample {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = new Person("Alice", 30);
        String json = gson.toJson(person);
        System.out.println("JSON Output: " + json);
    }
}
