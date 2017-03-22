package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name="campings")
public class Camping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="owner")
	private User user;

	public Camping() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}