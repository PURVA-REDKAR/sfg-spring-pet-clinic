package petclinic.springframework.sfgspringpetclinic.services.Map;

import org.springframework.stereotype.Service;
import petclinic.springframework.sfgspringpetclinic.model.Owner;
import petclinic.springframework.sfgspringpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {


    @Override
    public Set<Owner> findAll() {
         return super.findAll();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }



    @Override
    public Owner Save(Owner object) {
        super.save(object.getId() ,object);
    return null;
    }

    @Override
    public void deleteByID(Long aLong) {

        super.deleteByID(aLong);
    }


    @Override
    public Owner findByLastName(String lastname) {
        return null;
    }
}
