/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.controller;
import java.util.List;

import com.portfolioBackEnd.portfolioBackEnd.model.User;
import com.portfolioBackEnd.portfolioBackEnd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author porce
 */
@RestController
public class UserController {
    
    //List<User> listaLogin = new ArrayList();
    
    @Autowired
    private IUserService usuSrv;
    
    @GetMapping ("/test")
    public String test(){
         return "Hola, el BackEnd se encuentra Online";
    }

    @GetMapping ("/user/getbyid/{id}")
    @ResponseBody
    public User getUserByid(@PathVariable Long id){
        return usuSrv.getUserByid(id);
    }
    
    @GetMapping ("/user/getbymail/{mail}")
    @ResponseBody
    public User getUserByMail(@PathVariable String mail){
        return usuSrv.getUserByMail(mail);
    }
    
    @GetMapping ("/user")
    @ResponseBody
    public List<User> getUser() {
        return usuSrv.getUser();
    }
    
    @DeleteMapping("/user/del/{id}")
    public void deleteUser(@PathVariable Long id){
        usuSrv.deleteUser(id);
    }
    
    @PostMapping ("/user/add")
    public void addUser(@RequestBody User usu){
         usuSrv.addUser(usu);
    }

    @PutMapping ("/user/update")
    public void updateUser(@RequestBody User usu){
         usuSrv.addUser(usu);
    }
}
