package com;




import java.util.Date;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.type.descriptor.java.TimeZoneTypeDescriptor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


public class HomePage 
{
	public int bookID;
		public Date rentDate;

	public Date returnDate;
	public Date rentalTime;
	public Date returnTime;
	public String rentalAd;
	public String returnAd;
	public String pickAirportCode;
	public String pickCity;
	public String pickState;
	public String returnAirportCode;
	public String returnCity;
	public String returnState;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	@Temporal(javax.persistence.TemporalType.DATE)
	@NotNull @Future
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	
	@Temporal(javax.persistence.TemporalType.DATE)
	@NotNull @Future
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	@DateTimeFormat(pattern="hh:mm")
	@NotNull
	public Date getRentalTime() {
		return rentalTime;
	}
	public void setRentalTime(Date rentalTime) {
		this.rentalTime = rentalTime;
	}
	
	@DateTimeFormat(pattern="hh:mm")
	@NotNull
	public Date getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}
	public String getRentalAd() {
		return rentalAd;
	}
	public void setRentalAd(String rentalAd) {
		this.rentalAd = rentalAd;
	}
	public String getReturnAd() {
		return returnAd;
	}
	public void setReturnAd(String returnAd) {
		this.returnAd = returnAd;
	}
	public String getPickAirportCode() {
		return pickAirportCode;
	}
	public void setPickAirportCode(String pickAirportCode) {
		this.pickAirportCode = pickAirportCode;
	}
	public String getPickCity() {
		return pickCity;
	}
	public void setPickCity(String pickCity) {
		this.pickCity = pickCity;
	}
	public String getPickState() {
		return pickState;
	}
	public void setPickState(String pickState) {
		this.pickState = pickState;
	}
	public String getReturnAirportCode() {
		return returnAirportCode;
	}
	public void setReturnAirportCode(String returnAirportCode) {
		this.returnAirportCode = returnAirportCode;
	}
	public String getReturnCity() {
		return returnCity;
	}
	public void setReturnCity(String returnCity) {
		this.returnCity = returnCity;
	}
	public String getReturnState() {
		return returnState;
	}
	public void setReturnState(String returnState) {
		this.returnState = returnState;
	}
	@Override
	public String toString() {
		return "Homepage [bookID=" + bookID + ", rentDate=" + rentDate
				+ ", returnDate=" + returnDate + ", rentalTime=" + rentalTime
				+ ", returnTime=" + returnTime + ", rentalAd=" + rentalAd
				+ ", returnAd=" + returnAd + ", pickAirportCode="
				+ pickAirportCode + ", pickCity=" + pickCity + ", pickState="
				+ pickState + ", returnAirportCode=" + returnAirportCode
				+ ", returnCity=" + returnCity + ", returnState=" + returnState
				+ "]";
	}
	
	
	
	



	
	
	
	
}
