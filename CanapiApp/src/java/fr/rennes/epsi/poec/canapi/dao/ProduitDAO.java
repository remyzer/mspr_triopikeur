package fr.rennes.epsi.poec.canapi.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import fr.rennes.epsi.poec.canapi.exception.TechnicalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.rennes.epsi.poec.canapi.domain.Produit;

@Repository
public class ProduitDAO {

	@Autowired
	private DataSource ds;

	public void addProduit(Produit produit) throws SQLException {
		String sql = "Insert into produit (libelle, prix, quantite, type_produit_id) values (?,?,?,?)";
		try {
			Connection conn = ds.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, produit.getLibelle());
			ps.setDouble(2, produit.getPrix());
			ps.setInt(3, produit.getQuantite());
			ps.setString(4, produit.getType());
		}
		catch (SQLException e) {
			throw new TechnicalException(e);
		}
	}
	
	public List<Produit> getList() throws SQLException {
		List<Produit> list = new ArrayList<>();
		String sql = "select id, libelle, prix, type_produit_id from produit";
		Statement stmt = ds.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Produit produit = new Produit();
			produit.setId(rs.getInt(1));
			produit.setLibelle(rs.getString(2));
			produit.setPrix(rs.getDouble(3));
			produit.setType(rs.getString(4));
			
			list.add(produit);
		}		
		return list;
	}

	public void updateProduit(Produit produit) throws SQLException {
		String sql = "update produit set libelle = ?, prix = ?, quantite = ?,type_produit_id = ?" +
				"where id = ?";
		try {
			Connection conn = ds.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, produit.getLibelle());
			ps.setDouble(2, produit.getPrix());
			ps.setInt(3, produit.getQuantite());
			ps.setString(4, produit.getType());
			ps.setInt(5,produit.getId());
		}
		catch (SQLException e) {
			throw new TechnicalException(e);
		}
	}

	public void deleteProduit(Produit produit) throws SQLException {
		String sql = "delete from produit where produit.id = ?";
		try {
			Connection conn = ds.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, produit.getId());
		}
		catch (SQLException e) {
			throw new TechnicalException(e);
		}
	}
	
	
}
