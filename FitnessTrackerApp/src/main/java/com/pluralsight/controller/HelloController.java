package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value ="greeting")
	public String sayHello(Model model) {
	//public ModelAndView sayHello() {
		model.addAttribute("greeting", "HelloWorld, This is Raajee Kumar");
		
		/*ModelAndView modelandview=new ModelAndView("hello");
        modelandview.addObject("greeting","Hi Rajee");
        return modelandview;
		*/
		return "hello";
	}
}
