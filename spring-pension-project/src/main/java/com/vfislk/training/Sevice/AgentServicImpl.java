package com.vfislk.training.Sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vfislk.training.Exceptions.AgentNotFoundException;
import com.vfislk.training.Repository.IAgentRepository;
import com.vfislk.training.model.Agent;

public class AgentServicImpl implements IAgentService{
	
	
	IAgentRepository agentRepository;
	@Autowired
   public AgentServicImpl(IAgentRepository agentRepository) {
		this.agentRepository = agentRepository;
	}

	@Override
	public Agent addAgent(Agent agent) {
		return agentRepository.save(agent);
	}

	@Override
	public void updateAgent(Agent agent) {
		
	}

	@Override
	public void deleteAgent(Agent agentId) {
		
	}

	@Override
	public Agent getAgentById(int agentId) throws AgentNotFoundException {
		return null;
	}

	@Override
	public List<Agent> agentsList() {
		return null;
	}

	@Override
	public List<Agent> getAgentByCustomers(String firstName, String lastName) throws AgentNotFoundException {
		return null;
	}

	@Override
	public List<Agent> getAgentByPlansNames(String planName) throws AgentNotFoundException {
		return null;
	}

	@Override
	public List<Agent> getAgentByPremium(double premium) throws AgentNotFoundException {
		return null;
	}

	@Override
	public List<Agent> getAgentByCoverage(String coverage) throws AgentNotFoundException {
		return null;
	}

	@Override
	public List<Agent> getAgentByAmount(double amount) throws AgentNotFoundException {
		return null;
	}

	@Override
	public List<Agent> getAgentByState(String state) throws AgentNotFoundException {
		return null;
	}

	@Override
	public List<Agent> getAgentByPhoneNumber(Long phoneNumber) throws AgentNotFoundException {
		return null;
	}

}
