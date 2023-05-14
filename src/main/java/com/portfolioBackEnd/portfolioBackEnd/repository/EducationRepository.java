/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBackEnd.portfolioBackEnd.repository;

import com.portfolioBackEnd.portfolioBackEnd.model.Education;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author porce
 */
@Repository
public interface EducationRepository extends JpaRepository<Education, Long>{
    
   List<Education> findByUserid (Long id);
    
   
}
