package com.vfislk.training.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Agent {
	@Column(name = "agentname", length = 20)
	private String Agentname;
	
	@Id
	@GeneratedValue(generator = "agent_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "agent_gen", sequenceName = "agent_sequence", initialValue = 100, allocationSize = 1)
	private Integer agentId;
	
	@Column(length = 20)
	private String state;
    @Min(10)
    @Max(12)
	private long phoneNumber;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Customer customer;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Plans plans;

	public Agent() {
		super();
	}

	public Agent(String agentname, String state, long phoneNumber, Customer customer, Plans plans) {
		super();
		Agentname = agentname;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.customer = customer;
		this.plans = plans;
	}

	public String getAgentname() {
		return Agentname;
	}

	public void setAgentname(String agentname) {
		Agentname = agentname;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Plans getPlans() {
		return plans;
	}

	public void setPlans(Plans plans) {
		this.plans = plans;
	}

	@Override
	public String toString() {
		return "Agent [Agentname=" + Agentname + ", agentId=" + agentId + ", state=" + state + ", phoneNumber="
				+ phoneNumber + ", customer=" + customer + ", plans=" + plans + "]";
	}

}
