package com;

// Generated Jan 24, 2017 1:36:15 PM by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "city_master", catalog = "fleetdb")
public class CityMaster implements java.io.Serializable {

	private Integer cityId;
	private StateMaster stateMaster;
	private String cityName;
	private Set<Locations> locationses = new HashSet(0);

	public CityMaster() {
	}

	public CityMaster(StateMaster stateMaster, String cityName) {
		this.stateMaster = stateMaster;
		this.cityName = cityName;
	}

	public CityMaster(StateMaster stateMaster, String cityName, Set locationses) {
		this.stateMaster = stateMaster;
		this.cityName = cityName;
		this.locationses = locationses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "city_ID", unique = true, nullable = false)
	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_ID", nullable = false)
	public StateMaster getStateMaster() {
		return this.stateMaster;
	}

	public void setStateMaster(StateMaster stateMaster) {
		this.stateMaster = stateMaster;
	}

	@Column(name = "city_name", nullable = false, length = 30)
	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cityMaster")
	public Set<Locations> getLocationses() {
		return locationses;
	}

	public void setLocationses(Set<Locations> locationses) {
		this.locationses = locationses;
	}

	
	

}
