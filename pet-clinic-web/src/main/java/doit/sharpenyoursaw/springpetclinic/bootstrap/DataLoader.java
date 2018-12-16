package doit.sharpenyoursaw.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import doit.sharpenyoursaw.springpetclinic.model.Owner;
import doit.sharpenyoursaw.springpetclinic.model.Vet;
import doit.sharpenyoursaw.springpetclinic.services.OwnerService;
import doit.sharpenyoursaw.springpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private OwnerService ownerService;

	private VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Flona");
		owner2.setLastName("Glenanne");

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
