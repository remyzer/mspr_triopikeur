package fr.rennes.epsi.poec.canapi.service;

import fr.rennes.epsi.poec.canapi.dao.CommandeDAO;
import fr.rennes.epsi.poec.canapi.domain.Commande;
import fr.rennes.epsi.poec.canapi.exception.TechnicalException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CommandeService {

    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Autowired
    private CommandeDAO commandeDAO;

    public List<Commande> getList() {
        try {
            return commandeDAO.getList();
        }
        catch (SQLException e) {
            logger.error(e.getMessage(), e);
            throw new TechnicalException(e);
        }
    }

    public void addCommande(Commande commande) {
        try {
            commandeDAO.addCommande(commande);
        }
        catch (SQLException e) {
            logger.error(e.getMessage(), e);
            throw new TechnicalException(e);
        }
    }
}
