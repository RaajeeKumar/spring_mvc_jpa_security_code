package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Goal;

@Controller
@SessionAttributes("goal")
public class GoalController {
	
	@RequestMapping(value="addGoal", method=RequestMethod.GET)
	public String getGoal(Model model) {
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal", goal);
		return "addGoal";
		
	}
	
	@RequestMapping(value="addGoal", method=RequestMethod.POST)
	public String getGoal(@Valid @ModelAttribute("goal") Goal goal,BindingResult result) {
		System.out.println("Result has errors" + result.hasErrors());
		if(result.hasErrors()) {
			return "addGoal";
		}
		System.out.println("Goal set for today is" + goal.getMinutes());
		return "redirect:addMinutes.html";
		
	}

}
