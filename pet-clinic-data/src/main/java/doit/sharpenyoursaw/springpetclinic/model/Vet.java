package doit.sharpenyoursaw.springpetclinic.model;

import javax.persistence.Entity;

@Entity
public class Vet extends Person {

	private Speciality specialiy;

	public Speciality getSpecialiy() {
		return specialiy;
	}

	public void setSpecialiy(Speciality specialiy) {
		this.specialiy = specialiy;
	}

}
