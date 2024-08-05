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
public class PageController {
    @GetMapping("/index")
    public String home() {
        return "index"; // Thymeleaf will look for src/main/resources/templates/index.html
    }
}
