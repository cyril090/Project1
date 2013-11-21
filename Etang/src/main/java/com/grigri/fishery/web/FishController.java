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
    
    // TODO add the request mapping annotation for URL /carp.html and method POST
    public ModelAndView createCarp(NewCarpForm newCarpForm) {
        // TODO create a new carp object with the values from the newCarpForm
        // TODO save the carp
        // TODO return a new model and view with all fishes, similar to getFishes().
        return null;
    }

}
