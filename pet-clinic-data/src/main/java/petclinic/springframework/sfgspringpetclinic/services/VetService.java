package petclinic.springframework.sfgspringpetclinic.services;

import petclinic.springframework.sfgspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
