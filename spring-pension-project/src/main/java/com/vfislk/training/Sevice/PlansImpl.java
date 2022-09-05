package com.vfislk.training.Sevice;

import java.util.List;

import com.vfislk.training.Exceptions.PlansNotFoundException;
import com.vfislk.training.model.Plans;

public class PlansImpl implements IPlansService {

	@Override
	public Plans addPlans(Plans plans) {
		return null;
	}

	@Override
	public void updatePlans(Plans plans) {
		
	}

	@Override
	public void deletePlans(Plans plansId) {
		
	}

	@Override
	public Plans getplansById(int plansId) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> getAllplans() {
		return null;
	}

	@Override
	public List<Plans> getPlansByAgent(String agentName) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> getPlansByCustomers(String firstName, String lastName) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> getPlansByCustomers(String CustomersName) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> getPlansByPremium(double premium) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> getPlansByCoverage(String coverage) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> getPlansByAmount(double amount) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> getPlansByAge(int age) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> checkPremium(int age, double amount) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> checkAmount(int age, double premium) throws PlansNotFoundException {
		return null;
	}

	@Override
	public List<Plans> checkterm(int age, double premium, double term) throws PlansNotFoundException {
		return null;
	}

}
