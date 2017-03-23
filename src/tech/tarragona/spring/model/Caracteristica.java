package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the caracteristica database table.
 * 
 */
@Entity
@NamedQuery(name="Caracteristica.findAll", query="SELECT c FROM Caracteristica c")
public class Caracteristica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String plate;

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

	//bi-directional one-to-one association to Caravana
	@OneToOne
	@PrimaryKeyJoinColumn(name="plate")
	private Caravana caravana;

	public Caracteristica() {
	}

	public String getPlate() {
		return this.plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
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

	public Caravana getCaravana() {
		return this.caravana;
	}

	public void setCaravana(Caravana caravana) {
		this.caravana = caravana;
	}

}