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
@Table(name = "locations", catalog = "fleetdb")
public class Locations implements java.io.Serializable {

	private Integer locId;
	private CityMaster cityMaster;
	private StateMaster stateMaster;
	private String locName;
	private Set<Airports> airportses = new HashSet(0);

	public Locations() {
	}

	public Locations(String locName) {
		this.locName = locName;
	}

	public Locations(CityMaster cityMaster, StateMaster stateMaster,
			String locName, Set airportses) {
		this.cityMaster = cityMaster;
		this.stateMaster = stateMaster;
		this.locName = locName;
		this.airportses = airportses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "loc_ID", unique = true, nullable = false)
	public Integer getLocId() {
		return this.locId;
	}

	public void setLocId(Integer locId) {
		this.locId = locId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id")
	public CityMaster getCityMaster() {
		return this.cityMaster;
	}

	public void setCityMaster(CityMaster cityMaster) {
		this.cityMaster = cityMaster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_ID")
	public StateMaster getStateMaster() {
		return this.stateMaster;
	}

	public void setStateMaster(StateMaster stateMaster) {
		this.stateMaster = stateMaster;
	}

	@Column(name = "loc_name", nullable = false, length = 254)
	public String getLocName() {
		return this.locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "locations")
	public Set<Airports> getAirportses() {
		return airportses;
	}

	public void setAirportses(Set<Airports> airportses) {
		this.airportses = airportses;
	}

	
	

}
