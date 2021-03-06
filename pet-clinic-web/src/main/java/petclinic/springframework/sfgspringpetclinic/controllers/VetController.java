package petclinic.springframework.sfgspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import petclinic.springframework.sfgspringpetclinic.services.VetService;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets","vets/index", "vets/index.html"})
    public String vets(Model moedl){

        moedl.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
