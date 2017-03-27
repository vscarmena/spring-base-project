package tech.tarragona.spring.type;

public enum Role {
	
	USER ("ROLE_USER", 1),
	ADMIN ("ROLE_ADMIN", 2);
	
	private final String value;
	private final Integer id;
	
	private Role(String value, Integer id) {
		this.value = value;
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public Integer getId() {
		return id;
	}

}
