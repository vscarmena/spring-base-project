package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_facturation_data database table.
 * 
 */
@Entity
@Table(name="user_facturation_data")
public class UserFacturationData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String addressf;

	private String emailf;

	private String namef;

	private String niff;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public UserFacturationData() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressf() {
		return this.addressf;
	}

	public void setAddressf(String addressf) {
		this.addressf = addressf;
	}

	public String getEmailf() {
		return this.emailf;
	}

	public void setEmailf(String emailf) {
		this.emailf = emailf;
	}

	public String getNamef() {
		return this.namef;
	}

	public void setNamef(String namef) {
		this.namef = namef;
	}

	public String getNiff() {
		return this.niff;
	}

	public void setNiff(String niff) {
		this.niff = niff;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}