package fr.rennes.epsi.poec.canapi.controller;

import fr.rennes.epsi.poec.canapi.domain.Client;
import fr.rennes.epsi.poec.canapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/public/addClient")
    public void addClient(Client client) {
        clientService.addClient(client);
    }

    @GetMapping("/public/listClient")
    public List<Client> getList() {
        return clientService.getList();
    }

    @PostMapping("/public/updateClient")
    public void updateClient(Client client) {
        clientService.updateClient(client);
    }

    @PostMapping("/public/deleteClient")
    public void deleteClient(Client client) {
        clientService.deleteClient(client);
    }
}
