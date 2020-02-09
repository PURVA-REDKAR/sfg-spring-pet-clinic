package petclinic.springframework.sfgspringpetclinic.services.Map;

import org.springframework.stereotype.Service;
import petclinic.springframework.sfgspringpetclinic.model.Vet;
import petclinic.springframework.sfgspringpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }



    @Override
    public Vet Save(Vet object) {
        super.save(object);
        return null;
    }

    @Override
    public void deleteByID(Long aLong) {

        super.deleteByID(aLong);
    }

}
