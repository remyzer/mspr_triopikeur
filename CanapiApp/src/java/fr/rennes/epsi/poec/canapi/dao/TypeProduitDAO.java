package fr.rennes.epsi.poec.canapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.rennes.epsi.poec.canapi.domain.TypeProduit;

@Repository
public class TypeProduitDAO {

	@Autowired
	private DataSource ds;
	
	public List<TypeProduit> getType() throws SQLException {
		List<TypeProduit> list = new ArrayList<>();
		String sql =  "select id, nom from type_produit";
		Statement stmt = ds.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			TypeProduit typeproduit = new TypeProduit();
			typeproduit.setId(rs.getString(1));
			typeproduit.setLibelle(rs.getString(2));
			
			list.add(typeproduit);
		}
		return list;
	}

}
