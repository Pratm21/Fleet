package com;

// Generated Jan 24, 2017 1:36:15 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;

@Entity
@Table(name = "airports", catalog = "fleetdb")
public class Airports implements java.io.Serializable {

	@Override
	public String toString() {
		return "Airports [airId=" + airId + ", locations=" + locations
				+ ", airCode=" + airCode + ", airName=" + airName + "]";
	}

	private int airId;
	private Locations locations;
	private String airCode;
	private String airName;

	public Airports() {
	}

	public Airports(int airId, String airName) {
		this.airId = airId;
		this.airName = airName;
	}

	public Airports(int airId, Locations locations, String airCode,
			String airName) {
		this.airId = airId;
		this.locations = locations;
		this.airCode = airCode;
		this.airName = airName;
	}

	@Id
	@Column(name = "air_ID", unique = true, nullable = false)
	public int getAirId() {
		return this.airId;
	}

	public void setAirId(int airId) {
		this.airId = airId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loc_ID")
	public Locations getLocations() {
		return this.locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	@Column(name = "air_code", length = 30)
	public String getAirCode() {
		return this.airCode;
	}

	public void setAirCode(String airCode) {
		this.airCode = airCode;
	}

	@Column(name = "air_name", nullable = false, length = 100)
	public String getAirName() {
		return this.airName;
	}

	public void setAirName(String airName) {
		this.airName = airName;
	}

}
