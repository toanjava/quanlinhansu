package com.example.demo.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EmployeeDto {
	private int id;

	private String name;

	private String gender;

	private Date birthday;

	private String ethnic;

	private String image;

	private String nativecountry;
	private String nationality;
	private String religion;
	private String marriage;
	private String email;
	private String citizenid;
	private String educational;
	private String academic;
	private Date workingday;
	private String departmentname;
	private String phonenumber;
	private String wagepolicy;
	private String position;
	private int experience;
	private String address;
	private String placebirth;
	private String seniority;
	private String permanentaddress;
	private float actualsalary;
	private float basicsalary;
	private int active;

	@JsonIgnore
	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

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

	public EmployeeDto() {
		super();
	}

}
