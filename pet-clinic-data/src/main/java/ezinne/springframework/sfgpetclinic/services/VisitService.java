package ezinne.springframework.sfgpetclinic.services;

import ezinne.springframework.sfgpetclinic.model.Visit;
import org.springframework.stereotype.Service;

@Service
public interface VisitService extends CrudService<Visit, Long> {
}
