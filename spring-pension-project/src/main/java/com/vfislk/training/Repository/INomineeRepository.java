package com.vfislk.training.Repository;

import java.util.List;

import com.vfislk.training.Exceptions.NomineeNotfoundException;
import com.vfislk.training.model.Nominee;

public interface INomineeRepository {
	 void updateNominee(Nominee nominee);
	 List<Nominee> findnomineeByAge(int age) throws  NomineeNotfoundException;
	  List<Nominee>  findnomineeByCustomers(String firstName,String lastName) throws NomineeNotfoundException;
	  List<Nominee> findnomineeByRelation(String relation) throws NomineeNotfoundException;
}
