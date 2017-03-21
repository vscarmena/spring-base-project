package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the servicios database table.
 * 
 */
@Entity
@Table(name="servicios")
@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@Size(max=10)
	private String id;

	private byte bbq;

	@Column(name="bed_sheets")
	private byte bedSheets;

	private byte cycle;

	private byte hammock;

	private byte towels;

	private byte umbrella;

	//bi-directional many-to-one association to Caravana
	@OneToMany(mappedBy="servicio")
	private List<Caravana> caravanas;

	public Servicio() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getBbq() {
		return this.bbq;
	}

	public void setBbq(byte bbq) {
		this.bbq = bbq;
	}

	public byte getBedSheets() {
		return this.bedSheets;
	}

	public void setBedSheets(byte bedSheets) {
		this.bedSheets = bedSheets;
	}

	public byte getCycle() {
		return this.cycle;
	}

	public void setCycle(byte cycle) {
		this.cycle = cycle;
	}

	public byte getHammock() {
		return this.hammock;
	}

	public void setHammock(byte hammock) {
		this.hammock = hammock;
	}

	public byte getTowels() {
		return this.towels;
	}

	public void setTowels(byte towels) {
		this.towels = towels;
	}

	public byte getUmbrella() {
		return this.umbrella;
	}

	public void setUmbrella(byte umbrella) {
		this.umbrella = umbrella;
	}

	public List<Caravana> getCaravanas() {
		return this.caravanas;
	}

	public void setCaravanas(List<Caravana> caravanas) {
		this.caravanas = caravanas;
	}

	public Caravana addCaravana(Caravana caravana) {
		getCaravanas().add(caravana);
		caravana.setServicio(this);

		return caravana;
	}

	public Caravana removeCaravana(Caravana caravana) {
		getCaravanas().remove(caravana);
		caravana.setServicio(null);

		return caravana;
	}

}