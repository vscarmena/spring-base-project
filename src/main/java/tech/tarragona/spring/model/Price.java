package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the price database table.
 * 
 */
@Entity
@NamedQuery(name="Price.findAll", query="SELECT p FROM Price p")
public class Price implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="end_date")
	private String endDate;

	@Column(name="init_date")
	private String initDate;

	private BigDecimal price;

	//bi-directional many-to-one association to Caravan
	@ManyToOne
	@JoinColumn(name="id_caravan")
	private Caravan caravan;

	public Price() {
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

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Caravan getCaravan() {
		return this.caravan;
	}

	public void setCaravan(Caravan caravan) {
		this.caravan = caravan;
	}

}