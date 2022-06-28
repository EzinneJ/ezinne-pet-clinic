package ezinne.springframework.sfgpetclinic.bootstrap;

import ezinne.springframework.sfgpetclinic.model.Owner;
import ezinne.springframework.sfgpetclinic.model.PetType;
import ezinne.springframework.sfgpetclinic.model.Vet;
import ezinne.springframework.sfgpetclinic.services.OwnerService;
import ezinne.springframework.sfgpetclinic.services.PetTypeService;
import ezinne.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("Loaded petTypes...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Ezinne");
        owner1.setLastName("Chime");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Chidi");
        owner2.setLastName("Chime");

       ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Presh");
        vet1.setLastName("Babe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Presh");
        vet2.setLastName("Girl");

        vetService.save(vet2);

        System.out.println("Loaded vets...");



    }
}
