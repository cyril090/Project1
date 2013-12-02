package com.grigri.fishery.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.grigri.fishery.domain.Carp;
import com.grigri.fishery.repository.CarpRepository;
import com.grigri.fishery.service.FisheryService;
import com.grigri.fishery.web.form.NewCarpForm;

@Controller
@RequestMapping("/fishes")
public class FishController {
    
    @Autowired
    private FisheryService fisheryService;
    
    @RequestMapping(value="/fish.html", method=RequestMethod.GET)
    public ModelAndView getFishes() {
        
        List<Carp> carps = fisheryService.findAllCarps();
        
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("carps", carps);
        
        return new ModelAndView("fish", model);
    }
    
    @RequestMapping(value="/carp.html", method=RequestMethod.POST)
        public ModelAndView createCarp(NewCarpForm newCarpForm) {
    	Carp carp = new Carp(null,newCarpForm.getAge(),newCarpForm.getLengthInCms(),newCarpForm.getWeightInKilo());
    	// TODO create a method 'saveCarp' in the FisheryService.
    	// This method will call save on the carpRepsitory instance variable.
    	// Call this 'saveCarp' method from here.
    	CarpRepository.save(carp);
    	
    	// TODO return getFishes, to have all the carps in the model.
    	return new ModelAndView("fish");
    	}
        
    }


