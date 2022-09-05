package com.vfislk.training.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vfislk.training.Exceptions.AgentNotFoundException;
import com.vfislk.training.model.Agent;

public interface IAgentRepository  extends JpaRepository<Agent, Integer>{
	void updateAgent(Agent agent);
	 List<Agent> findAgentByCustomers(String firstName,String lastName) throws AgentNotFoundException;
	  List<Agent> findAgentByPlansNames(String planName)throws AgentNotFoundException;
	  List<Agent>  findAgentByPremium(double premium)  throws  AgentNotFoundException;
	  List<Agent> findAgentByCoverage(String coverage) throws AgentNotFoundException;
	  List<Agent> findAgentByAmount(double amount) throws AgentNotFoundException;
	  List<Agent> findAgentByState(String state) throws AgentNotFoundException;
	  List<Agent> findAgentByPhoneNumber(Long phoneNumber) throws  AgentNotFoundException;

}
