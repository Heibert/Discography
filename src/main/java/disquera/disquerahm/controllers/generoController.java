package disquera.disquerahm.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import disquera.disquerahm.models.Genero.Genero;
import disquera.disquerahm.service.IGeneroService;

@Controller
@RequestMapping("/genero")
@SessionAttributes("genero")
public class generoController {
    @Autowired
    private IGeneroService Igenero;

    @RequestMapping(value = {"/listar","","/"}, method = RequestMethod.GET)
    public ModelAndView verG(ModelAndView mv){
        mv.addObject("genero", Igenero.findAll());
        mv.setViewName("genero/genero");
        return mv;
    }
    @RequestMapping(value = {"/editar/{id}","/editar"})
    public ModelAndView editar(@PathVariable Integer id, ModelAndView mv){
        Genero genero=null;
        if (id>0){
            genero=Igenero.findOne(id);
            mv.addObject("genero", genero);
            mv.setViewName("genero/form");
            return mv;
        }else{
            mv.setViewName("redirect:listar");
            return mv;
        }
    }
    @RequestMapping(value= {"/form"},method = RequestMethod.GET)
    public ModelAndView form(ModelAndView mv){
        Genero genero=new Genero();
        mv.addObject("genero", genero);
        mv.setViewName("genero/form");
        return mv;
    }
    @RequestMapping(value = {"/add"},method = RequestMethod.POST)
    public ModelAndView add(@Valid Genero genero,BindingResult res, ModelAndView mv, SessionStatus status){
        if(res.hasErrors()){
            mv.setViewName("genero/form");
            return mv;
        }else{
            Igenero.save(genero);
            mv.addObject("genero",genero);
            mv.setViewName("redirect:listar");
            status.setComplete();
            return mv;
        }
    }
    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        if(id > 0){
            Igenero.delete(id);
        }
        return "redirect:/genero/listar";
    }
}