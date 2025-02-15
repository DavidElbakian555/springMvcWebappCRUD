package com.elbakian.webapp.service;

import com.elbakian.webapp.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void addUser(User user);
    void deleteUser(User user);
    void editUser(User user);
    User getById(int id);

}
