package com.elbakian.webapp.dao;

import com.elbakian.webapp.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsersList();

    void addUser(User user);

    void deleteUser(User user);

    void editUser(User user);

    User getUserById(int id);


}
