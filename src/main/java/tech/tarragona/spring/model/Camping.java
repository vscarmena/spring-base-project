package tech.tarragona.spring.model;

import java.io.Serializable;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



/**
 * The persistent class for the campings database table.
 * 
 */
@Entity
@Table(name="campings")

public class Camping implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)


	private Integer id;

	private String address;

	private String addressf;

	private String cif;

	private String city;

	private String country;

	private String cp;

	@Lob
	private String description;

	private String emailf;

	private Integer idTelephone;

	private String name;

	private String namef;

	private Integer owner;

	private Integer rates;

	private float rating;

	private String schedule;

	private String telephone;

	private String ubication;

	private String zone;

	public Camping() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailf() {
		return emailf;
	}

	public void setEmailf(String emailf) {
		this.emailf = emailf;
	}

	public Integer getIdTelephone() {
		return idTelephone;
	}

	public void setIdTelephone(Integer idTelephone) {
		this.idTelephone = idTelephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamef() {
		return namef;
	}

	public void setNamef(String namef) {
		this.namef = namef;
	}

	public Integer getOwner() {
		return owner;
	}

	public void setOwner(Integer owner) {
		this.owner = owner;
	}

	public Integer getRates() {
		return rates;
	}

	public void setRates(Integer rates) {
		this.rates = rates;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}