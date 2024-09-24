package com.ishyne.app.view;

import com.ishyne.app.controller.LoginController;
import com.ishyne.app.controller.RegisterController;
import com.ishyne.app.service.UserService;
import com.ishyne.app.service.UserServiceImpl;

import java.util.Scanner;

public class RegisterView {

    private RegisterController controller;
    private UserService service;

    private Scanner input;

    public RegisterView() {
        service = new UserServiceImpl();
        controller = new RegisterController(this, service);
        init();
    }

    private void init(){
        System.out.println("===============================");
        System.out.println("-------REGISTER - ACCOUNT------");
        System.out.println("===============================");
        controller.register();
    }
}
