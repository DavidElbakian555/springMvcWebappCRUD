package com.elbakian.webapp.service;

import com.elbakian.webapp.dao.UserDAO;
import com.elbakian.webapp.dao.UserDAOImpl;
import com.elbakian.webapp.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserDAO userDAO;

    @Autowired
    @Transactional
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    @Transactional
    public List<User> allUsers() {
        return userDAO.getAllUsersList();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }

    @Override
    @Transactional
    public void editUser(User user) {
        userDAO.editUser(user);
    }

    @Override
    @Transactional
    public User getById(int id) {
        return userDAO.getUserById(id);
    }
}
