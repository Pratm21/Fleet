package com;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ConfirmBooking
{
	  	@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int ConfirmBookingID;
	     
	    private Date pickup;
	    
	    private Date Return;
	    
	    private String pickupAt;
	    
	    private String ReturnAt;
	    
	    private  String vehicleType;
	    
	    private  String RentalAddon;
	    
		private String firstname;
	
		private String lastname;
	
		private String address1;
	
		private String address2;
		
		private String email;
	
		private String city;
		
		private String zip;
	
		private String phone_no;
	
		
	    private String IDP;

	    private Date i_issued;
	  
		private Date i_validthru;
		
		private String driving_license;
	   
	    private Date l_issued;
	 
		private Date l_validthru;
		
		
		private String passport_no;

	    private Date p_issued;
	   
	    private Date p_validthru;
	
		private String mobile;
		
		private String name;
		
		private String preferedCarType;

		public int getConfirmBookingID() {
			return ConfirmBookingID;
		}

		public void setConfirmBookingID(int confirmBookingID) {
			ConfirmBookingID = confirmBookingID;
		}

		public Date getPickup() {
			return pickup;
		}

		public void setPickup(Date pickup) {
			this.pickup = pickup;
		}

		public Date getReturn() {
			return Return;
		}

		public void setReturn(Date return1) {
			Return = return1;
		}

		public String getPickupAt() {
			return pickupAt;
		}

		public void setPickupAt(String pickupAt) {
			this.pickupAt = pickupAt;
		}

		public String getReturnAt() {
			return ReturnAt;
		}

		public void setReturnAt(String returnAt) {
			ReturnAt = returnAt;
		}

		public String getVehicleType() {
			return vehicleType;
		}

		public void setVehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
		}

		public String getRentalAddon() {
			return RentalAddon;
		}

		public void setRentalAddon(String rentalAddon) {
			RentalAddon = rentalAddon;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getAddress1() {
			return address1;
		}

		public void setAddress1(String address1) {
			this.address1 = address1;
		}

		public String getAddress2() {
			return address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public String getPhone_no() {
			return phone_no;
		}

		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}

		public String getIDP() {
			return IDP;
		}

		public void setIDP(String iDP) {
			IDP = iDP;
		}

		public Date getI_issued() {
			return i_issued;
		}

		public void setI_issued(Date i_issued) {
			this.i_issued = i_issued;
		}

		public Date getI_validthru() {
			return i_validthru;
		}

		public void setI_validthru(Date i_validthru) {
			this.i_validthru = i_validthru;
		}

		public String getDriving_license() {
			return driving_license;
		}

		public void setDriving_license(String driving_license) {
			this.driving_license = driving_license;
		}

		public Date getL_issued() {
			return l_issued;
		}

		public void setL_issued(Date l_issued) {
			this.l_issued = l_issued;
		}

		public Date getL_validthru() {
			return l_validthru;
		}

		public void setL_validthru(Date l_validthru) {
			this.l_validthru = l_validthru;
		}

		public String getPassport_no() {
			return passport_no;
		}

		public void setPassport_no(String passport_no) {
			this.passport_no = passport_no;
		}

		public Date getP_issued() {
			return p_issued;
		}

		public void setP_issued(Date p_issued) {
			this.p_issued = p_issued;
		}

		public Date getP_validthru() {
			return p_validthru;
		}

		public void setP_validthru(Date p_validthru) {
			this.p_validthru = p_validthru;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPreferedCarType() {
			return preferedCarType;
		}

		public void setPreferedCarType(String preferedCarType) {
			this.preferedCarType = preferedCarType;
		}
		
		

}