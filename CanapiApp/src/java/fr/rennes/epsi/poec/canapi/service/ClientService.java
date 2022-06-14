package fr.rennes.epsi.poec.canapi.service;

import fr.rennes.epsi.poec.canapi.dao.ClientDAO;
import fr.rennes.epsi.poec.canapi.domain.Client;
import fr.rennes.epsi.poec.canapi.exception.TechnicalException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ClientService {

    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Autowired
    private ClientDAO clientDAO;

    public void addClient(Client client){
        try {
            clientDAO.addClient(client);
        }
        catch (SQLException e) {
            logger.error(e.getMessage(), e);
            throw new TechnicalException(e);
        }
    }

    public List<Client> getList() {
        try {
            return clientDAO.getList();
        }
        catch (SQLException e) {
            logger.error(e.getMessage(), e);
            throw new TechnicalException(e);
        }
    }

    public void updateClient(Client client) {
        try {
            clientDAO.updateClient(client);
        }
        catch (SQLException e) {
            logger.error(e.getMessage(), e);
            throw new TechnicalException(e);
        }
    }

    public void deleteClient(Client client) {
        try {
            clientDAO.deleteClient(client);
        }
        catch (SQLException e) {
            logger.error(e.getMessage(), e);
            throw new TechnicalException(e);
        }
    }
}
