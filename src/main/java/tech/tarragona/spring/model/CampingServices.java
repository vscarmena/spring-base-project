package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;


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

	private byte animation;

	private byte atm;

	private byte beach;

	private byte defibrillator;

	private byte disco;

	private byte doctor;

	private byte dogs;

	private byte football;

	private byte gym;

	@Column(name="heated_pool")
	private byte heatedPool;

	private byte kindergarten;

	private byte laundry;

	private byte minigolf;

	private byte paddel;

	private byte pool;

	private byte pub;

	private byte restaurant;

	@Column(name="snack_bar")
	private byte snackBar;

	private byte supermarket;

	private byte tennis;
	
	private byte wellness;

	private byte wifi;

	//bi-directional many-to-one association to Camping
	@ManyToOne
	private Camping camping;

	public CampingServices() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte getAnimation() {
		return this.animation;
	}

	public void setAnimation(byte animation) {
		this.animation = animation;
	}

	public byte getAtm() {
		return this.atm;
	}

	public void setAtm(byte atm) {
		this.atm = atm;
	}

	public byte getBeach() {
		return this.beach;
	}

	public void setBeach(byte beach) {
		this.beach = beach;
	}

	public byte getDefibrillator() {
		return this.defibrillator;
	}

	public void setDefibrillator(byte defibrillator) {
		this.defibrillator = defibrillator;
	}

	public byte getDisco() {
		return this.disco;
	}

	public void setDisco(byte disco) {
		this.disco = disco;
	}

	public byte getDoctor() {
		return this.doctor;
	}

	public void setDoctor(byte doctor) {
		this.doctor = doctor;
	}

	public byte getDogs() {
		return this.dogs;
	}

	public void setDogs(byte dogs) {
		this.dogs = dogs;
	}

	public byte getFootball() {
		return this.football;
	}

	public void setFootball(byte football) {
		this.football = football;
	}

	public byte getGym() {
		return this.gym;
	}

	public void setGym(byte gym) {
		this.gym = gym;
	}

	public byte getHeatedPool() {
		return this.heatedPool;
	}

	public void setHeatedPool(byte heatedPool) {
		this.heatedPool = heatedPool;
	}

	public byte getKindergarten() {
		return this.kindergarten;
	}

	public void setKindergarten(byte kindergarten) {
		this.kindergarten = kindergarten;
	}

	public byte getLaundry() {
		return this.laundry;
	}

	public void setLaundry(byte laundry) {
		this.laundry = laundry;
	}

	public byte getMinigolf() {
		return this.minigolf;
	}

	public void setMinigolf(byte minigolf) {
		this.minigolf = minigolf;
	}

	public byte getPaddel() {
		return this.paddel;
	}

	public void setPaddel(byte paddel) {
		this.paddel = paddel;
	}

	public byte getPool() {
		return this.pool;
	}

	public void setPool(byte pool) {
		this.pool = pool;
	}

	public byte getPub() {
		return this.pub;
	}

	public void setPub(byte pub) {
		this.pub = pub;
	}

	public byte getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(byte restaurant) {
		this.restaurant = restaurant;
	}

	public byte getSnackBar() {
		return this.snackBar;
	}

	public void setSnackBar(byte snackBar) {
		this.snackBar = snackBar;
	}

	public byte getSupermarket() {
		return this.supermarket;
	}

	public void setSupermarket(byte supermarket) {
		this.supermarket = supermarket;
	}

	public byte getTennis() {
		return this.tennis;
	}

	public void setTennis(byte tennis) {
		this.tennis = tennis;
	}

	public byte getWifi() {
		return this.wifi;
	}

	public void setWifi(byte wifi) {
		this.wifi = wifi;
	}

	public Camping getCamping() {
		return this.camping;
	}

	public void setCamping(Camping camping) {
		this.camping = camping;
	}

	public byte getWellnes() {
		return wellness;
	}

	public void setWellnes(byte wellnes) {
		this.wellness = wellnes;
	}

}