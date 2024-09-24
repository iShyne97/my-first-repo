package com.ishyne.app;

import com.ishyne.app.service.UserService;
import com.ishyne.app.view.LoginView;
import com.ishyne.app.view.RegisterView;

import java.util.Scanner;

public class Application {

    private Scanner input;
    private UserService service;

    public Application() {
        input = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("---WELCOME TO MY APPLICATION---");
        System.out.println("===============================");
        System.out.println("Do you already have an account?");
        System.out.print("Answer must use word -> (Y/N) = ");
        String answer = input.next();
            if (answer.equalsIgnoreCase("y")){
                new LoginView(service);
            } else if (answer.equalsIgnoreCase("n")) {
                new RegisterView();
            }
    }

    public static void main(String[] args) {
        new Application();
    }
}
