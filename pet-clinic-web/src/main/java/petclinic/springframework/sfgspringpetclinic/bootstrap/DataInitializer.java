package petclinic.springframework.sfgspringpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import petclinic.springframework.sfgspringpetclinic.model.Owner;
import petclinic.springframework.sfgspringpetclinic.model.Vet;
import petclinic.springframework.sfgspringpetclinic.services.OwnerService;
import petclinic.springframework.sfgspringpetclinic.services.VetService;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFristName("Michael");
        owner1.setLastName("Weston");

        ownerService.Save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFristName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.Save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFristName("Sam");
        vet1.setLastName("Axe");

        vetService.Save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFristName("Jessie");
        vet2.setLastName("Porter");

        vetService.Save(vet2);

        System.out.println("Loaded Vets....");

    }
}
