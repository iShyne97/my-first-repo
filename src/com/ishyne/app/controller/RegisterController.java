package com.ishyne.app.controller;

import com.ishyne.app.model.UserModel;
import com.ishyne.app.service.UserService;
import com.ishyne.app.view.LoginView;
import com.ishyne.app.view.MenuView;
import com.ishyne.app.view.RegisterView;

import java.util.Scanner;

public class RegisterController {

    private RegisterView view;
    private UserService service;

    private Scanner input;
    private String name;
    private String username;
    private String password;
    private String repassword;
    private boolean valid = false;

    public RegisterController(RegisterView view, UserService service) {
        this.view = view;
        this.service = service;
    }

    public void register(){
        input = new Scanner(System.in);
        System.out.print("Name: ");
        name = input.next();
        System.out.print("Username: ");
        username = input.next();
        while (!valid) {
            System.out.print("Password: ");
            password = input.next();
            System.out.print("Re-Password: ");
            repassword = input.next();
            if(password.equals(repassword)){
                service.save(new UserModel(name, username, password));
                new LoginView(service);
                valid = true;
            }else{
                System.out.println("Password doesn't match. Please make sure that they are the same!");
                System.out.println("");
            }
        }
    }
}
