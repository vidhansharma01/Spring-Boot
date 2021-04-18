package com.sdethub.SpringBoot.controller;

import com.sdethub.SpringBoot.request.UserDetails;
import com.sdethub.SpringBoot.response.UserRest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUser(@RequestParam(value = "page", defaultValue = "1", required = false) int page,
                          @RequestParam(value = "limit") int limit){
        return "get user was called with page = " + page + " & limit = " + limit;
    }

    @GetMapping(path = "/{userId}", produces = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE}
            )
    public UserRest getUser(@PathVariable String userId){
        UserRest inputUser = new UserRest();
        inputUser.setFirstName("Vidhan");
        inputUser.setLastName("Chandra");
        inputUser.setEmail("vidhanfejf@gmail.com");
        return inputUser;
    }

    @PostMapping
    public UserRest createUser(@Valid @RequestBody UserDetails userDetails){
        UserRest userRest = new UserRest();
        userRest.setFirstName(userDetails.getFirstName());
        userRest.setLastName(userDetails.getLastName());
        userRest.setEmail(userDetails.getEmail());
        return userRest;
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
