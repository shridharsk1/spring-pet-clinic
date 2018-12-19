package doit.sharpenyoursaw.springpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Visit extends BaseEntity {

	private static final long serialVersionUID = -6172690110811655907L;

	private LocalDate visitDate;

	private String description;

	private Pet pet;

	public LocalDate getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
