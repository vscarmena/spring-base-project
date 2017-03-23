package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the servicio database table.
 * 
 */
@Entity

public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String plate;

	private boolean bbq;

	@Column(name="bed_sheets")
	private boolean bedSheets;

	private boolean cycle;

	private boolean hammock;

	private boolean towels;

	private boolean umbrella;

	//bi-directional one-to-one association to Caravana
	@OneToOne(targetEntity=Caravana.class)
	@PrimaryKeyJoinColumn(name="plate", referencedColumnName="plate")
	private Caravana caravana;

	public Servicio() {
	}

	public String getPlate() {
		return this.plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public boolean getBbq() {
		return this.bbq;
	}

	public void setBbq(boolean bbq) {
		this.bbq = bbq;
	}

	public boolean getBedSheets() {
		return this.bedSheets;
	}

	public void setBedSheets(boolean bedSheets) {
		this.bedSheets = bedSheets;
	}

	public boolean getCycle() {
		return this.cycle;
	}

	public void setCycle(boolean cycle) {
		this.cycle = cycle;
	}

	public boolean getHammock() {
		return this.hammock;
	}

	public void setHammock(boolean hammock) {
		this.hammock = hammock;
	}

	public boolean getTowels() {
		return this.towels;
	}

	public void setTowels(boolean towels) {
		this.towels = towels;
	}

	public boolean getUmbrella() {
		return this.umbrella;
	}

	public void setUmbrella(boolean umbrella) {
		this.umbrella = umbrella;
	}

	public Caravana getCaravana() {
		return this.caravana;
	}

	public void setCaravana(Caravana caravana) {
		this.caravana = caravana;
	}

}