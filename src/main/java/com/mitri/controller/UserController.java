package com.mitri.controller;

import com.mitri.po.model.UserModel;
import com.mitri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mitrichev on 2016/12/6.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all")
    public List<UserModel> selectAllUser(){
        return userService.selectAll();
    }

    @RequestMapping(value = "/{namecn}")
    public List<UserModel> selectUserByName(@PathVariable String namecn){
        return userService.selectByNameCn(namecn);
    }

}
