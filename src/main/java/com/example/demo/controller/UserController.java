package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@RestController // return시에 그 문자를 그대로 응답
@Controller //return되는값이 파일명이 되야된다.(파일을 찾아서 포워드 해주는애다.) (템플릿 엔진 같은 애들이다.)
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";

    }

    @PostMapping("/join") //디스패처 서블릿이 때려준다. //requset, respense만 전달가능
    public String join(String username, String password, String email) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String email = request.getParameter("email");

        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);

        if (username.length() > 10) {
            return "error-404";
        }
        return "redirect:/main";
    }

}
