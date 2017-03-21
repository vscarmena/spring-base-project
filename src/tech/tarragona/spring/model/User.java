package tech.tarragona.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@Entity
	@Table(name="persons")
	public class Person implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@Email
		@NotEmpty
		@OneToOne
		@JoinColumn(name="users")
		//TODO comprobar nombre de la tabla con primary key
		private String email;

		@NotEmpty
		private String address;

		private String addressf;

		@DateTimeFormat(pattern = "dd/mm/yyyy")
		private Date birthDate;

		@NotEmpty
		private String city;

		private String cityf;

		@NotNull
		private String country;

		private String countryf;

		@NotEmpty
		private String cp;

		private String CPf;

		@NotNull
		private int genre;

		@NotNull
		private int idTelephone;

		private int idTelephonef;

		@NotEmpty
		private String name;

		private String namef;

		@NotEmpty
		private String nif;

		@NotEmpty
		private String surname;

		private String surnamef;

		@NotEmpty
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
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAddressf() {
			return this.addressf;
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
}
