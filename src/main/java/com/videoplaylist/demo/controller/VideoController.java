/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.videoplaylist.demo.controller;

import com.videoplaylist.demo.model.Video;
import com.videoplaylist.demo.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
@CrossOrigin(origins = "http://localhost:8080")
public class VideoController {
    @Autowired
    private VideoRepository videoRepository;

    @GetMapping
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @PostMapping
    public Video addVideo(@RequestBody Video video) {
        return videoRepository.save(video);
    }

    @DeleteMapping("/{id}")
    public void deleteVideo(@PathVariable Long id) {
        videoRepository.deleteById(id);
    }
    
}
