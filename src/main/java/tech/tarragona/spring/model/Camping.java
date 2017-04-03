package tech.tarragona.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
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
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isAnimation() {
		return animation;
	}

	public void setAnimation(boolean animation) {
		this.animation = animation;
	}

	public boolean isAtm() {
		return atm;
	}

	public void setAtm(boolean atm) {
		this.atm = atm;
	}

	public boolean isBeach() {
		return beach;
	}

	public void setBeach(boolean beach) {
		this.beach = beach;
	}

	public boolean isDefibrillator() {
		return defibrillator;
	}

	public void setDefibrillator(boolean defibrillator) {
		this.defibrillator = defibrillator;
	}

	public boolean isDisco() {
		return disco;
	}

	public void setDisco(boolean disco) {
		this.disco = disco;
	}

	public boolean isDoctor() {
		return doctor;
	}

	public void setDoctor(boolean doctor) {
		this.doctor = doctor;
	}

	public boolean isDogs() {
		return dogs;
	}

	public void setDogs(boolean dogs) {
		this.dogs = dogs;
	}

	public boolean isFootball() {
		return football;
	}

	public void setFootball(boolean football) {
		this.football = football;
	}

	public boolean isGym() {
		return gym;
	}

	public void setGym(boolean gym) {
		this.gym = gym;
	}

	public boolean isHeatedPool() {
		return heatedPool;
	}

	public void setHeatedPool(boolean heatedPool) {
		this.heatedPool = heatedPool;
	}

	public boolean isKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(boolean kindergarten) {
		this.kindergarten = kindergarten;
	}

	public boolean isLaundry() {
		return laundry;
	}

	public void setLaundry(boolean laundry) {
		this.laundry = laundry;
	}

	public boolean isMinigolf() {
		return minigolf;
	}

	public void setMinigolf(boolean minigolf) {
		this.minigolf = minigolf;
	}

	public boolean isPaddel() {
		return paddel;
	}

	public void setPaddel(boolean paddel) {
		this.paddel = paddel;
	}

	public boolean isPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public boolean isPub() {
		return pub;
	}

	public void setPub(boolean pub) {
		this.pub = pub;
	}

	public boolean isRestaurant() {
		return restaurant;
	}

	public void setRestaurant(boolean restaurant) {
		this.restaurant = restaurant;
	}

	public boolean isSnackBar() {
		return snackBar;
	}

	public void setSnackBar(boolean snackBar) {
		this.snackBar = snackBar;
	}

	public boolean isSupermarket() {
		return supermarket;
	}

	public void setSupermarket(boolean supermarket) {
		this.supermarket = supermarket;
	}

	public boolean isTennis() {
		return tennis;
	}

	public void setTennis(boolean tennis) {
		this.tennis = tennis;
	}

	public boolean isWellness() {
		return wellness;
	}

	public void setWellness(boolean wellness) {
		this.wellness = wellness;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private boolean animation;

	private boolean atm;

	private boolean beach;

	private boolean defibrillator;

	private boolean disco;

	private boolean doctor;

	private boolean dogs;

	private boolean football;

	private boolean gym;

	@Column(name="heated_pool")
	private boolean heatedPool;

	private boolean kindergarten;

	private boolean laundry;

	private boolean minigolf;

	private boolean paddel;

	private boolean pool;

	private boolean pub;

	private boolean restaurant;

	@Column(name="snack_bar")
	private boolean snackBar;

	private boolean supermarket;

	private boolean tennis;
	
	private boolean wellness;

	private boolean wifi;
	

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

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}