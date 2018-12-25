package doit.sharpenyoursaw.springpetclinic.services.map;

import java.util.Set;

import doit.sharpenyoursaw.springpetclinic.model.Speciality;
import doit.sharpenyoursaw.springpetclinic.services.SpecialitiesService;

public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {

	public Set<Speciality> findAll() {
		return super.findAll();
	}

	public Speciality findById(Long id) {
		return super.findById(id);
	}

	public Speciality save(Speciality speciality) {
		return super.save(speciality);
	}

	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public void delete(Speciality speciality) {
		super.delete(speciality);
	}

}
