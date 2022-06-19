package ezinne.springframework.sfgpetclinic.services;

import ezinne.springframework.sfgpetclinic.model.Owner;
import ezinne.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
