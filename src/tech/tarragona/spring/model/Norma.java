package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the norma database table.
 * 
 */
@Entity
@NamedQuery(name="Norma.findAll", query="SELECT n FROM Norma n")
public class Norma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String plate;

	private boolean kids;

	private String other;

	private boolean party;

	private boolean pets;

	private boolean smoke;

	//bi-directional one-to-one association to Caravana
	@OneToOne
	@PrimaryKeyJoinColumn(name="plate")
	private Caravana caravana;

	public Norma() {
	}

	public String getPlate() {
		return this.plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public boolean getKids() {
		return this.kids;
	}

	public void setKids(boolean kids) {
		this.kids = kids;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public boolean getParty() {
		return this.party;
	}

	public void setParty(boolean party) {
		this.party = party;
	}

	public boolean getPets() {
		return this.pets;
	}

	public void setPets(boolean pets) {
		this.pets = pets;
	}

	public boolean getSmoke() {
		return this.smoke;
	}

	public void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}

	public Caravana getCaravana() {
		return this.caravana;
	}

	public void setCaravana(Caravana caravana) {
		this.caravana = caravana;
	}

}