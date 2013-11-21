package com.grigri.fishery.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.grigri.fishery.domain.Carp;
import com.grigri.fishery.repository.inmemory.InMemoryCarpRepository;

public class CarpRepositoryTest {
    
    private CarpRepository carpRepository = new InMemoryCarpRepository();
    
    @Test
    @Ignore
 	public void crud() {
        // On cree une carpe de 2 ans, qui mesure 40 cms et pese 4 kg.
        Carp carp = new Carp(
                    null, // pas d'ID, l'ID doit etre cree par le repository
                    2,
                    40,
                    4
                );
        // On sauve la carpe.
        carp = carpRepository.save(carp);
        
        // On verifie que la carpe a maintenant un ID.
        assertNotNull(carp.getId());
        
        // On recupere la liste de toutes les carpes.
        List<Carp> carps = carpRepository.findAll();
        
        // On verifie qu'il n'y a qu'une carpe, et que c'est celle qu'on a sauve.
        assertEquals(1, carps.size());
        Carp retrievedCarp = carps.get(0);
        assertEquals(2, retrievedCarp.getAge());
        assertEquals(40, retrievedCarp.getLengthInCms());
    }

}
