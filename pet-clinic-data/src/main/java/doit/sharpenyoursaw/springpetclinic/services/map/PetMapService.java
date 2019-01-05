package doit.sharpenyoursaw.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import doit.sharpenyoursaw.springpetclinic.model.Pet;
import doit.sharpenyoursaw.springpetclinic.services.PetService;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

	public Set<Pet> findAll() {
		return super.findAll();
	}

	public Pet findById(Long id) {
		return super.findById(id);
	}

	public Pet save(Pet pet) {
		return super.save(pet);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public void delete(Pet pet) {
		super.delete(pet);
	}

}
