package com.elbakian.webapp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String username;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "email", nullable = false)
    private String email;

    public User() {
    }
//
//    public User(String username, int age, String email) {
//        this.username = username;
//        this.age = age;
//        this.email = email;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }


}
