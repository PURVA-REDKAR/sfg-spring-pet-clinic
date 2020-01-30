package petclinic.springframework.sfgspringpetclinic.services.Map;

import petclinic.springframework.sfgspringpetclinic.model.Owner;
import petclinic.springframework.sfgspringpetclinic.services.CRUDRepository;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CRUDRepository<Owner,Long> {


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


}
