package com.vfislk.training.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
@Entity
public class Customer {
	@Column(length = 20)
        private String firstNAme;
        private String lastNAme;
        @Column(length = 20)
        private String  dob;
       
        
        @Id
    	@GeneratedValue(generator = "customer_gen",strategy =GenerationType.AUTO )
    	@SequenceGenerator(name = "customer_gen",sequenceName ="customer_sequence",initialValue = 100,allocationSize = 1 )
        private Integer customerId;
        @Min(10)
        @Max(12)
        private Long phoneNumber;
        @Column(length = 20)
        private String email;
        @Column(length = 20)
        private String occupation;
        @Min(10)
        @Max(12)
        private int  age;
        @ManyToOne
        @JoinColumn(name = "agent_id")
          Agent agents;
        
        @OneToMany(mappedBy = "customer")
        Set<Plans>plans;
        @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
         Set<Nominee>nominees;
		public Customer() {
			super();
		}
		public Customer(String firstNAme, String lastNAme, String dob, Long phoneNumber, String email,
				String occupation, int age, Agent agents, Set<Plans> plans, Set<Nominee> nominees) {
			super();
			this.firstNAme = firstNAme;
			this.lastNAme = lastNAme;
			this.dob = dob;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.occupation = occupation;
			this.age = age;
			this.agents = agents;
			this.plans = plans;
			this.nominees = nominees;
		}
		public String getFirstNAme() {
			return firstNAme;
		}
		public void setFirstNAme(String firstNAme) {
			this.firstNAme = firstNAme;
		}
		public String getLastNAme() {
			return lastNAme;
		}
		public void setLastNAme(String lastNAme) {
			this.lastNAme = lastNAme;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public Integer getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}
		public Long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getOccupation() {
			return occupation;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Agent getAgents() {
			return agents;
		}
		public void setAgents(Agent agents) {
			this.agents = agents;
		}
		public Set<Plans> getPlans() {
			return plans;
		}
		public void setPlans(Set<Plans> plans) {
			this.plans = plans;
		}
		public Set<Nominee> getNominees() {
			return nominees;
		}
		public void setNominees(Set<Nominee> nominees) {
			this.nominees = nominees;
		}
		@Override
		public String toString() {
			return "Customer [firstNAme=" + firstNAme + ", lastNAme=" + lastNAme + ", dob=" + dob + ", customerId="
					+ customerId + ", phoneNumber=" + phoneNumber + ", email=" + email + ", occupation=" + occupation
					+ ", age=" + age + ", agents=" + agents + ", plans=" + plans + ", nominees=" + nominees + "]";
		}
		
 
}
