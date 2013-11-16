package com.grigri.fishery.service.impl;

import java.util.List;

import com.grigri.fishery.domain.Carp;
import com.grigri.fishery.service.FisheryService;

// TODO declare this class as a Spring bean in 'service-context.xml'.
// This is similar to the way FishController is declared in 'web-context.xml'.
public class FisheryServiceImpl implements FisheryService {

    // TODO inject carp repository.
    // This is similar to they way fisheryService is injected into FishController.
    
    public List<Carp> findAllCarps() {
        // TODO call carp repository to get all the carps.
        return null;
    }

}
