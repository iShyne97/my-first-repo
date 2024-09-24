package com.ishyne.app.service;

import com.ishyne.app.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{

    private List<UserModel> users;

    public UserServiceImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void save(UserModel user) {
        users.add(user);
    }

    @Override
    public UserModel login(String username, String password) {
        for (UserModel userModel : users) {
            if (userModel != null){
                if (userModel.getUsername().equals(username) && userModel.getPassword().equals(password)) {
                    return userModel;
                }
            }else{
                System.out.println("User are not registered yet!");
            }
        }
        return null;
    }

    @Override
    public List<UserModel> getAll() {
        return users;
    }
}
