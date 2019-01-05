package doit.sharpenyoursaw.springpetclinic.services.map;

import java.util.Set;

import doit.sharpenyoursaw.springpetclinic.model.Speciality;
import doit.sharpenyoursaw.springpetclinic.services.SpecialityService;

public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

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
