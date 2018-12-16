package doit.sharpenyoursaw.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import doit.sharpenyoursaw.springpetclinic.model.Owner;
import doit.sharpenyoursaw.springpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	public Set<Owner> findAll() {
		return super.findAll();
	}

	public Owner findById(Long id) {
		return super.findById(id);
	}

	public Owner save(Owner owner) {
		return super.save(owner);
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
