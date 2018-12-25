package doit.sharpenyoursaw.springpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import doit.sharpenyoursaw.springpetclinic.model.Owner;
import doit.sharpenyoursaw.springpetclinic.model.Pet;
import doit.sharpenyoursaw.springpetclinic.model.PetType;
import doit.sharpenyoursaw.springpetclinic.model.Vet;
import doit.sharpenyoursaw.springpetclinic.services.OwnerService;
import doit.sharpenyoursaw.springpetclinic.services.PetTypeService;
import doit.sharpenyoursaw.springpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private OwnerService ownerService;

	private VetService vetService;

	private PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {
		PetType dog = new PetType();
		dog.setPetType("dog");
		PetType savedPetTypeDog = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setPetType("cat");
		PetType savedPetTypeCat = petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("1234567890");

		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedPetTypeDog);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Flona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("1234567890");

		Pet fionasPet = new Pet();
		fionasPet.setPetType(savedPetTypeCat);
		fionasPet.setOwner(owner2);
		fionasPet.setBirthDate(LocalDate.now());
		fionasPet.setName("Just Cat");
		owner2.getPets().add(fionasPet);

		ownerService.save(owner2);
		System.out.println("Owners Loaded...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		System.out.println("Vets Loaded...");

		vetService.save(vet2);

	}

}
