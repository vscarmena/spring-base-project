package tech.tarragona.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="user_data")
public class UserData implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
   
    
    private String email;

    @NotEmpty
    @Size(max=40)
    private String address;

	@NotEmpty
	@Size(max=15)
    private String name;
	
	
	private User user;
	
    private String addressf;

    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date birthDate;

    @NotEmpty
    @Size(max=15)
    private String city;

    private String cityf;

    @NotEmpty
    private String country;

    private String countryf;

    @NotEmpty
    @Size(max=10)
    private String cp;

    private String CPf;

    @NotNull
    private Integer genre;

    @Max(value=2)
    @NotNull
    private Integer idTelephone;

    private Integer idTelephonef;

    private String namef;

    @NotEmpty
    @Size(max=15)
    private String nif;

    @NotEmpty
    @Size(max=25)
    private String surname;

    private String surnamef;

    @NotEmpty
    @Size(max=15)
    private String telephone;

    private String telephonef;
		
	public UserData() {
    }
	
	public UserData(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
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
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityf() {
		return cityf;
	}

	public void setCityf(String cityf) {
		this.cityf = cityf;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryf() {
		return countryf;
	}

	public void setCountryf(String countryf) {
		this.countryf = countryf;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCPf() {
		return CPf;
	}

	public void setCPf(String cPf) {
		CPf = cPf;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public Integer getIdTelephone() {
		return idTelephone;
	}

	public void setIdTelephone(Integer idTelephone) {
		this.idTelephone = idTelephone;
	}

	public Integer getIdTelephonef() {
		return idTelephonef;
	}

	public void setIdTelephonef(Integer idTelephonef) {
		this.idTelephonef = idTelephonef;
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

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurnamef() {
		return surnamef;
	}

	public void setSurnamef(String surnamef) {
		this.surnamef = surnamef;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephonef() {
		return telephonef;
	}

	public void setTelephonef(String telephonef) {
		this.telephonef = telephonef;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}