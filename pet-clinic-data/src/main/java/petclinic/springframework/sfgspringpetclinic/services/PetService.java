package petclinic.springframework.sfgspringpetclinic.services;

import petclinic.springframework.sfgspringpetclinic.model.PetType;

import java.util.Set;

public interface PetService {

    PetType findById(long id);
    PetType save(PetType pettype);
    Set<PetType> findAll();
}
