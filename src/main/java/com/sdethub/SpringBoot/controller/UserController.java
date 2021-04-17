package com.sdethub.SpringBoot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUser(@RequestParam(value = "page") int page,
                          @RequestParam(value = "limit") int limit){
        return "get user was called with page = " + page + " & limit = " + limit;
    }

    @PostMapping
    public String createUser(){
        return "user was created";
    }

    @PutMapping
    public String updateUser(){
        return "User was updated";
    }

    @DeleteMapping
    public String deleteUser(){
        return "User was deleted";
    }
}
