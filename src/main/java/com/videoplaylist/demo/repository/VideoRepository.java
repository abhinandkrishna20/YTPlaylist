/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.videoplaylist.demo.repository;

import com.videoplaylist.demo.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author USER1
 */
public interface VideoRepository extends JpaRepository<Video, Long>{
    
}
