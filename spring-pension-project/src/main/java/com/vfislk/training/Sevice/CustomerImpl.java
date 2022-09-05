package com.vfislk.training.Sevice;

import java.util.List;

import com.vfislk.training.Exceptions.CustomerNotFoundException;
import com.vfislk.training.model.Customer;

public class CustomerImpl implements ICustomerService{

	@Override
	public Customer addcustomer(Customer customer) {
		return null;
	}

	@Override
	public void updateCustomer(Customer Customer) {
		
	}

	@Override
	public void deleteCustomer(Customer customerId) {
		
	}

	@Override
	public Customer getCustomerById(int customerId) throws CustomerNotFoundException {
		return null;
	}

	@Override
	public List<Customer> customerList() {
		return null;
	}

	@Override
	public List<Customer> getcustomerByAgent(String agent) throws CustomerNotFoundException {
		return null;
	}

	@Override
	public List<Customer> getcustomerByuPlansNames(String PlansName) throws CustomerNotFoundException {
		return null;
	}

	@Override
	public List<Customer> getcustomerByPremium(double premium) throws CustomerNotFoundException {
		return null;
	}

	@Override
	public List<Customer> getcustomerByCoverage(String coverage) throws CustomerNotFoundException {
		return null;
	}

	@Override
	public List<Customer> getcustomerByAmount(double amount) throws CustomerNotFoundException {
		return null;
	}

	@Override
	public List<Customer> getcustomerByNominee(String nomineename) throws CustomerNotFoundException {
		return null;
	}

	@Override
	public List<Customer> getcustomerByPhoneNumber(Long phoneNumber) throws CustomerNotFoundException {
		return null;
	}

	@Override
	public List<Customer> getcustomerByAge(int age) throws CustomerNotFoundException {
		return null;
	}

	@Override
	public List<Customer> getcustomerByOccupation(String occupation) throws CustomerNotFoundException {
		return null;
	}

}
