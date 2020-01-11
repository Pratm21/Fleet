package com;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
public class Register
{    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   
	private int RUID;
@NotEmpty(message="IDP can not be empty")
@Length(min=4,max=10,message="user name must be between ${min} and ${max} characters")
     private String IDP;
@NotEmpty(message="firstname can not be empty")
@Length(min=4,max=10,message="user name must be between ${min} and ${max} characters")
	private String firstname;
@NotEmpty(message="latname can not be empty")
@Length(min=4,max=10,message="user name must be between ${min} and ${max} characters")
	private String lastname;
@NotEmpty(message="address can not be empty")
@Length(min=4,max=20,message="user name must be between ${min} and ${max} characters")
	private String address1;
@NotEmpty(message="address can not be empty")
@Length(min=4,max=20,message="user name must be between ${min} and ${max} characters")
	private String address2;
	@NotEmpty(message="email can not be empty")
	@Email(message="invalid email id")
	private String email;
	@NotEmpty(message="city can not be empty")
	@Length(min=4,max=20,message="user name must be between ${min} and ${max} characters")
	private String city;
	@NotEmpty(message="zip can not be empty")
	@Length(min=4,max=6,message="user name must be between ${min} and ${max} characters")
	private String zip;
	@NotEmpty(message="mobile no. compulsory")
	@Pattern(regexp = "^[0-9]{10}+$", message = "mobile must contain 10 digits")
	private String phone_no;
	@NotEmpty(message="driving_license can not be empty")
	@Length(min=4,max=6,message="user name must be between ${min} and ${max} characters")
	private String driving_license;
	@Temporal(javax.persistence.TemporalType.DATE)
	@NotNull(message="Date can't be empty")
	private Date DOB;
    @Transient
	private String confirmPassword;
    @Temporal(javax.persistence.TemporalType.DATE)
	@NotNull(message="Date can't be empty")
	private Date i_issued;
    @Temporal(javax.persistence.TemporalType.DATE)
	@NotNull(message="Date can't be empty")
	private Date i_validthru;
    @Temporal(javax.persistence.TemporalType.DATE)
	@NotNull(message="Date can't be empty")
    private Date l_issued;
    @Temporal(javax.persistence.TemporalType.DATE)
	@NotNull(message="Date can't be empty")
	private Date l_validthru;
    @Temporal(javax.persistence.TemporalType.DATE)
	@NotNull(message="Date can't be empty")
    private Date p_issued;
    @Temporal(javax.persistence.TemporalType.DATE)
	@NotNull(message="Date can't be empty")
	private Date p_validthru;
	
	private String password;
	@NotEmpty(message="mobile no. compulsory")
	@Pattern(regexp = "^[0-9]{10}+$", message = "mobile must contain 10 digits")
	private String mobile;
	
	private String name;
	
	private String preferedCarType;
	
	private String passport_no;

	public int getRUID() {
		return RUID;
	}

	public void setRUID(int rUID) {
		RUID = rUID;
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

	public String getDriving_license() {
		return driving_license;
	}

	public void setDriving_license(String driving_license) {
		this.driving_license = driving_license;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPassport_no() {
		return passport_no;
	}

	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}

	@Override
	public String toString() {
		return "Register [RUID=" + RUID + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", address1=" + address1
				+ ", address2=" + address2 + ", email=" + email + ", city="
				+ city + ", zip=" + zip + ", phone_no=" + phone_no
				+ ", driving_license=" + driving_license + ", DOB=" + DOB
				+ ", confirmPassword=" + confirmPassword + ", i_issued="
				+ i_issued + ", i_validthru=" + i_validthru + ", l_issued="
				+ l_issued + ", l_validthru=" + l_validthru + ", p_issued="
				+ p_issued + ", p_validthru=" + p_validthru + ", password="
				+ password + ", mobile=" + mobile + ", name=" + name
				+ ", preferedCarType=" + preferedCarType + ", passport_no="
				+ passport_no + "]";
	}

	 public String getIDP() {
			return IDP;
		}

		public void setIDP(String iDP) {
			IDP = iDP;
		}
}
