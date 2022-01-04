package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class Creercontroller {

    @GetMapping("/formulaire")
    public String showformulaire(Model model){
        return "formulaire";
    }



}
