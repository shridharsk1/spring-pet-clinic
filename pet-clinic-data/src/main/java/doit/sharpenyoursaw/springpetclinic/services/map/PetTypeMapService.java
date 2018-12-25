package doit.sharpenyoursaw.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import doit.sharpenyoursaw.springpetclinic.model.PetType;
import doit.sharpenyoursaw.springpetclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

	public Set<PetType> findAll() {
		return super.findAll();
	}

	public PetType findById(Long id) {
		return super.findById(id);
	}

	public PetType save(PetType petType) {
		return super.save(petType);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public void delete(PetType petType) {
		super.delete(petType);
	}

}
