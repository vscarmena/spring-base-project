package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
public class PriceCaravan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_start1")
	private Date timePriceStart1;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_end1")
	private Date timePriceEnd1;
	
	@Column(name="price_caravan1")
	private int priceCaravan1;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_start2")
	private Date timePriceStart2;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_end2")
	private Date timePriceEnd2;

	@Column(name="price_caravan2")
	private int priceCaravan2;

	@Temporal(TemporalType.DATE)
	@Column(name="time_price_start3")
	private Date timePriceStart3;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_end3")
	private Date timePriceEnd3;
	
	@Column(name="price_caravan3")
	private int priceCaravan3;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_start4")
	private Date timePriceStart4;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_end4")
	private Date timePriceEnd4;

	@Column(name="price_caravan4")
	private int priceCaravan4;

	@Temporal(TemporalType.DATE)
	@Column(name="time_price_start5")
	private Date timePriceStart5;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_end5")
	private Date timePriceEnd5;
	
	@Column(name="price_caravan5")
	private int priceCaravan5;

	@Temporal(TemporalType.DATE)
	@Column(name="time_price_start6")
	private Date timePriceStart6;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_end6")
	private Date timePriceEnd6;
	
	@Column(name="price_caravan6")
	private int priceCaravan6;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_start7")
	private Date timePriceStart7;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_end7")
	private Date timePriceEnd7;

	@Column(name="price_caravan7")
	private int priceCaravan7;

	@Temporal(TemporalType.DATE)
	@Column(name="time_price_start8")
	private Date timePriceStart8;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_price_end8")
	private Date timePriceEnd8;
	
	@Column(name="price_caravan8")
	private int priceCaravan8;

		
	//bi-directional one-to-one association to Caravan
	@OneToOne
	@PrimaryKeyJoinColumn(name="id")
	private Caravan caravan;

	public PriceCaravan() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPriceCaravan1() {
		return this.priceCaravan1;
	}

	public void setPriceCaravan1(int priceCaravan1) {
		this.priceCaravan1 = priceCaravan1;
	}

	public int getPriceCaravan2() {
		return this.priceCaravan2;
	}

	public void setPriceCaravan2(int priceCaravan2) {
		this.priceCaravan2 = priceCaravan2;
	}

	public int getPriceCaravan3() {
		return this.priceCaravan3;
	}

	public void setPriceCaravan3(int priceCaravan3) {
		this.priceCaravan3 = priceCaravan3;
	}

	public int getPriceCaravan4() {
		return this.priceCaravan4;
	}

	public void setPriceCaravan4(int priceCaravan4) {
		this.priceCaravan4 = priceCaravan4;
	}

	public int getPriceCaravan5() {
		return this.priceCaravan5;
	}

	public void setPriceCaravan5(int priceCaravan5) {
		this.priceCaravan5 = priceCaravan5;
	}

	public int getPriceCaravan6() {
		return this.priceCaravan6;
	}

	public void setPriceCaravan6(int priceCaravan6) {
		this.priceCaravan6 = priceCaravan6;
	}

	public int getPriceCaravan7() {
		return this.priceCaravan7;
	}

	public void setPriceCaravan7(int priceCaravan7) {
		this.priceCaravan7 = priceCaravan7;
	}

	public int getPriceCaravan8() {
		return this.priceCaravan8;
	}

	public void setPriceCaravan8(int priceCaravan8) {
		this.priceCaravan8 = priceCaravan8;
	}

	public Date getTimePriceEnd1() {
		return this.timePriceEnd1;
	}

	public void setTimePriceEnd1(Date timePriceEnd1) {
		this.timePriceEnd1 = timePriceEnd1;
	}

	public Date getTimePriceEnd2() {
		return this.timePriceEnd2;
	}

	public void setTimePriceEnd2(Date timePriceEnd2) {
		this.timePriceEnd2 = timePriceEnd2;
	}

	public Date getTimePriceEnd3() {
		return this.timePriceEnd3;
	}

	public void setTimePriceEnd3(Date timePriceEnd3) {
		this.timePriceEnd3 = timePriceEnd3;
	}

	public Date getTimePriceEnd4() {
		return this.timePriceEnd4;
	}

	public void setTimePriceEnd4(Date timePriceEnd4) {
		this.timePriceEnd4 = timePriceEnd4;
	}

	public Date getTimePriceEnd5() {
		return this.timePriceEnd5;
	}

	public void setTimePriceEnd5(Date timePriceEnd5) {
		this.timePriceEnd5 = timePriceEnd5;
	}

	public Date getTimePriceEnd6() {
		return this.timePriceEnd6;
	}

	public void setTimePriceEnd6(Date timePriceEnd6) {
		this.timePriceEnd6 = timePriceEnd6;
	}

	public Date getTimePriceEnd7() {
		return this.timePriceEnd7;
	}

	public void setTimePriceEnd7(Date timePriceEnd7) {
		this.timePriceEnd7 = timePriceEnd7;
	}

	public Date getTimePriceEnd8() {
		return this.timePriceEnd8;
	}

	public void setTimePriceEnd8(Date timePriceEnd8) {
		this.timePriceEnd8 = timePriceEnd8;
	}

	public Date getTimePriceStart1() {
		return this.timePriceStart1;
	}

	public void setTimePriceStart1(Date timePriceStart1) {
		this.timePriceStart1 = timePriceStart1;
	}

	public Date getTimePriceStart2() {
		return this.timePriceStart2;
	}

	public void setTimePriceStart2(Date timePriceStart2) {
		this.timePriceStart2 = timePriceStart2;
	}

	public Date getTimePriceStart3() {
		return this.timePriceStart3;
	}

	public void setTimePriceStart3(Date timePriceStart3) {
		this.timePriceStart3 = timePriceStart3;
	}

	public Date getTimePriceStart4() {
		return this.timePriceStart4;
	}

	public void setTimePriceStart4(Date timePriceStart4) {
		this.timePriceStart4 = timePriceStart4;
	}

	public Date getTimePriceStart5() {
		return this.timePriceStart5;
	}

	public void setTimePriceStart5(Date timePriceStart5) {
		this.timePriceStart5 = timePriceStart5;
	}

	public Date getTimePriceStart6() {
		return this.timePriceStart6;
	}

	public void setTimePriceStart6(Date timePriceStart6) {
		this.timePriceStart6 = timePriceStart6;
	}

	public Date getTimePriceStart7() {
		return this.timePriceStart7;
	}

	public void setTimePriceStart7(Date timePriceStart7) {
		this.timePriceStart7 = timePriceStart7;
	}

	public Date getTimePriceStart8() {
		return this.timePriceStart8;
	}

	public void setTimePriceStart8(Date timePriceStart8) {
		this.timePriceStart8 = timePriceStart8;
	}

	public Caravan getCaravan() {
		return this.caravan;
	}

	public void setCaravan(Caravan caravan) {
		this.caravan = caravan;
	}

}