package petclinic.springframework.sfgspringpetclinic.services;

import petclinic.springframework.sfgspringpetclinic.model.Pet;
import petclinic.springframework.sfgspringpetclinic.model.PetType;

import java.util.Set;

public interface PetService {

    Pet findById(long id);
    PetType save(Pet pet);
    Set<Pet> findAll();
}
