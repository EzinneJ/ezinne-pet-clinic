package ezinne.springframework.sfgpetclinic.repositories;

import ezinne.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
