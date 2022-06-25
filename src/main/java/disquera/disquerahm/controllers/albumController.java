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

import disquera.disquerahm.models.Album.IAlbum;
import disquera.disquerahm.models.Artista.IArtista;
import disquera.disquerahm.service.IGeneroService;
import disquera.disquerahm.models.Album.Album;

@Controller
@RequestMapping("/album")
@SessionAttributes("album")
public class albumController {
    @Autowired
    private IGeneroService Igenero;
    @Autowired
    private IAlbum Ialbum;
    @Autowired
    private IArtista Iartista;
    @RequestMapping(value = {"/listar","","/"}, method = RequestMethod.GET)
    public ModelAndView verG(ModelAndView mv){
        mv.addObject("album", Ialbum.findAll());
        mv.setViewName("album/album");
        return mv;
    }
    @RequestMapping(value = {"/editar/{id}","/editar"})
    public ModelAndView editar(@PathVariable Integer id, ModelAndView mv){
        Album album=null;
        if (id>0){
            album=Ialbum.findOne(id);
            mv.addObject("genero",Igenero.findAll());
            mv.addObject("album", album);
            mv.addObject("artista", Iartista.findAll());
            mv.setViewName("album/form");
            return mv;
        }else{
            mv.setViewName("redirect:listar");
            return mv;
        }
    }
    @RequestMapping(value= {"/form"},method = RequestMethod.GET)
    public ModelAndView form(ModelAndView mv){
        Album album=new Album();
        mv.addObject("genero",Igenero.findAll());
        mv.addObject("album", album);
        mv.addObject("artista", Iartista.findAll());
        return mv;
    }
    @RequestMapping(value = {"/add"},method = RequestMethod.POST)
    public ModelAndView add(@Valid Album album,BindingResult res, ModelAndView mv, SessionStatus status){
        if(res.hasErrors()){
            mv.addObject("genero",Igenero.findAll());
            mv.addObject("artista", Iartista.findAll());
            mv.setViewName("album/form");
            return mv;
        }else{
            Ialbum.save(album);
            mv.addObject("album",album);
            System.out.println(album);
            mv.setViewName("redirect:listar");
            status.setComplete();
            return mv;
        }
    }
    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        if(id > 0){
            Ialbum.delete(id);
        }
        return "redirect:/album/listar";
    }
}