package ezinne.springframework.sfgpetclinic.bootstrap;

import ezinne.springframework.sfgpetclinic.model.*;
import ezinne.springframework.sfgpetclinic.services.OwnerService;
import ezinne.springframework.sfgpetclinic.services.PetTypeService;
import ezinne.springframework.sfgpetclinic.services.SpecialtyService;
import ezinne.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("Loaded petTypes...");

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Owner owner1 = new Owner();
        owner1.setFirstName("Ezinne");
        owner1.setLastName("Chime");
        owner1.setAddress("05, Quarry");
        owner1.setCity("Mpape");
        owner1.setTelephone("0812345677");

        Pet ezinnesPet = new Pet();
        ezinnesPet.setPetType(savedDogPetType);
        ezinnesPet.setOwner(owner1);
        ezinnesPet.setBirthDate(LocalDate.now());
        ezinnesPet.setName("Ijele");
        owner1.getPets().add(ezinnesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Chidi");
        owner2.setLastName("Chime");
        owner2.setAddress("05, Quarry");
        owner2.setCity("Mpape");
        owner2.setTelephone("0812345677");

        Pet chidisPet = new Pet();
        chidisPet.setPetType(savedCatPetType);
        chidisPet.setOwner(owner2);
        chidisPet.setBirthDate(LocalDate.now());
        chidisPet.setName("bussu");
        owner2.getPets().add(chidisPet);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Presh");
        vet1.setLastName("Babe");
        vet1.getSpecialties().add(savedDentistry);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Presh");
        vet2.setLastName("Girl");
        vet2.getSpecialties().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
