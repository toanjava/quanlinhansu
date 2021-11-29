package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "employee")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "gender")
	private String gender;
	@Column(name = "birthday")
	@Temporal(TemporalType.DATE)
	private Date birthday;
	@Column(name = "ethnic")
	private String ethnic;
	@Column(name = "image")
	private String image;
	@Column(name = "nativecountry")
	private String nativecountry;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "religion")
	private String religion;
	@Column(name = "marriage")
	private String marriage;
	@Column(name = "email")
	private String email;
	@Column(name = "citizenid")
	private String citizenid;
	@Column(name = "educational")
	private String educational;
	@Column(name = "academic")
	private String academic;
	@Column(name = "workingday")
	@Temporal(TemporalType.DATE)
	private Date workingday;
	@Column(name = "departmentname")
	private String departmentname;
	@Column(name = "phonenumber")
	private String phonenumber;
	@Column(name = "wagepolicy")
	private String wagepolicy;
	@Column(name = "position")
	private String position;
	@Column(name = "experience")
	private int experience;
	@Column(name = "address")
	private String address;
	@Column(name = "placebirth")
	private String placebirth;
	@Column(name = "seniority")
	private String seniority;
	@Column(name = "permanentaddress")
	private String permanentaddress;
	@Column(name = "actualsalary")
	private float actualsalary;
	@Column(name = "basicsalary")
	private float basicsalary;
	@Column(name = "active")
	private int active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNativecountry() {
		return nativecountry;
	}

	public void setNativecountry(String nativecountry) {
		this.nativecountry = nativecountry;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCitizenid() {
		return citizenid;
	}

	public void setCitizenid(String citizenid) {
		this.citizenid = citizenid;
	}

	public String getEducational() {
		return educational;
	}

	public void setEducational(String educational) {
		this.educational = educational;
	}

	public String getAcademic() {
		return academic;
	}

	public void setAcademic(String academic) {
		this.academic = academic;
	}

	public Date getWorkingday() {
		return workingday;
	}

	public void setWorkingday(Date workingday) {
		this.workingday = workingday;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getWagepolicy() {
		return wagepolicy;
	}

	public void setWagepolicy(String wagepolicy) {
		this.wagepolicy = wagepolicy;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPlacebirth() {
		return placebirth;
	}

	public void setPlacebirth(String placebirth) {
		this.placebirth = placebirth;
	}

	public String getSeniority() {
		return seniority;
	}

	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}

	public String getPermanentaddress() {
		return permanentaddress;
	}

	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}

	public float getActualsalary() {
		return actualsalary;
	}

	public void setActualsalary(float actualsalary) {
		this.actualsalary = actualsalary;
	}

	public float getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(float basicsalary) {
		this.basicsalary = basicsalary;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Employee() {
		super();
	}

}
