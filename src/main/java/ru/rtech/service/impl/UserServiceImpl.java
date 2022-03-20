package ru.rtech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import ru.rtech.entity.User;
import ru.rtech.repository.CountryRepository;
import ru.rtech.repository.UserRepository;
import ru.rtech.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Query("FROM tuser LEFT JOIN tcountry")
    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

}
