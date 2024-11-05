package com.elbakian.webapp.controller;

import com.elbakian.webapp.model.User;
import com.elbakian.webapp.service.UserService;
import com.elbakian.webapp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allUsers() {
        List<User> users = userService.allUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users-list");
        modelAndView.addObject("usersList", users);
        return modelAndView;
    }


    // метод для получения страницы редактирования
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editUser(@PathVariable("id") int id) {
        User user = userService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-edit-form");
        //modelAndView.addObject("user", user);
        modelAndView.addObject("user", userService.getById(id));
        return modelAndView;
    }

    // метод для самого редактирования
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        userService.editUser(user);
        return modelAndView;
    }

    // метод для получения страницы добавления юзеров в список
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-edit-form");
        return modelAndView;
    }

    // метод для добавления самих юзеров
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        userService.addUser(user);
        return modelAndView;
    }

    // метод для удаления юзера из списка
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        User user = userService.getById(id);
        userService.deleteUser(user);
        return modelAndView;
    }




}
