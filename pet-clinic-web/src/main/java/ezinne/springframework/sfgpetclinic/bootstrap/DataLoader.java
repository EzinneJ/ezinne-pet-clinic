package ezinne.springframework.sfgpetclinic.bootstrap;

import ezinne.springframework.sfgpetclinic.model.Owner;
import ezinne.springframework.sfgpetclinic.model.Vet;
import ezinne.springframework.sfgpetclinic.services.OwnerService;
import ezinne.springframework.sfgpetclinic.services.VetService;
import ezinne.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import ezinne.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ezinne");
        owner1.setLastName("Chime");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Chidi");
        owner2.setLastName("Chime");

       ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Presh");
        vet1.setLastName("Babe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Presh");
        vet2.setLastName("Girl");

        vetService.save(vet2);

        System.out.println("Loaded vets...");



    }
}
