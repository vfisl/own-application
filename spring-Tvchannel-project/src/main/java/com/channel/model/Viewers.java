package com.channel.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Viewers {
	@Column(length = 20)
	private String name;
	@Id
	@GeneratedValue(generator = "viewers_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "viewers_gen", sequenceName = "viewers_sequence", initialValue = 100, allocationSize = 1)
	private Integer viewersId;
	@Column(length = 20)
	private String city;
	@Min(67)
	@Min(76)
	private int age;
	@Min(10)
	@Max(12)
	private  long  phoneNumber;
@OneToOne
Set<Chaneel>Chaneel;
public Viewers() {
	super();
}
public Viewers(String name, String city, @Min(67) @Min(76) int age, @Min(10) @Max(12) long phoneNumber,
		Set<com.channel.model.Chaneel> chaneel) {
	super();
	this.name = name;
	this.city = city;
	this.age = age;
	this.phoneNumber = phoneNumber;
	Chaneel = chaneel;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getViewersId() {
	return viewersId;
}
public void setViewersId(Integer viewersId) {
	this.viewersId = viewersId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Set<Chaneel> getChaneel() {
	return Chaneel;
}
public void setChaneel(Set<Chaneel> chaneel) {
	Chaneel = chaneel;
}
@Override
public String toString() {
	return "Viewers [name=" + name + ", viewersId=" + viewersId + ", city=" + city + ", age=" + age + ", phoneNumber="
			+ phoneNumber + ", Chaneel=" + Chaneel + "]";
}



}
