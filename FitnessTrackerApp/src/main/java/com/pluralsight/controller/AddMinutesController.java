package com.pluralsight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.service.ExerciseService;

@Controller
public class AddMinutesController {
	
	@Autowired
	private ExerciseService exerciseservice;
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("Exercise" + exercise.getMinutes());
		System.out.println("Activity" + exercise.getActivity());
		return "addMinutes";
		//return "forward:addMoreMinutes.html";
		//return "redirect:addMoreMinutes.html";
	}
	
	/*@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("Exercising" + exercise.getMinutes());
		return "addMinutes";
	}*/

	// RESTFUL Service using Spring MVC 4. Response format is json
	@RequestMapping(value ="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivity() {
		
		return exerciseservice.findAllActivity();
				
	}
}
