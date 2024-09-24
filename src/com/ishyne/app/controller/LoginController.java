package com.ishyne.app.controller;

import com.ishyne.app.model.UserModel;
import com.ishyne.app.service.UserService;
import com.ishyne.app.view.LoginView;
import com.ishyne.app.view.MenuView;
import com.ishyne.app.view.RegisterView;

import java.util.Scanner;

public class LoginController {

    public static UserModel user;

    private LoginView view;
    private UserService service;

    private Scanner input;
    private String username;
    private String password;
    private String answer;
    private boolean valid = false;

    public LoginController(LoginView view, UserService service) {
        this.view = view;
        this.service = service;
    }

    public void login() {
        while (!valid) {
            input = new Scanner(System.in);
            System.out.print("Enter your username: ");
            username = input.next();
            System.out.print("Enter your Password: ");
            password = input.next();
            user = service.login(username, password);
            if (user != null) {
                new MenuView();
                valid = true;
            } else {
                System.out.println("Incorrect Username and Password!");
                System.out.println("===============================");
                System.out.print("Do you want to try again ? (Y/N) ");
                answer = input.next();
                if (answer.equalsIgnoreCase("y")){
                    //do nothing
                } else if (answer.equalsIgnoreCase("n")) {
                    System.exit(0);
                }
            }
        }
    }

}