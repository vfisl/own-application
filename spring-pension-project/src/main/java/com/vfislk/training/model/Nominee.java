package com.vfislk.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
@Entity
public class Nominee {
	@Column(length = 20)
private String name;
	@Id
	@GeneratedValue(generator = "customer_gen",strategy =GenerationType.AUTO )
	@SequenceGenerator(name = "customer_gen",sequenceName ="customer_sequence",initialValue = 100,allocationSize = 1 )
private String nomineeId;
	 @Min(10)
     @Max(12)
private int age;
	 @Min(10)
     @Max(12)
private Long  number;
@Column(length = 20)
private String relation;

@OneToOne(mappedBy = "nominee")
Customer  customer;

public Nominee() {
	super();
}

public Nominee(String name, int age, Long number, String relation, Customer customer) {
	super();
	this.name = name;
	this.age = age;
	this.number = number;
	this.relation = relation;
	this.customer = customer;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getNomineeId() {
	return nomineeId;
}

public void setNomineeId(String nomineeId) {
	this.nomineeId = nomineeId;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Long getNumber() {
	return number;
}

public void setNumber(Long number) {
	this.number = number;
}

public String getRelation() {
	return relation;
}

public void setRelation(String relation) {
	this.relation = relation;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

@Override
public String toString() {
	return "nominee [name=" + name + ", nomineeId=" + nomineeId + ", age=" + age + ", number=" + number + ", relation="
			+ relation + ", customer=" + customer + "]";
}

}
