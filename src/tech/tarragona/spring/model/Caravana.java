package tech.tarragona.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * The persistent class for the caravana database table.
 *
 */
@Entity
@NamedQuery(name = "Caravana.findAll", query = "SELECT c FROM Caravana c")
public class Caravana implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@NotEmpty
	@Length(min = 5)
	@Size(max = 10)
	private String plate;

	private int adults;

	private int babys;
	@NotNull
	@NotEmpty
	@Length(min = 2)
	@Size(max = 15)
	private String brand;
	
	@Column(name = "construction_year")
	private Integer constructionYear;
	
	
	@Size(max = 255)
	private String description;

	private int kids;
	@NotNull
	@NotEmpty
	@Length(min = 2)
	@Size(max = 15)
	private String model;
	
	@NotEmpty
	@Length(min = 2)
	@Size(max = 50)
	private String name;

	// bi-directional one-to-one association to Caracteristica
	@OneToOne(mappedBy = "caravana")
	private Caracteristica caracteristica;

	// bi-directional one-to-one association to Norma
	@OneToOne(mappedBy = "caravana")
	private Norma norma;

	// bi-directional one-to-one association to Servicio
	@OneToOne(mappedBy = "caravana", targetEntity = Servicio.class)
	private Servicio servicio;
	
	private String recommendation;

	@NotEmpty
	@Length(min = 1)
	@Size(max = 12)
	private String stay_lenght_min;
	
	@NotEmpty
	@Length(min = 1)
	@Size(max = 20)
	private String stay_lenght_max;
	
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

	public Integer getConstructionYear() {
		return this.constructionYear;
	}

	public void setConstructionYear(Integer constructionYear) {
		this.constructionYear = constructionYear;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public String getStay_lenght_min() {
		return stay_lenght_min;
	}

	public void setStay_lenght_min(String stay_lenght_min) {
		this.stay_lenght_min = stay_lenght_min;
	}

	public String getStay_lenght_max() {
		return stay_lenght_max;
	}

	public void setStay_lenght_max(String stay_lenght_max) {
		this.stay_lenght_max = stay_lenght_max;
	}

}