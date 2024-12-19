package com.korit.controller;

import com.korit.entity.User;
import com.korit.repository.UserRepository;
import com.korit.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class UserController {

    @Setter // 어노테이션은 변수나 메서드 클래스등 작성 위치에 따라 적용됨
    private UserService userService;

    public void signIn(){
    }

    public void signUp(UserService userService) {
        String username = "test";
        String password = "1234";
        String email = "test@gmail.com";
        User user = User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();

        userService.add(user);
    }
}
