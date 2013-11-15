package com.grigri.fishery.repository.inmemory;

import java.util.ArrayList; // j'ai du l'importer
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap; //j'ai du l'importer
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import com.grigri.fishery.domain.Carp;
import com.grigri.fishery.repository.CarpRepository;

public class InMemoryCarpRepository implements CarpRepository {

    private ConcurrentMap<Long, Carp> carps = new ConcurrentHashMap<Long, Carp>();
	
	// private ConcurrentMap<Long, Carp> carps = null;
    
    private AtomicLong idGenerator = new AtomicLong(0);
    
    public Carp save(Carp carp) {
    	
    	if (carp.getId() == null) {
    		long Id = idGenerator.incrementAndGet();
    		carp.setId(Id); 
    	}
    	
    	carps.put(carp.getId(),carp);
      
        return carp;
    }

    public List<Carp> findAll() {
    	
    	ArrayList<Carp> result = new ArrayList<Carp> (carps.values());
        
        // Sorts the carps.
        Collections.sort(result, new Comparator<Carp>() {
            public int compare(Carp o1, Carp o2) {
                return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
            }
        });
        
        return result;
    }

}
