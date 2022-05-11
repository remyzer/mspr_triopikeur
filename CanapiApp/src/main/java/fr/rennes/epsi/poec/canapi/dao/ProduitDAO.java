package fr.rennes.epsi.poec.canapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.rennes.epsi.poec.canapi.domain.Produit;

@Repository
public class ProduitDAO {

	@Autowired
	private DataSource ds;

	public void addProduit(Produit produit) throws SQLException {
		String sql = "Insert into produit (libelle, prix, type_produit_id) values ('"+ produit.getLibelle() +"', '" + produit.getPrix() +"', '" + produit.getType() + "')";
		Statement stmt = ds.getConnection().createStatement();
		stmt.executeUpdate(sql);
	}
	
	public List<Produit> getList() throws SQLException {
		List<Produit> list = new ArrayList<>();
		String sql = "select id, libelle, prix, type from article";
		Statement stmt = ds.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Produit produit = new Produit();
			produit.setId(rs.getInt(1));
			produit.setLibelle(rs.getString(2));
			produit.setPrix(rs.getDouble(3));
			produit.setType(rs.getInt(4));
			
			list.add(produit);
		}		
		return list;
	}
}
