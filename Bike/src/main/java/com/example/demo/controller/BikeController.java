package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Bike;
import com.example.demo.service.BikeService;


@Controller
public class BikeController {
	@Autowired
	BikeService bs;

	@RequestMapping("findAll")
	public ModelAndView findAll()
	{
		List<Bike> b=bs.findAll();
		ModelAndView mv= new ModelAndView();
		mv.addObject("findAll", b);
		mv.setViewName("findAll.jsp");
		return mv;
	}

}
