package doit.sharpenyoursaw.springpetclinic.model;

public class PetType extends BaseEntity {

	private static final long serialVersionUID = 2050293048862525748L;

	private String petType;

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

}
