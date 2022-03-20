package ru.rtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.rtech.entity.User;
import ru.rtech.service.impl.UserServiceImpl;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/user/{id}")
    public User getUser(
            @PathVariable("id") Integer id) {
        return userServiceImpl.getUser(id);
    }

}
