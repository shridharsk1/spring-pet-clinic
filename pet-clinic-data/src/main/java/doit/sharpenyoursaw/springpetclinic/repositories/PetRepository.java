package doit.sharpenyoursaw.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import doit.sharpenyoursaw.springpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
