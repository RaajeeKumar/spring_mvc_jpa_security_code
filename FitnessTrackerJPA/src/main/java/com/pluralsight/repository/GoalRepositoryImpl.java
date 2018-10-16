package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;


@Repository
public class GoalRepositoryImpl implements GoalRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Goal save(Goal goal) {
		em.persist(goal);
		em.flush();
		// TODO Auto-generated method stub
		return goal;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Goal> fetchAll() {
		/*Query query = em.createQuery("Select g from Goal g");*/
		
		TypedQuery<Goal> query = em.createNamedQuery(Goal.FIND_ALL_GOAL, Goal.class);
		
		List goal = query.getResultList();
		return goal;
	}

	
	@Override
	public List<GoalReport> fetchAllGoals() {
		/*Query query = em.createQuery("select new com.pluralsight.model.GoalReport(g.minutes,e.minutes,e.activity) "+
									"from Goal g, Exercise e where g.id=e.goal.id");*/
		
		TypedQuery<GoalReport> query = em.createNamedQuery(Goal.FIND_GOAL_REPORT, GoalReport.class);
		
		return query.getResultList();
	}

}
