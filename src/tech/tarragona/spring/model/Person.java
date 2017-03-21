package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="persons")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String email;

	private String address;

	private String addressf;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private String city;

	private String cityf;

	private String country;

	private String countryf;

	private String cp;

	private String CPf;

	private int genre;

	private int idTelephone;

	private int idTelephonef;

	private String name;

	private String namef;

	private String nif;

	private String surname;

	private String surnamef;

	private String telephone;

	private String telephonef;

	public Person() {
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressf() {
		return addressf;
	}

	public void setAddressf(String addressf) {
		this.addressf = addressf;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityf() {
		return this.cityf;
	}

	public void setCityf(String cityf) {
		this.cityf = cityf;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryf() {
		return this.countryf;
	}

	public void setCountryf(String countryf) {
		this.countryf = countryf;
	}

	public String getCp() {
		return this.cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCPf() {
		return this.CPf;
	}

	public void setCPf(String CPf) {
		this.CPf = CPf;
	}

	public int getGenre() {
		return this.genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public int getIdTelephone() {
		return this.idTelephone;
	}

	public void setIdTelephone(int idTelephone) {
		this.idTelephone = idTelephone;
	}

	public int getIdTelephonef() {
		return this.idTelephonef;
	}

	public void setIdTelephonef(int idTelephonef) {
		this.idTelephonef = idTelephonef;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamef() {
		return this.namef;
	}

	public void setNamef(String namef) {
		this.namef = namef;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurnamef() {
		return this.surnamef;
	}

	public void setSurnamef(String surnamef) {
		this.surnamef = surnamef;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephonef() {
		return this.telephonef;
	}

	public void setTelephonef(String telephonef) {
		this.telephonef = telephonef;
	}

}