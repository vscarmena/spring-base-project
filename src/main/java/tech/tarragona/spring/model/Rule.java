package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Rule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private boolean kids;

	private String other;

	private boolean party;

	private boolean pets;

	private boolean smoke;


	@OneToOne
	@PrimaryKeyJoinColumn(name="id")
	private Caravan caravan;

	public Rule() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Caravan getCaravan() {
		return this.caravan;
	}

	public void setCaravan(Caravan caravan) {
		this.caravan = caravan;
	}

}