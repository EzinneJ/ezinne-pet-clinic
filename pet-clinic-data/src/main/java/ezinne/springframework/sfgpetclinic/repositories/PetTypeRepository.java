package ezinne.springframework.sfgpetclinic.repositories;

import ezinne.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
