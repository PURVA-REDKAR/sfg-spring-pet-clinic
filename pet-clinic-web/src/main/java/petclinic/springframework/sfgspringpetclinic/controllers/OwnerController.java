package petclinic.springframework.sfgspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import petclinic.springframework.sfgspringpetclinic.services.OwnerService;

@Controller
public class OwnerController {

    private final OwnerService ownerServicer;

    public OwnerController(OwnerService ownerServicer) {
        this.ownerServicer = ownerServicer;
    }

    @RequestMapping({"/owner","owner/index", "owner/index.html"})
    public String owner(Model model){
        model.addAttribute("owners",ownerServicer.findAll());
        return "owner/index";
    }
}
