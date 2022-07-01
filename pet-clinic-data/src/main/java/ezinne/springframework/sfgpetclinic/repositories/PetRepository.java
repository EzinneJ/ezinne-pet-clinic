package ezinne.springframework.sfgpetclinic.repositories;

import ezinne.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
