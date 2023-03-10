package com.DBwork.models;

import javax.validation.constraints.*;

public class Person {
    private Integer id;

    @NotEmpty(message = "name should not be empty")
    @Size(min = 2, max = 30, message = "name should have between 2 and 30 characters")
    private String name;

    @NotEmpty(message = "email should not be empty")
    @Email(message = "email should be valid")
    private String email;

    @Min(value=1, message = "age should be greater than 0")
    private Integer age;

    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}",
            message="Address should be in this format: Country, City, Postal Code (6 digits)")
    private String address;



    public Person(Integer id, String name, String email, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
