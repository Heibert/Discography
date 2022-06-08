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

import disquera.disquerahm.models.Disquera.Disquera;
import disquera.disquerahm.models.Disquera.IDisquera;


@Controller
@RequestMapping("/disquera")
public class disqueraController {
    @Autowired
    private IDisquera Idisquera;

    @RequestMapping(value = {"/listar","","/"}, method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv){
        mv.addObject("disquera", Idisquera.findAll());
        mv.setViewName("disquera/disquera");
        return mv;
    } 
    @RequestMapping(value= {"/form"},method = RequestMethod.GET)
    public ModelAndView form(ModelAndView mv){
        Disquera disquera=new Disquera();
        mv.addObject("disquera", disquera);
        mv.setViewName("disquera/formD");
        return mv;
    }
    @RequestMapping(value = {"/editar/{id}","/editar"})
    public ModelAndView editar(@PathVariable Integer id, ModelAndView mv){
        Disquera disquera=null;
        if (id>0){
            disquera=Idisquera.findOne(id);
            mv.addObject("disquera", disquera);
            mv.setViewName("disquera/formD");
            return mv;
        }else{
            mv.setViewName("redirect:listar");
            return mv;
        }
    }
    @RequestMapping(value = {"/add"},method = RequestMethod.POST)
    public ModelAndView add(@Valid Disquera disquera,BindingResult res, ModelAndView mv, SessionStatus status){
        if(res.hasErrors()){
            mv.setViewName("disquera/formD");
            return mv;
        }else{
            Idisquera.save(disquera);
            mv.addObject("disquera",disquera);
            mv.setViewName("redirect:listar");
            status.setComplete();
            return mv;
        }
    }
    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        if(id > 0){
            Idisquera.delete(id);
        }
        return "redirect:/disquera/listar";
    }
}