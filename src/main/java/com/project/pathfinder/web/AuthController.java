package com.project.pathfinder.web;


import com.project.pathfinder.model.dto.UserRegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

//    @ModelAttribute("modelAttribute")
//    public UserRegisterDto registerUserModel(){
//        return new UserRegisterDto();
//    }

    @GetMapping("/register")
    public String register(Model model) {
        UserRegisterDto dto = new UserRegisterDto();
        model.addAttribute("userRegisterDto",dto);
        return "register";
    }

    @PostMapping("/register")
    public String doRegister(UserRegisterDto userRegisterDto) {
        System.out.println(userRegisterDto.toString());
        return "redirect:/register";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
