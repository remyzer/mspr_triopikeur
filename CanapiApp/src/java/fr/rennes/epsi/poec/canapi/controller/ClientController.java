package fr.rennes.epsi.poec.canapi.controller;

import fr.rennes.epsi.poec.canapi.domain.Client;
import fr.rennes.epsi.poec.canapi.domain.Response;
import fr.rennes.epsi.poec.canapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @CrossOrigin
    @PostMapping("/public/addClient")
    public void addClient(@RequestBody Client client) {
        clientService.addClient(client);
    }

    @CrossOrigin
    @GetMapping("/public/listClient")
    public Response<List<Client>> getList() {
        List<Client> clients = clientService.getList();
        Response<List<Client>> response = new Response<>();
        response.setData(clients);
        return response ;
    }

    @CrossOrigin
    @PostMapping("/public/updateClient")
    public void updateClient(@RequestBody Client client) {
        clientService.updateClient(client);
    }

    @CrossOrigin
    @PostMapping("/public/deleteClient")
    public void deleteClient(@RequestBody int idClient) {
        clientService.deleteClient(idClient);
    }

}
