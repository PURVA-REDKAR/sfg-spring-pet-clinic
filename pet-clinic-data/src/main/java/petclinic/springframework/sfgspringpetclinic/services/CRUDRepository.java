package petclinic.springframework.sfgspringpetclinic.services;

import java.util.Set;

public interface CRUDRepository<T,ID> {

    Set<T> findAll();
    T findByID(ID id);
    T Save(T object);
    void delete(T object);
    void deleteByID(ID id);


}
