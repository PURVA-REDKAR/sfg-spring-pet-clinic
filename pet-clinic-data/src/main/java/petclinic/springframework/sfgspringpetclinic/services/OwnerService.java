package petclinic.springframework.sfgspringpetclinic.services;

import petclinic.springframework.sfgspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(long id);
    Owner findByLastName(String lastname);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
