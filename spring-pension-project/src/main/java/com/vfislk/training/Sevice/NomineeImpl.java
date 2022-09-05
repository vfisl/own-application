package com.vfislk.training.Sevice;

import java.util.List;

import com.vfislk.training.Exceptions.NomineeNotfoundException;
import com.vfislk.training.model.Nominee;

public class NomineeImpl implements INomineeService {

	@Override
	public Nominee addNominee(Nominee nominee) {
		return null;
	}

	@Override
	public void updateNominee(Nominee nominee) {
		
	}

	@Override
	public void deleteNominee(Nominee nomineeId) {
		
	}

	@Override
	public Nominee getnomineeById(int nomineeId) throws NomineeNotfoundException {
		return null;
	}

	@Override
	public List<Nominee> getAllnominees() {
		return null;
	}

	@Override
	public List<Nominee> getnomineeByAge(int age) throws NomineeNotfoundException {
		return null;
	}

	@Override
	public List<Nominee> getnomineeByCustomers(String firstName, String lastName) throws NomineeNotfoundException {
		return null;
	}

	@Override
	public List<Nominee> getnomineeByRelation(String relation) throws NomineeNotfoundException {
		return null;
	}

}
