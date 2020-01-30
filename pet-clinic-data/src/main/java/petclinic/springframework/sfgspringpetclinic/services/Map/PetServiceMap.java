package petclinic.springframework.sfgspringpetclinic.services.Map;

import petclinic.springframework.sfgspringpetclinic.model.Pet;
import petclinic.springframework.sfgspringpetclinic.services.CRUDRepository;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CRUDRepository<Pet,Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }



    @Override
    public Pet Save(Pet object) {
        super.save(object.getId() ,object);
        return null;
    }

    @Override
    public void deleteByID(Long aLong) {

        super.deleteByID(aLong);
    }
}
