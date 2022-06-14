package fr.rennes.epsi.poec.canapi.controller;

import fr.rennes.epsi.poec.canapi.domain.Adresse;
import fr.rennes.epsi.poec.canapi.service.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdresseController {

    @Autowired
    private AdresseService adresseService;

    @CrossOrigin
    @GetMapping("/public/getIdAdresse")
    public int getIdAdresse(){
        return adresseService.getIdAdresse();
    }

    @PostMapping("/public/addAdresse")
    public void addAdresse(Adresse adresse) {
        adresseService.addAdresse(adresse);
    }
}
