package com.grigri.fishery.repository.inmemory;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import com.grigri.fishery.domain.Carp;
import com.grigri.fishery.repository.CarpRepository;

public class InMemoryCarpRepository implements CarpRepository {

    // TODO instantier la variable membre carps avec le type java.util.concurrent.ConcurrentHashMap.
    private ConcurrentMap<Long, Carp> carps = null;
    
    private AtomicLong idGenerator = new AtomicLong(0);
    
    public Carp save(Carp carp) {
        // TODO si l'id de la carpe est null, appeler la method incrementAndGet de l'idGenerator,
        // et setter l'id sur l'objet carp (utiliser la methode setId).
        // TODO ajouter la carp a la map 'carps', en appelant la methode put
        // TODO retourner la carpe.
        return null;
    }

    public List<Carp> findAll() {
        // TODO creer une variable de type ArrayList, et comme parametre du constructeur, utiliser
        // toutes les 'values' de la map 'carps'.
        List<Carp> result = null;
        
        // Sorts the carps.
        Collections.sort(result, new Comparator<Carp>() {
            public int compare(Carp o1, Carp o2) {
                return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
            }
        });
        
        // TODO renvoyer la list des carpes.
        return null;
    }

}
