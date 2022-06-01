package disquera.disquerahm.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import disquera.disquerahm.models.Genero;

@Controller
@RequestMapping("/genero")
public class generoController {
    @RequestMapping(value = {"/listar","","/"}, method = RequestMethod.GET)
    public ModelAndView verG(ModelAndView mv){
        List<Genero> genero = new ArrayList<>();
        genero.add(new Genero(1,"Pop",true));
        genero.add(new Genero(2,"Rock",true));
        genero.add(new Genero(3,"Regue",false));
        mv.addObject("genero", genero);
        mv.setViewName("genero/genero");
        return mv;
    }
    @RequestMapping(value = "/ver/{id}", method = RequestMethod.GET)
    public ModelAndView ver(@PathVariable int id,String msn, ModelAndView mv){
        mv.addObject("id", id+"lol"+id);
        mv.addObject("msn", msn);
        mv.setViewName("genero/ver");
        return mv;
    }
}