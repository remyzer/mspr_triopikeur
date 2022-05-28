package fr.rennes.epsi.poec.canapi.controller;

import fr.rennes.epsi.poec.canapi.domain.Commande;
import fr.rennes.epsi.poec.canapi.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommandeController {

    @Autowired
    private CommandeService commandeService;

    @GetMapping("/public/listCommande")
    public List<Commande> getList() {
        return commandeService.getList();
    }

    @PostMapping("/public/addCommande")
    public void addCommande(Commande commande) {
        commandeService.addCommande(commande);
    }
}
