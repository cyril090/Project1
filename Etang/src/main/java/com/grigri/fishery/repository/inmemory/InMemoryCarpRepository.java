package com.grigri.fishery.repository.inmemory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import com.grigri.fishery.domain.Carp;
import com.grigri.fishery.repository.CarpRepository;

public class InMemoryCarpRepository implements CarpRepository {

    private ConcurrentMap<Long, Carp> carps = new ConcurrentHashMap<Long, Carp>();
	
    private AtomicLong idGenerator = new AtomicLong(0);
    
    {
        carps.put(1L, new Carp(1L, 2, 40, 6));
        carps.put(2L, new Carp(2L, 1, 30, 7));
    }
    
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
