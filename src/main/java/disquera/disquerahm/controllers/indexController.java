package disquera.disquerahm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
    @RequestMapping(value = {"/index","/",""}, method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv){
        mv.addObject("msn", "Este mensaje viene del controlador");
        mv.setViewName("index");
        return mv;
        }
}