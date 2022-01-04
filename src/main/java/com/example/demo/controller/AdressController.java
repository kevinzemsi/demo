package com.example.demo.controller;

import com.example.demo.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdressController {
    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/adresses")
    public String showAdresses(Model model){
        model.addAttribute("allAdresses",addressRepository.findAll());
        return "adresses";
    }

}
