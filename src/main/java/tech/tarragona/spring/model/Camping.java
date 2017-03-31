package tech.tarragona.spring.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="campings")
public class Camping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Size(max=30)
	private String address;

	@NotEmpty
	@Size(max=30)
	private String addressf;

	@NotEmpty
	@Size(max=10)
	private String cif;

	@NotEmpty
	@Size(max=25)
	private String city;

	@NotEmpty
	@Size(max=25)
	private String country;

	@NotEmpty
	@Size(max=10)
	private String cp;

	@Lob
	@NotEmpty
	private String description;
	
	@NotEmpty
	@Size(max=20)
	private String schedule;

	@NotEmpty
	@Email
	@Size(max=30)
	private String emailf;

	@NotNull
	private int idTelephone;

	@NotEmpty
	@Size(max=30)
	private String name;

	@NotEmpty
	@Size(max=30)
	private String namef;

	private int rates;

	private float rating;

	@NotEmpty
	@Size(max=15)
	private String telephone;

	@NotEmpty
	@Size(max=250)
	private String location;

	@NotEmpty
	@Size(max=30)
	private String zone;
	
	@OneToOne(mappedBy="camping", cascade = CascadeType.PERSIST)
	private CampingServices campingServices;
	

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
	
	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

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

	public int getIdTelephone() {
		return this.idTelephone;
	}

	public void setIdTelephone(int idTelephone) {
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

	public int getRates() {
		return this.rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}

	public float getRating() {
		return this.rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getlocation() {
		return this.location;
	}

	public void setlocation(String location) {
		this.location = location;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}