package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private boolean bbq;

	@Column(name="bed_sheets")
	private boolean bedSheets;

	private boolean cycle;

	private boolean hammock;

	private boolean towels;

	private boolean umbrella;

	
	@OneToOne
	@PrimaryKeyJoinColumn(name="id")
	private Caravan caravan;

	public Service() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getBbq() {
		return this.bbq;
	}

	public void setBbq(boolean bbq) {
		this.bbq = bbq;
	}

	public boolean getBedSheets() {
		return this.bedSheets;
	}

	public void setBedSheets(boolean bedSheets) {
		this.bedSheets = bedSheets;
	}

	public boolean getCycle() {
		return this.cycle;
	}

	public void setCycle(boolean cycle) {
		this.cycle = cycle;
	}

	public boolean getHammock() {
		return this.hammock;
	}

	public void setHammock(boolean hammock) {
		this.hammock = hammock;
	}

	public boolean getTowels() {
		return this.towels;
	}

	public void setTowels(boolean towels) {
		this.towels = towels;
	}

	public boolean getUmbrella() {
		return this.umbrella;
	}

	public void setUmbrella(boolean umbrella) {
		this.umbrella = umbrella;
	}

	public Caravan getCaravan() {
		return this.caravan;
	}

	public void setCaravan(Caravan caravan) {
		this.caravan = caravan;
	}

}