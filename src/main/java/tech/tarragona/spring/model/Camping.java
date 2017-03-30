package tech.tarragona.spring.model;

import java.io.Serializable;
<<<<<<< HEAD
import javax.persistence.*;
=======

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
>>>>>>> feature/caravan-project


/**
 * The persistent class for the campings database table.
 * 
 */
@Entity
@Table(name="campings")

public class Camping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy=GenerationType.IDENTITY)
=======
>>>>>>> feature/caravan-project
	private Integer id;

	private String address;

	private String addressf;

	private String cif;

	private String city;

	private String country;

	private String cp;

	@Lob
	private String description;
<<<<<<< HEAD
	
	private String schedule;

	private String emailf;

	private int idTelephone;

	private String name;

	private String namef;

	private int rates;

	private float rating;

	private String telephone;

	private String ubication;

	private String zone;
=======

	private String emailf;
>>>>>>> feature/caravan-project

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
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getCif() {
		return this.cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCp() {
		return this.cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}
<<<<<<< HEAD
	
	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
=======
>>>>>>> feature/caravan-project

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailf() {
		return this.emailf;
	}

	public void setEmailf(String emailf) {
		this.emailf = emailf;
	}

<<<<<<< HEAD
	public int getIdTelephone() {
		return this.idTelephone;
	}

	public void setIdTelephone(int idTelephone) {
=======
	public Integer getIdTelephone() {
		return this.idTelephone;
	}

	public void setIdTelephone(Integer idTelephone) {
>>>>>>> feature/caravan-project
		this.idTelephone = idTelephone;
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

<<<<<<< HEAD
	public int getRates() {
		return this.rates;
	}

	public void setRates(int rates) {
=======
	public Integer getOwner() {
		return this.owner;
	}

	public void setOwner(Integer owner) {
		this.owner = owner;
	}

	public Integer getRates() {
		return this.rates;
	}

	public void setRates(Integer rates) {
>>>>>>> feature/caravan-project
		this.rates = rates;
	}

	public float getRating() {
		return this.rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

<<<<<<< HEAD
=======
	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

>>>>>>> feature/caravan-project
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUbication() {
		return this.ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public String getZone() {
		return this.zone;
<<<<<<< HEAD
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public User getUser() {
		return this.user;
=======
>>>>>>> feature/caravan-project
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}