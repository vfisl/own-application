package com.vfislk.training.Sevice;

import java.util.List;

import com.vfislk.training.Exceptions.AgentNotFoundException;
import com.vfislk.training.model.Agent;




public interface IAgentService {
	Agent addAgent(Agent agent);
	void updateAgent(Agent agent);
	  void deleteAgent(Agent agentId);
	  Agent  getAgentById(int agentId) throws AgentNotFoundException;
	  
	  List<Agent> agentsList() ;
	  List<Agent> getAgentByCustomers(String firstName,String lastName) throws AgentNotFoundException;
	  List<Agent> getAgentByPlansNames(String planName)throws AgentNotFoundException;
	  List<Agent>  getAgentByPremium(double premium)  throws  AgentNotFoundException;
	  List<Agent> getAgentByCoverage(String coverage) throws AgentNotFoundException;
	  List<Agent> getAgentByAmount(double amount) throws AgentNotFoundException;
	  List<Agent> getAgentByState(String state) throws AgentNotFoundException;
	  List<Agent> getAgentByPhoneNumber(Long phoneNumber) throws  AgentNotFoundException;
	
	  
	  
	  
	  
	  
	  
}
