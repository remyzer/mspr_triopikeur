package fr.rennes.epsi.poec.canapi.service;

import java.sql.SQLException;
import java.util.List;

import fr.rennes.epsi.poec.canapi.domain.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rennes.epsi.poec.canapi.dao.ProduitDAO;
import fr.rennes.epsi.poec.canapi.domain.Produit;
import fr.rennes.epsi.poec.canapi.exception.TechnicalException;

@Service
public class ProduitService {
	
	private static final Logger logger = LogManager.getLogger(UserService.class);
	
	@Autowired
	private ProduitDAO produitDAO;
	
	public List<Produit> getList(){
		try {
			return produitDAO.getList();
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
			throw new TechnicalException(e);
		}
	}
	
	public void addProduit(Produit produit) {
		try {
			produitDAO.addProduit(produit);
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
			throw new TechnicalException(e);
		}
	}

	public void updateProduit(Produit produit) {
		try {
			produitDAO.updateProduit(produit);
		}
		catch (SQLException e) {
			logger.error(e.getMessage(), e);
			throw new TechnicalException(e);
		}
	}

	public void deleteProduit(int idProduit) {
		try {
			produitDAO.deleteProduit(idProduit);
		}
		catch (SQLException e) {
			logger.error(e.getMessage(), e);
			throw new TechnicalException(e);
		}
	}
}
