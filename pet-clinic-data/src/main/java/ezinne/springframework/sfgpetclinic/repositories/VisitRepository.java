package ezinne.springframework.sfgpetclinic.repositories;

import ezinne.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
