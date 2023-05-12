/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author porce
 */
@Getter @Setter
@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String bannerImg;
    private String profImg;
    private String position;
    private String mail;
    private String pass;
    
    public User (){
    };
    
    public User (Long id,
                String name,
                String bannerImg,
                String profImg,
                String position,
                String mail,
                String pass){      
            
            this.id = id;
            this.name = name;
            this.bannerImg = bannerImg;
            this.profImg = profImg;
            this.position = position;
            this.mail = mail;
            this.pass = pass;
    }
}
