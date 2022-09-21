package com.example.demo.services;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MobilePlan;
import com.example.demo.repos.PlanRepository;


@Service
public class MobilePlanService {
	private PlanRepository repo;
 
	@Autowired
	public MobilePlanService(PlanRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<MobilePlan> findAll()
	{
		return this.repo.findAll();
		
	}
	public MobilePlan  add(MobilePlan entity)
	{
		return this.repo.save(entity);
		
		
	}
	public MobilePlan findById(int id)
	{
		String message=new StringBuilder("Element with given id").append(id).append("Not found").toString();
		
		return this.repo.findById(id).orElseThrow(()->new RuntimeException(message));
	}

	public MobilePlan update(MobilePlan entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}

	public MobilePlan remove(int id) {
		// TODO Auto-generated method stub
		MobilePlan element=this.findById(id);		
		this.repo.deleteById(id);
		return element;
		
	}
	
	public List<MobilePlan> findByPlanName(String planName)
	{
		return this.repo.findByPlanName(planName);
	}
	
	public int updateValidity(String updatedValue ,String planName)
	{
		return this.repo.updateValidity(updatedValue, planName);
		
	}

	public List<MobilePlan> getCostGrtThan(double amount) {
		// TODO Auto-generated method stub
		return this.repo.getCostGrtThan(amount);
	}

}
