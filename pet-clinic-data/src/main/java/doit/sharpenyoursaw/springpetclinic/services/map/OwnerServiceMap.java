package doit.sharpenyoursaw.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import doit.sharpenyoursaw.springpetclinic.model.Owner;
import doit.sharpenyoursaw.springpetclinic.model.Pet;
import doit.sharpenyoursaw.springpetclinic.services.OwnerService;
import doit.sharpenyoursaw.springpetclinic.services.PetService;
import doit.sharpenyoursaw.springpetclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;

	private final PetService petService;

	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	public Set<Owner> findAll() {
		return super.findAll();
	}

	public Owner findById(Long id) {
		return super.findById(id);
	}

	public Owner save(Owner owner) {
		if (owner != null) {
			if (owner.getPets() != null) {
				owner.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						if (pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is required");
					}

					if (pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(owner);
		} else {
			return null;
		}
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public void delete(Owner owner) {
		super.delete(owner);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
