/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.videoplaylist.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author USER1
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index"; // This should be the name of your view template (e.g., index.html)
    }
    
}
