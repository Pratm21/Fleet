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
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "state_master", catalog = "fleetdb")
public class StateMaster implements java.io.Serializable {

	private Integer stateId;
	private String stateName;
	private Set<Locations> locationses = new HashSet(0);
	private Set<CityMaster> cityMasters = new HashSet(0);

	public StateMaster() {
	}

	public StateMaster(String stateName) {
		this.stateName = stateName;
	}

	public StateMaster(String stateName, Set locationses, Set cityMasters) {
		this.stateName = stateName;
		this.locationses = locationses;
		this.cityMasters = cityMasters;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "state_ID", unique = true, nullable = false)
	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	@Column(name = "state_name", nullable = false, length = 30)
	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stateMaster")
	public Set<CityMaster> getCityMasters() {
		return cityMasters;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stateMaster")
	public Set<Locations> getLocationses() {
		return locationses;
	}

	public void setLocationses(Set<Locations> locationses) {
		this.locationses = locationses;
	}

	public void setCityMasters(Set<CityMaster> cityMasters) {
		this.cityMasters = cityMasters;
	}

	

}
