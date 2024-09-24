package com.ishyne.app.view;

import com.ishyne.app.controller.LoginController;
import com.ishyne.app.service.UserService;
import com.ishyne.app.service.UserServiceImpl;

import javax.swing.*;

public class LoginView {

    private LoginController controller;

    public LoginView() {

    }

    public LoginView(UserService service){
        controller = new LoginController(this, service);
        init();
    }

    private void init(){
        System.out.println("===============================");
        System.out.println("-------LOGIN APPLICATION-------");
        System.out.println("===============================");
        controller.login();
    }

}
