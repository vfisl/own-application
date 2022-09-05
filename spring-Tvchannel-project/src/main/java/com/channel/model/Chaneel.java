package com.channel.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Chaneel {
	@Column(name = "channelname", length = 20)
	private String name;
	
	@Id
	@GeneratedValue(generator = "channel_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "channel_gen", sequenceName = "channel_sequence", initialValue = 100, allocationSize = 1)
	private Integer channelId;
	
	private  String language;
	@Column(length = 20)
	private String type;
	private  double  price;
	
	@OneToMany
	Set<Viewers>viewers;
	@OneToMany
	Set<Show> show;
	public Chaneel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chaneel(String name, String language, String type, double price, Set<Viewers> viewers, Set<Show> show) {
		super();
		this.name = name;
		this.language = language;
		this.type = type;
		this.price = price;
		this.viewers = viewers;
		this.show = show;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<Viewers> getViewers() {
		return viewers;
	}
	public void setViewers(Set<Viewers> viewers) {
		this.viewers = viewers;
	}
	public Set<Show> getShow() {
		return show;
	}
	public void setShow(Set<Show> show) {
		this.show = show;
	}
	@Override
	public String toString() {
		return "Chaneel [name=" + name + ", channelId=" + channelId + ", language=" + language + ", type=" + type
				+ ", price=" + price + ", viewers=" + viewers + ", show=" + show + "]";
	}
	
	
}
