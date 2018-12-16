package doit.sharpenyoursaw.springpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -1939854343902912574L;

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
