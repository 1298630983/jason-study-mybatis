package com.jason.study.controller;

import com.jason.study.entity.User;
import com.jason.study.service.IUserService;
import com.jason.study.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    private IUserService service = new UserServiceImpl();

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(User user){
        return "index";
    }

    @RequestMapping(value = "/toJson",method = RequestMethod.POST)
    @ResponseBody
    public User toJson(User user){
        service.addUser(user);
        return service.findUserById(2);
    }

}
