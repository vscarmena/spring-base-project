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

	private boolean kids;
	//@Size(max=100)
	private String other;

	private boolean party;

	private boolean pets;

	private boolean smoke;

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