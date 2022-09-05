package com.vfislk.training.Sevice;


import java.util.List;

import com.vfislk.training.Exceptions.NomineeNotfoundException;
import com.vfislk.training.model.Nominee;

public interface INomineeService {
	Nominee addNominee(Nominee nominee);
	void updateNominee(Nominee nominee);
	  void deleteNominee(Nominee nomineeId);
	  Nominee getnomineeById(int nomineeId) throws NomineeNotfoundException;
	  
	  
	  List<Nominee> getAllnominees() ;
	  List<Nominee> getnomineeByAge(int age) throws  NomineeNotfoundException;
	  List<Nominee>  getnomineeByCustomers(String firstName,String lastName) throws NomineeNotfoundException;
	  List<Nominee> getnomineeByRelation(String relation) throws NomineeNotfoundException;
	 // List<Nominee> getnomineeByPlansName(String nomineeName) throws NomineeNotfoundException;
	  
	  
}
