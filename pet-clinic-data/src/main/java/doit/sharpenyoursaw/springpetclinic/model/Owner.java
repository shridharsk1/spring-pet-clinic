package doit.sharpenyoursaw.springpetclinic.model;

import java.util.Set;

public class Owner extends Person {

	private static final long serialVersionUID = 3838735762195966335L;

	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

}
