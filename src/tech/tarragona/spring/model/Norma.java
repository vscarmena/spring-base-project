package tech.tarragona.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="normas")
public class Norma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@NotEmpty
	//@Size(max=10)
	private String id;

	private byte kids;
	//@Size(max=100)
	private String other;

	private byte party;

	private byte pets;

	private byte smoke;

	//bi-directional many-to-one association to Caravana
	@OneToMany(mappedBy="norma")
	private List<Caravana> caravanas;

	public Norma() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getKids() {
		return this.kids;
	}

	public void setKids(byte kids) {
		this.kids = kids;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public byte getParty() {
		return this.party;
	}

	public void setParty(byte party) {
		this.party = party;
	}

	public byte getPets() {
		return this.pets;
	}

	public void setPets(byte pets) {
		this.pets = pets;
	}

	public byte getSmoke() {
		return this.smoke;
	}

	public void setSmoke(byte smoke) {
		this.smoke = smoke;
	}

	public List<Caravana> getCaravanas() {
		return this.caravanas;
	}

	public void setCaravanas(List<Caravana> caravanas) {
		this.caravanas = caravanas;
	}

	public Caravana addCaravana(Caravana caravana) {
		getCaravanas().add(caravana);
		caravana.setNorma(this);

		return caravana;
	}

	public Caravana removeCaravana(Caravana caravana) {
		getCaravanas().remove(caravana);
		caravana.setNorma(null);

		return caravana;
	}

}