/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.videoplaylist.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USER1
 */
@RestController
//@RequestMapping("/test")
public class TestController {
     @GetMapping("/test")
    public String test() {
        return "index";
    }
    
}
