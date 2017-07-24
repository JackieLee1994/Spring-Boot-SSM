package com.jackie.entity;

/**
 * Created by lwxzbh on 2017/7/20.
 */
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private Integer customerId;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", customerId=" + customerId +
                '}';
    }
}
