package com.vfislk.training.Sevice;
import java.util.List;

import com.vfislk.training.Exceptions.CustomerNotFoundException;
import com.vfislk.training.model.Customer;

public interface ICustomerService {
	Customer addcustomer(Customer customer);
	void updateCustomer(Customer Customer);
	  void deleteCustomer(Customer customerId);
	  Customer  getCustomerById(int customerId) throws CustomerNotFoundException;
	  
	  
	  List<Customer> customerList() ;
	  List<Customer> getcustomerByAgent(String agent) throws CustomerNotFoundException;
	  List<Customer> getcustomerByuPlansNames(String PlansName) throws  CustomerNotFoundException;
	  List<Customer>  getcustomerByPremium(double premium) throws  CustomerNotFoundException;
	  List<Customer> getcustomerByCoverage(String coverage)throws CustomerNotFoundException;
	  List<Customer> getcustomerByAmount(double amount) throws CustomerNotFoundException;
	  List<Customer> getcustomerByNominee(String nomineename) throws  CustomerNotFoundException;
	  List<Customer> getcustomerByPhoneNumber(Long phoneNumber) throws CustomerNotFoundException;
	  List<Customer> getcustomerByAge(int age) throws  CustomerNotFoundException;
	  List<Customer> getcustomerByOccupation(String occupation) throws  CustomerNotFoundException;
	  
	  
	  
	  
	  
	 
}
