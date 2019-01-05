package doit.sharpenyoursaw.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import doit.sharpenyoursaw.springpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

	Owner findByLastName(String lastName);

}
