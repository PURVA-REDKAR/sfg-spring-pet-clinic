package petclinic.springframework.sfgspringpetclinic.services.Map;

import petclinic.springframework.sfgspringpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long>{
    protected Map<ID,T> map = new HashMap<>();




    Set<T> findAll(){
     return new HashSet<>(map.values());
    }
    T findByID(ID id){
        return map.get(id);
    }

    T save( T object){

        if(object != null){
            if(object.getId() == null){
                object.setId(getNextID() );
            }
        }
        else {
            throw new RuntimeException("object cannot be null");
        }

        map.put((ID) object.getId(),object);
       // map.put(id,object);
        return object;
    }
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));

    }
    void deleteByID(ID id){
        map.remove(id);
    }

    private Long getNextID(){

        Long nextID = null;
        try{
            nextID = Collections.max(map.keySet()) ;
            nextID = nextID +1;

        }catch (NoSuchElementException ex){
            nextID = 1L;
        }
        return nextID;
    }
}
