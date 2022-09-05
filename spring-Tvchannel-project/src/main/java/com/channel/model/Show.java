package com.channel.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

public class Show {
	@Column(length = 20)
	private String  name;
	
	private String  time;
	@Id
	@GeneratedValue(generator = "show_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "show_gen", sequenceName = "show_sequence", initialValue = 100, allocationSize = 1)
	private Integer showId;
	@ManyToMany
	Set<Viewers> view;
	public Show() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Show(String name, String time, Set<Viewers> view) {
		super();
		this.name = name;
		this.time = time;
		this.view = view;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public Set<Viewers> getView() {
		return view;
	}
	public void setView(Set<Viewers> view) {
		this.view = view;
	}
	@Override
	public String toString() {
		return "Show [name=" + name + ", time=" + time + ", showId=" + showId + ", view=" + view + "]";
	}

}
