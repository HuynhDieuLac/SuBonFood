package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.FoodService;
import com.example.demo.service.OrderService;

import model.TrangThaiDonHangInfo;

@Controller
@RequestMapping("/admin")
public class TrangThaiDonHang {
	
	@Autowired
	FoodService foodService;
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/trangthaidonhang")
	public String trangthaidonhangPage(Model model, HttpServletRequest request)
	{
		TrangThaiDonHangInfo trangthaiDonHang = new TrangThaiDonHangInfo();
		trangthaiDonHang.Sumary(orderService.getOrders(),foodService.getFoods());
		model.addAttribute("trangthaidonhang" , trangthaiDonHang);
		HttpSession session = request.getSession();
		session.setAttribute("menuSelected","dashboard" );
		
		return "/trangthaidonhang";
	}
}
