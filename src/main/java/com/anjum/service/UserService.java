package com.anjum.service;

import com.anjum.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
