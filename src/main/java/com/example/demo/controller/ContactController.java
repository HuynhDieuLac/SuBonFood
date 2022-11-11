package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.entities.Contact;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;


@Controller
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@Autowired
	ContactRepository contactRepository;
	
	
	@RequestMapping(value = {"/contact-info"} , method = RequestMethod.GET)
	public String showContactInfo(Model model)
	{
		model.addAttribute("contact", new Contact());
		return "/contact";
	}
	
	
	
	
	
}
