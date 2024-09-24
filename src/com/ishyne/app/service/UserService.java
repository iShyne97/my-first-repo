package com.ishyne.app.service;

import com.ishyne.app.model.UserModel;

import java.util.List;

public interface UserService {
    void save(UserModel user);

    UserModel login(String username, String Password);

    List<UserModel> getAll();
}
