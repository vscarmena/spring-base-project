package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the availability database table.
 * 
 */
@Entity
public class Availability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="end_date")
	private String endDate;

	@Column(name="init_date")
	private String initDate;

	//bi-directional many-to-one association to Caravan
	@ManyToOne
	@JoinColumn(name="id_caravan")
	private Caravan caravan;

	public Availability() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInitDate() {
		return this.initDate;
	}

	public void setInitDate(String initDate) {
		this.initDate = initDate;
	}

	public Caravan getCaravan() {
		return this.caravan;
	}

	public void setCaravan(Caravan caravan) {
		this.caravan = caravan;
	}

}