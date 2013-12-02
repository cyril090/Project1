package com.grigri.fishery.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.grigri.fishery.domain.Carp;
import com.grigri.fishery.repository.CarpRepository;
import com.grigri.fishery.service.FisheryService;


public class FisheryServiceImpl implements FisheryService {


	@Autowired
	private CarpRepository carpRepository;
	
    public List<Carp> findAllCarps() {    
    	
    	List<Carp> allCarpResult = carpRepository.findAll();
    	   	
        return allCarpResult;
    }
    
    public Carp saveCarp(Carp carp){
		return carpRepository.save(carp);
    }
}
