package com.grigri.fishery.repository;

import java.util.List;

import com.grigri.fishery.domain.Carp;

public interface CarpRepository {

    /**
     * Save the given carp and return the saved carp.
     * 
     * @param carp the carp to save.
     * @return the saved carp.
     */
    Carp save(Carp carp);

    /**
     * Retrieves all carps, sorted by ascending age.
     * 
     * @return all the carps.
     */
    List<Carp> findAll();

}
