package com.vfislk.training.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vfislk.training.Exceptions.CustomerNotFoundException;
import com.vfislk.training.model.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{
	
	
	void updateCustomer(Customer  customer);
	 List<Customer> findcustomerByAgent(String agent) throws CustomerNotFoundException;
	  List<Customer> findcustomerByuPlansNames(String PlansName) throws  CustomerNotFoundException;
	  List<Customer>  findcustomerByPremium(double premium) throws  CustomerNotFoundException;
	  List<Customer> findcustomerByCoverage(String coverage)throws CustomerNotFoundException;
	  List<Customer> findcustomerByAmount(double amount) throws CustomerNotFoundException;
	  List<Customer> findcustomerByNominee(String nomineename) throws  CustomerNotFoundException;
	  List<Customer> findcustomerByPhoneNumber(Long phoneNumber) throws CustomerNotFoundException;
	  List<Customer> findcustomerByAge(int age) throws  CustomerNotFoundException;
	  List<Customer> findcustomerByOccupation(String occupation) throws  CustomerNotFoundException;
	  

}
