package tech.tarragona.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import tech.tarragona.spring.model.User;



@Entity
@Table(name="campings")
public class Camping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Integer owner;
    
    private String email;
    
    private String emailf;

    private String address;
    
    private String addressf;

	private String name;

    private String city;
    
    private String country;

    private String cp;

    private int idTelephone;

    private String namef;
    
    private User user;

    private String cif;

    private String telephone;
    
    private Float rating;
    
    private Integer rates;
    
    private String description;
    
    private String ubication;
    
    private String zone;
    
    
    
    public Camping(){
    }
  

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOwner() {
		return owner;
	}

	public void setOwner(Integer owner) {
		this.owner = owner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailf() {
		return emailf;
	}

	public void setEmailf(String emailf) {
		this.emailf = emailf;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getIdTelephone() {
		return idTelephone;
	}

	public void setIdTelephone(int idTelephone) {
		this.idTelephone = idTelephone;
	}

	public String getNamef() {
		return namef;
	}

	public void setNamef(String namef) {
		this.namef = namef;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Integer getRates() {
		return rates;
	}

	public void setRates(Integer rates) {
		this.rates = rates;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

}