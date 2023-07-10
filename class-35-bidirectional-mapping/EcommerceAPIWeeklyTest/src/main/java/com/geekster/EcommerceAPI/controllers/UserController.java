package com.geekster.EcommerceAPI.controllers;

import com.geekster.EcommerceAPI.models.Product;
import com.geekster.EcommerceAPI.models.Users;
import com.geekster.EcommerceAPI.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping()
    public String addUsers(@RequestBody List<Users> usersList){
        return userService.addUsers(usersList);
    }

    @GetMapping()
    public Users getUser(@RequestParam Integer userID){
        return userService.getUser(userID);
    }
}
