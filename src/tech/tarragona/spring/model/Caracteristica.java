package tech.tarragona.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * The persistent class for the caracteristicas database table.
 * 
 */
@Entity
@Table(name="caracteristicas")
@NamedQuery(name="Caracteristica.findAll", query="SELECT c FROM Caracteristica c")
public class Caracteristica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @NotEmpty
	//@Size(max=10)
	private String id;

	private byte awning;

	private byte bath;

	private byte beds;

	private byte climatize;

	private byte closer;

	private byte fridge;

	private byte kitchen;

	private byte living;

	@Column(name="terrace_table")
	private byte terraceTable;

	private byte tv;

	//bi-directional many-to-one association to Caravana
	@OneToMany(mappedBy="caracteristica")
	private List<Caravana> caravanas;

	public Caracteristica() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getAwning() {
		return this.awning;
	}

	public void setAwning(byte awning) {
		this.awning = awning;
	}

	public byte getBath() {
		return this.bath;
	}

	public void setBath(byte bath) {
		this.bath = bath;
	}

	public byte getBeds() {
		return this.beds;
	}

	public void setBeds(byte beds) {
		this.beds = beds;
	}

	public byte getClimatize() {
		return this.climatize;
	}

	public void setClimatize(byte climatize) {
		this.climatize = climatize;
	}

	public byte getCloser() {
		return this.closer;
	}

	public void setCloser(byte closer) {
		this.closer = closer;
	}

	public byte getFridge() {
		return this.fridge;
	}

	public void setFridge(byte fridge) {
		this.fridge = fridge;
	}

	public byte getKitchen() {
		return this.kitchen;
	}

	public void setKitchen(byte kitchen) {
		this.kitchen = kitchen;
	}

	public byte getLiving() {
		return this.living;
	}

	public void setLiving(byte living) {
		this.living = living;
	}

	public byte getTerraceTable() {
		return this.terraceTable;
	}

	public void setTerraceTable(byte terraceTable) {
		this.terraceTable = terraceTable;
	}

	public byte getTv() {
		return this.tv;
	}

	public void setTv(byte tv) {
		this.tv = tv;
	}

	public List<Caravana> getCaravanas() {
		return this.caravanas;
	}

	public void setCaravanas(List<Caravana> caravanas) {
		this.caravanas = caravanas;
	}

	public Caravana addCaravana(Caravana caravana) {
		getCaravanas().add(caravana);
		caravana.setCaracteristica(this);

		return caravana;
	}

	public Caravana removeCaravana(Caravana caravana) {
		getCaravanas().remove(caravana);
		caravana.setCaracteristica(null);

		return caravana;
	}

}