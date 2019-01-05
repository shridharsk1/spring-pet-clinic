package doit.sharpenyoursaw.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import doit.sharpenyoursaw.springpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
