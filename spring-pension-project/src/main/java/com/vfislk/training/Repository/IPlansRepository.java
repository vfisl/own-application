package com.vfislk.training.Repository;

import java.util.List;

import com.vfislk.training.Exceptions.PlansNotFoundException;
import com.vfislk.training.model.Plans;

public interface IPlansRepository {
	
	void  updatePlans(Plans plans);
	 List<Plans> findPlansByAgent(String agentName) throws PlansNotFoundException;
	  List<Plans> findPlansByCustomers(String firstName,String lastName)throws PlansNotFoundException;
	  List<Plans> findPlansByCustomers(String CustomersName) throws PlansNotFoundException;
	  List<Plans>  findPlansByPremium(double premium) throws PlansNotFoundException;
	  List<Plans>  findPlansByCoverage(String coverage) throws PlansNotFoundException;
	  List<Plans>  findPlansByAmount(double amount) throws PlansNotFoundException;
	  List<Plans> findPlansByAge(int age)throws PlansNotFoundException;
	  List<Plans> checkPremium(int age,double amount)throws PlansNotFoundException;
	  List<Plans> checkAmount(int age,double premium)throws PlansNotFoundException;
	  List<Plans> checkterm(int age,double premium,double term)throws PlansNotFoundException;
	  

}
