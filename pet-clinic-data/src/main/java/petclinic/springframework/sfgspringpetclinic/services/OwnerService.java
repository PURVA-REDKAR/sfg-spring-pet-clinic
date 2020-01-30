package petclinic.springframework.sfgspringpetclinic.services;

import petclinic.springframework.sfgspringpetclinic.model.Owner;

public interface OwnerService extends CRUDRepository<Owner, Long>{
    Owner findByLastName(String lastname);
}
