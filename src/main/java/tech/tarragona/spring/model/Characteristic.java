package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Characteristic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private boolean awning;

	private boolean bath;

	private boolean beds;

	private boolean climatize;

	private boolean closer;

	private boolean fridge;

	private boolean kitchen;

	private boolean living;

	@Column(name="terrace_table")
	private boolean terraceTable;

	private boolean tv;
	
	private boolean oven;
	
	@Column(name="terrace_chairs")
	private boolean terraceChairs;
	
	private boolean shower;
	
	private boolean crockery;
	
	@Column(name="skillets_casseroles")
	private boolean skilletsCasseroles;
	
	private boolean cutlery;
	
	private String others;

	
	@OneToOne
	@PrimaryKeyJoinColumn(name="id")
	private Caravan caravan;

	public Characteristic() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getAwning() {
		return this.awning;
	}

	public void setAwning(boolean awning) {
		this.awning = awning;
	}

	public boolean getBath() {
		return this.bath;
	}

	public void setBath(boolean bath) {
		this.bath = bath;
	}

	public boolean getBeds() {
		return this.beds;
	}

	public void setBeds(boolean beds) {
		this.beds = beds;
	}

	public boolean getClimatize() {
		return this.climatize;
	}

	public void setClimatize(boolean climatize) {
		this.climatize = climatize;
	}

	public boolean getCloser() {
		return this.closer;
	}

	public void setCloser(boolean closer) {
		this.closer = closer;
	}

	public boolean getFridge() {
		return this.fridge;
	}

	public void setFridge(boolean fridge) {
		this.fridge = fridge;
	}

	public boolean getKitchen() {
		return this.kitchen;
	}

	public void setKitchen(boolean kitchen) {
		this.kitchen = kitchen;
	}

	public boolean getLiving() {
		return this.living;
	}

	public void setLiving(boolean living) {
		this.living = living;
	}

	public boolean getTerraceTable() {
		return this.terraceTable;
	}

	public void setTerraceTable(boolean terraceTable) {
		this.terraceTable = terraceTable;
	}

	public boolean getTv() {
		return this.tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public Caravan getCaravan() {
		return this.caravan;
	}

	public void setCaravan(Caravan caravan) {
		this.caravan = caravan;
	}

	public boolean isOven() {
		return oven;
	}

	public void setOven(boolean oven) {
		this.oven = oven;
	}

	public boolean isTerraceChairs() {
		return terraceChairs;
	}

	public void setTerraceChairs(boolean terraceChairs) {
		this.terraceChairs = terraceChairs;
	}

	public boolean isShower() {
		return shower;
	}

	public void setShower(boolean shower) {
		this.shower = shower;
	}

	public boolean isCrockery() {
		return crockery;
	}

	public void setCrockery(boolean crockery) {
		this.crockery = crockery;
	}

	public boolean isSkilletsCasseroles() {
		return skilletsCasseroles;
	}

	public void setSkilletsCasseroles(boolean skilletsCasseroles) {
		this.skilletsCasseroles = skilletsCasseroles;
	}

	public boolean isCutlery() {
		return cutlery;
	}

	public void setCutlery(boolean cutlery) {
		this.cutlery = cutlery;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}
	
	

}