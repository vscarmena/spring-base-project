package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
public class AvailabilityCaravan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_start1")
	private Date timeDispStart1;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_end1")
	private Date timeDispEnd1;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_start2")
	private Date timeDispStart2;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_end2")
	private Date timeDispEnd2;

	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_start3")
	private Date timeDispStart3;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_end3")
	private Date timeDispEnd3;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_start4")
	private Date timeDispStart4;

	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_end4")
	private Date timeDispEnd4;

	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_start5")
	private Date timeDispStart5;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_end5")
	private Date timeDispEnd5;

	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_start6")
	private Date timeDispStart6;
	
	@Temporal(TemporalType.DATE)
	@Column(name="time_disp_end6")
	private Date timeDispEnd6;

	
	//bi-directional one-to-one association to Caravan
	@OneToOne
	@JoinColumn(name="id")
	private Caravan caravan;

	public AvailabilityCaravan() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTimeDispEnd1() {
		return this.timeDispEnd1;
	}

	public void setTimeDispEnd1(Date timeDispEnd1) {
		this.timeDispEnd1 = timeDispEnd1;
	}

	public Date getTimeDispEnd2() {
		return this.timeDispEnd2;
	}

	public void setTimeDispEnd2(Date timeDispEnd2) {
		this.timeDispEnd2 = timeDispEnd2;
	}

	public Date getTimeDispEnd3() {
		return this.timeDispEnd3;
	}

	public void setTimeDispEnd3(Date timeDispEnd3) {
		this.timeDispEnd3 = timeDispEnd3;
	}

	public Date getTimeDispEnd4() {
		return this.timeDispEnd4;
	}

	public void setTimeDispEnd4(Date timeDispEnd4) {
		this.timeDispEnd4 = timeDispEnd4;
	}

	public Date getTimeDispEnd5() {
		return this.timeDispEnd5;
	}

	public void setTimeDispEnd5(Date timeDispEnd5) {
		this.timeDispEnd5 = timeDispEnd5;
	}

	public Date getTimeDispEnd6() {
		return this.timeDispEnd6;
	}

	public void setTimeDispEnd6(Date timeDispEnd6) {
		this.timeDispEnd6 = timeDispEnd6;
	}

	public Date getTimeDispStart1() {
		return this.timeDispStart1;
	}

	public void setTimeDispStart1(Date timeDispStart1) {
		this.timeDispStart1 = timeDispStart1;
	}

	public Date getTimeDispStart2() {
		return this.timeDispStart2;
	}

	public void setTimeDispStart2(Date timeDispStart2) {
		this.timeDispStart2 = timeDispStart2;
	}

	public Date getTimeDispStart3() {
		return this.timeDispStart3;
	}

	public void setTimeDispStart3(Date timeDispStart3) {
		this.timeDispStart3 = timeDispStart3;
	}

	public Date getTimeDispStart4() {
		return this.timeDispStart4;
	}

	public void setTimeDispStart4(Date timeDispStart4) {
		this.timeDispStart4 = timeDispStart4;
	}

	public Date getTimeDispStart5() {
		return this.timeDispStart5;
	}

	public void setTimeDispStart5(Date timeDispStart5) {
		this.timeDispStart5 = timeDispStart5;
	}

	public Date getTimeDispStart6() {
		return this.timeDispStart6;
	}

	public void setTimeDispStart6(Date timeDispStart6) {
		this.timeDispStart6 = timeDispStart6;
	}

	public Caravan getCaravan() {
		return this.caravan;
	}

	public void setCaravan(Caravan caravan) {
		this.caravan = caravan;
	}

}