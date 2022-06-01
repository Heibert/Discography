package disquera.disquerahm.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import disquera.disquerahm.models.Cliente;

@Controller
public class ClienteController {
    @RequestMapping(value="/verc", method = RequestMethod.GET)
    public String verc(Model m){
        List<Cliente> cli=new ArrayList<>();
        m.addAttribute("cliente", cli);
        return "disquera/cli";
    }
}