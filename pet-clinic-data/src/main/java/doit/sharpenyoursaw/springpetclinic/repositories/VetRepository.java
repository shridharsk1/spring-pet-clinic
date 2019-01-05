package doit.sharpenyoursaw.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import doit.sharpenyoursaw.springpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
