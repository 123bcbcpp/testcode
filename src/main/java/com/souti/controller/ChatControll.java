package com.souti.controller;

import com.souti.pojo.User;
import com.souti.service.UserAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ChatControll {
    @Autowired
    UserAll userAll;

    @GetMapping("/chat")
    public String chat(Model model ,String  key){
        if (key.equals("123")){
            List<User> user= userAll.SelectAll();
            model.addAttribute("user",user);
            return "chat";
        }else{
            return "error";
        }
    }

}
