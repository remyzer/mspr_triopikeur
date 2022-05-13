package fr.rennes.epsi.poec.canapi.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rennes.epsi.poec.canapi.dao.TypeProduitDAO;
import fr.rennes.epsi.poec.canapi.domain.TypeProduit;
import fr.rennes.epsi.poec.canapi.exception.TechnicalException;

@Service
public class TypeProduitService {
	
	private static final Logger logger = LogManager.getLogger(UserService.class);
	
	@Autowired
	private TypeProduitDAO typeProduitDAO;
	
	public List<TypeProduit> getType(){
		try {
			return typeProduitDAO.getType();
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
			throw new TechnicalException(e);
		}
	}
}
