package tech.tarragona.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the campings_services database table.
 * 
 */
@Entity
@Table(name="campings_services")
public class CampingServices implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

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

	private Camping camping;

	public CampingServices() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean getAnimation() {
		return this.animation;
	}

	public void setAnimation(boolean animation) {
		this.animation = animation;
	}

	public boolean getAtm() {
		return this.atm;
	}

	public void setAtm(boolean atm) {
		this.atm = atm;
	}

	public boolean getBeach() {
		return this.beach;
	}

	public void setBeach(boolean beach) {
		this.beach = beach;
	}

	public boolean getDefibrillator() {
		return this.defibrillator;
	}

	public void setDefibrillator(boolean defibrillator) {
		this.defibrillator = defibrillator;
	}

	public boolean getDisco() {
		return this.disco;
	}

	public void setDisco(boolean disco) {
		this.disco = disco;
	}

	public boolean getDoctor() {
		return this.doctor;
	}

	public void setDoctor(boolean doctor) {
		this.doctor = doctor;
	}

	public boolean getDogs() {
		return this.dogs;
	}

	public void setDogs(boolean dogs) {
		this.dogs = dogs;
	}

	public boolean getFootball() {
		return this.football;
	}

	public void setFootball(boolean football) {
		this.football = football;
	}

	public boolean getGym() {
		return this.gym;
	}

	public void setGym(boolean gym) {
		this.gym = gym;
	}

	public boolean getHeatedPool() {
		return this.heatedPool;
	}

	public void setHeatedPool(boolean heatedPool) {
		this.heatedPool = heatedPool;
	}

	public boolean getKindergarten() {
		return this.kindergarten;
	}

	public void setKindergarten(boolean kindergarten) {
		this.kindergarten = kindergarten;
	}

	public boolean getLaundry() {
		return this.laundry;
	}

	public void setLaundry(boolean laundry) {
		this.laundry = laundry;
	}

	public boolean getMinigolf() {
		return this.minigolf;
	}

	public void setMinigolf(boolean minigolf) {
		this.minigolf = minigolf;
	}

	public boolean getPaddel() {
		return this.paddel;
	}

	public void setPaddel(boolean paddel) {
		this.paddel = paddel;
	}

	public boolean getPool() {
		return this.pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public boolean getPub() {
		return this.pub;
	}

	public void setPub(boolean pub) {
		this.pub = pub;
	}

	public boolean getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(boolean restaurant) {
		this.restaurant = restaurant;
	}

	public boolean getSnackBar() {
		return this.snackBar;
	}

	public void setSnackBar(boolean snackBar) {
		this.snackBar = snackBar;
	}

	public boolean getSupermarket() {
		return this.supermarket;
	}

	public void setSupermarket(boolean supermarket) {
		this.supermarket = supermarket;
	}

	public boolean getTennis() {
		return this.tennis;
	}

	public void setTennis(boolean tennis) {
		this.tennis = tennis;
	}

	public boolean getWifi() {
		return this.wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public Camping getCamping() {
		return this.camping;
	}

	public void setCamping(Camping camping) {
		this.camping = camping;
	}

	public boolean getWellness() {
		return wellness;
	}

	public void setWellness(boolean wellnes) {
		this.wellness = wellnes;
	}

}