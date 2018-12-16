package doit.sharpenyoursaw.springpetclinic.services;

import doit.sharpenyoursaw.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
