package disquera.disquerahm.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import disquera.disquerahm.models.Genero;

@Controller
public class generoController {
    @RequestMapping(value = "/genero", method = RequestMethod.GET)
    public ModelAndView verG(ModelAndView mv){
        List<Genero> genero = new ArrayList<>();
        genero.add(new Genero(1,"Pop",true));
        genero.add(new Genero(2,"Rock",true));
        genero.add(new Genero(3,"Regue",false));
        mv.addObject("genero", genero);
        mv.setViewName("genero/genero");
        return mv;
    } 
}