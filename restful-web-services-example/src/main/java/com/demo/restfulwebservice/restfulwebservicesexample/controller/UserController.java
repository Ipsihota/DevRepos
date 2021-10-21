package com.demo.restfulwebservice.restfulwebservicesexample.controller;

import com.demo.restfulwebservice.restfulwebservicesexample.dao.UserDaoService;
import com.demo.restfulwebservice.restfulwebservicesexample.exception.UserNotFoundException;
import com.demo.restfulwebservice.restfulwebservicesexample.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    //getallUsers
    @GetMapping("/users")
    public List<UserEntity> getAllUsers() {
        return userDaoService.getAllUserList();
    }

    //getUsrByID
    @GetMapping("/users/{id}")
    public UserEntity getUserById(@PathVariable int id) {
        UserEntity userEntity = userDaoService.findUserById(id);
        if(userEntity==null)
            throw new UserNotFoundException("id: " + id);
        return userEntity;
    }

    //delUsrByID
    @DeleteMapping("/users/{id}")
    public void delUserById(@PathVariable int id) {
        UserEntity userEntity = userDaoService.deleteUserById(id);
        if(userEntity==null)
            throw new UserNotFoundException("id: " + id);
//        return userEntity;
    }

    //createUsers
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody UserEntity user) {
        UserEntity savedDtls = userDaoService.saveUsers(user);

        //Return Status code as 201 created instead 200 ok

        URI location = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}").buildAndExpand(savedDtls.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}
