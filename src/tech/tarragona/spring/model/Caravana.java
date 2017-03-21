package tech.tarragona.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="caravanas")
public class Caravana implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@NotEmpty

	private String plate;
	
	//@Min(1)
	private int adults;
	
	private int babys;
	//@NotEmpty
	//@Size(min=5, max=50)
	private String brand;
	//@NotEmpty
	//@Range(min=1900, max=2017)

	@Column(name="construction_year")
	private int constructionYear;
	
	private int kids;


	//@NotEmpty
	//@Size(min=5, max=50)
	private String model;

	//bi-directional many-to-one association to Caracteristica
	@ManyToOne
	@JoinColumn(name="id_caracteristicas")
	private Caracteristica caracteristica;

	//bi-directional many-to-one association to Norma
	@ManyToOne
	@JoinColumn(name="id_normas")
	private Norma norma;

	//bi-directional many-to-one association to Servicio
	@ManyToOne
	@JoinColumn(name="id_servicios")
	private Servicio servicio;

	public Caravana() {
	}

	public String getPlate() {
		return this.plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getAdults() {
		return this.adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getBabys() {
		return this.babys;
	}

	public void setBabys(int babys) {
		this.babys = babys;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getConstructionYear() {
		return this.constructionYear;
	}

	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}

	public int getKids() {
		return this.kids;
	}

	public void setKids(int kids) {
		this.kids = kids;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Caracteristica getCaracteristica() {
		return this.caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

	public Norma getNorma() {
		return this.norma;
	}

	public void setNorma(Norma norma) {
		this.norma = norma;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

}