package ezinne.springframework.sfgpetclinic.services;

import ezinne.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
