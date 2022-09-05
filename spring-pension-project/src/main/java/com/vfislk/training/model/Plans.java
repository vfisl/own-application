package com.vfislk.training.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Plans {
	@Column(length = 20)
	private  String planName;
	@Id
	@GeneratedValue(generator = "plan_gen",strategy =GenerationType.AUTO )
	@SequenceGenerator(name = "plan_gen",sequenceName ="plan_sequence",initialValue = 100,allocationSize = 1 )
	private Integer planId;
	 @Min(10)
     @Max(12)
	private  int age;
	@Column(length = 20)
	private String term;
	@Column(length = 20)
	private  double premium;

	private double amount;
	@Column(length = 20)
	private String coverage;

	@ManyToMany
	Set<Customer>customers;
	@ManyToMany
	@JoinColumn(name = "agent_id")
	Agent agents;
	public Plans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plans(String planName, int age, String term, double premium, double amount, String coverage,
			Set<Customer> customers, Agent agents) {
		super();
		this.planName = planName;
		this.age = age;
		this.term = term;
		this.premium = premium;
		this.amount = amount;
		this.coverage = coverage;
		this.customers = customers;
		this.agents = agents;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	public Agent getAgents() {
		return agents;
	}
	public void setAgents(Agent agents) {
		this.agents = agents;
	}
	@Override
	public String toString() {
		return "Plans [planName=" + planName + ", planId=" + planId + ", age=" + age + ", term=" + term + ", premium="
				+ premium + ", amount=" + amount + ", coverage=" + coverage + ", customers=" + customers + ", agents="
				+ agents + "]";
	}
	
}
