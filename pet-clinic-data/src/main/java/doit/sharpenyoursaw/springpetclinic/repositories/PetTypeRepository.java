package doit.sharpenyoursaw.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import doit.sharpenyoursaw.springpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
