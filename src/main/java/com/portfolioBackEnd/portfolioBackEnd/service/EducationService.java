/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.service;

import static com.fasterxml.jackson.databind.util.ClassUtil.name;
import com.portfolioBackEnd.portfolioBackEnd.model.Education;
import com.portfolioBackEnd.portfolioBackEnd.repository.EducationRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
/**
 *
 * @author porce
 */
@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository eduRepo;
    
    @Override
    public List<Education> getEducation() {
        return eduRepo.findAll();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addEducation(Education edu) {
        eduRepo.save(edu);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepo.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Education> getEducationByUserId(Long user_id) {
        //List<Long> idList = Arrays.asList(user_id);
        //return eduRepo.findAllByUser_id(user_id);
        return eduRepo.findByUserid(user_id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /*
        @Override
    public User getUserByid(Long id) {
        return usuRepo.findById(id).orElse(null);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    */
    
}
