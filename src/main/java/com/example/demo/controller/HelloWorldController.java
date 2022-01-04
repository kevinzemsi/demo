package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping("/greeting")
    //pour parametrer l'url d'appel greeting
    public String greeting(@RequestParam(name="nameGET",required = false,defaultValue = "World")
                           String nameGET, Model model){
        model.addAttribute("nameGET", nameGET);//envoyer le nom a qui nous disons bonjour
        return "greeting";//choisi le fichier html
    }


}
