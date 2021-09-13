package com.example.addemployee.controllers;

import com.example.addemployee.models.Users;
import com.example.addemployee.repo.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsedController {

    private final UserRepository userRepository;

    public UsedController(UserRepository userRepository){ this.userRepository = userRepository; }

    @PostMapping("/")
    @Transactional
   public String userAdd(@RequestParam(value = "firstname", required = false)String firstName,
                         @RequestParam(value = "lastname",required = false)String lastName,
                         @RequestParam(value = "companyId",required = false)int companyId,
                         @RequestParam(value = "role", required = false)String role,
                         Model model){
        Users users = new Users(firstName, lastName, companyId, role);
        userRepository.save(users);
        return "/about";
    }

}
