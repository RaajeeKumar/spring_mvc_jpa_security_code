package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;

@Service("exerciseservice")
public class ExerciseServiceImpl implements ExerciseService {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.ExerciseService#findAllActivity()
	 */
	@Override
	public List<Activity> findAllActivity(){
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
		
	}

}
