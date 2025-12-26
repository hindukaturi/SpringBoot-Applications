package com.vcube.sbapp04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vcube.sbapp04.repo.CarRepo;

@Controller
public class CarController {
	
	@Autowired
	CarRepo carRepo;
	
	
	@GetMapping("/")
	String getCarInfo(Model model) {
		model.addAttribute("allCarsInfo", carRepo.findAll());
		return "index";
	}

}
