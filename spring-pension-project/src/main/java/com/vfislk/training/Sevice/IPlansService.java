package com.vfislk.training.Sevice;


import java.util.List;

import com.vfislk.training.Exceptions.PlansNotFoundException;

import com.vfislk.training.model.Plans;

public interface IPlansService {
	Plans addPlans(Plans plans);
	void updatePlans(Plans plans);
	  void deletePlans(Plans plansId);
	  Plans  getplansById(int plansId) throws PlansNotFoundException;
	  List<Plans> getAllplans() ;
	  List<Plans> getPlansByAgent(String agentName) throws PlansNotFoundException;
	  List<Plans> getPlansByCustomers(String firstName,String lastName)throws PlansNotFoundException;
	  List<Plans> getPlansByCustomers(String CustomersName) throws PlansNotFoundException;
	  List<Plans>  getPlansByPremium(double premium) throws PlansNotFoundException;
	  List<Plans>  getPlansByCoverage(String coverage) throws PlansNotFoundException;
	  List<Plans>  getPlansByAmount(double amount) throws PlansNotFoundException;
	  List<Plans> getPlansByAge(int age)throws PlansNotFoundException;
	  List<Plans> checkPremium(int age,double amount)throws PlansNotFoundException;
	  List<Plans> checkAmount(int age,double premium)throws PlansNotFoundException;
	  List<Plans> checkterm(int age,double premium,double term)throws PlansNotFoundException;
	  
	  
	  
	  
	  
	
	  
}
