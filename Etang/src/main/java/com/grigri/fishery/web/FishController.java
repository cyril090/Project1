package com.grigri.fishery.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fishes")
public class FishController {
    
    @RequestMapping(value="/fish.html", method=RequestMethod.GET)
    public ModelAndView getFishes() {
        return new ModelAndView("fish");
    }

}
