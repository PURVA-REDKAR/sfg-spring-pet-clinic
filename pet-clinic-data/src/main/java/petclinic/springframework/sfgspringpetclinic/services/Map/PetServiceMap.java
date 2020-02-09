package petclinic.springframework.sfgspringpetclinic.services.Map;

import org.springframework.stereotype.Service;
import petclinic.springframework.sfgspringpetclinic.model.Pet;
import petclinic.springframework.sfgspringpetclinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

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
