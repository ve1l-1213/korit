package com.korit.main;

import com.korit.controller.UserController;
import com.korit.service.UserServiceImpl;
import com.korit.service.UserServiceImpl2;
// 의존성 주입
// 의존성 분리
// 결합도 분리
public class main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceImpl2 userService2 = new UserServiceImpl2();
        UserController userController = new UserController(userService);
        userController.signUp(userService);
        userController.signUp(userService2);
        userController.setUserService(userService2);
        System.out.println("Hi");
    }
}
