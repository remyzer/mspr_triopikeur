package fr.rennes.epsi.poec.canapi.service;

import fr.rennes.epsi.poec.canapi.dao.AdresseDAO;
import fr.rennes.epsi.poec.canapi.domain.Adresse;
import fr.rennes.epsi.poec.canapi.exception.TechnicalException;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AdresseService {

    private static final Logger logger = LogManager.getLogger(UserService.class);
    @Autowired
    private AdresseDAO adresseDAO;

    public int getIdAdresse() {
        try {
            return adresseDAO.getIdAdresse();
        }
        catch (SQLException e) {
            logger.error(e.getMessage(), e);
            throw new TechnicalException(e);
        }
    }

    public void addAdresse(Adresse adresse) {
        try {
            adresseDAO.addAdresse(adresse);
        }
        catch (SQLException e) {
            logger.error(e.getMessage(), e);
            throw new TechnicalException(e);
        }
    }

    public Adresse getAdresseByClientId(int clientId) {
        try {
            return adresseDAO.getAdresseByClientId(clientId);
        }
        catch (SQLException e) {
            logger.error(e.getMessage(), e);
            throw new TechnicalException(e);
        }
    }
}
