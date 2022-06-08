package disquera.disquerahm.controllers;

import disquera.disquerahm.models.Genero;
import disquera.disquerahm.models.IGenero;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/genero")
@SessionAttributes("genero")
public class generoController {
    @Autowired
    private IGenero Igenero;

    @RequestMapping(value = {"/listar","","/"}, method = RequestMethod.GET)
    public ModelAndView verG(ModelAndView mv){
        mv.addObject("genero", Igenero.findAll());
        mv.setViewName("genero/genero");
        return mv;
    }
    @RequestMapping(value = {"/ver/{id}","/ver"}, method = RequestMethod.GET)
    public ModelAndView ver(@PathVariable Integer id,String msn, ModelAndView mv){
        Genero genero=null;
        if (id>0){
            genero=Igenero.findOne(id);
        }else{
            mv.setViewName("redirect:listar");
            return mv;
        }
        mv.addObject("id","La id es: "+id);
        mv.setViewName("genero/ver");
        return mv;
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