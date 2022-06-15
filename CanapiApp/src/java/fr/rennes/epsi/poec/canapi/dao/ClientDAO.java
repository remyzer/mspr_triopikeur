package fr.rennes.epsi.poec.canapi.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import fr.rennes.epsi.poec.canapi.domain.Produit;
import fr.rennes.epsi.poec.canapi.exception.TechnicalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.rennes.epsi.poec.canapi.domain.Client;

@Repository
public class ClientDAO {

    @Autowired
    private DataSource ds;


    public void addClient(Client client)throws SQLException {
        String sql = "insert into client" +
                "(nom, prenom, tel, email, adresse_client_id) VALUES (?,?,?,?,?)";
        try {
            Connection conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getTel());
            ps.setString(4, client.getEmail());
            ps.setInt(5,client.getAdresse_client_id());
        }
        catch (SQLException e) {
            throw new TechnicalException(e);
        }
    }

    public List<Client> getList()throws SQLException {
        List<Client> list = new ArrayList<>();
        String sql = "select id, nom, prenom, tel, email, adresse_client_id from client";
        Statement stmt = ds.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Client client = new Client();
            client.setId(rs.getInt(1));
            client.setNom(rs.getString(2));
            client.setPrenom(rs.getString(3));
            client.setTel(rs.getString(4));
            client.setEmail(rs.getString(5));
            client.setAdresse_client_id(rs.getInt(6));

            list.add(client);
        }
        return list;
    }

    public void updateClient(Client client) throws SQLException {
        String sql = "update client set nom = ?, prenom = ?, tel = ?, email = ?" +
                "where id = ?";
        try {
            Connection conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getTel());
            ps.setString(4, client.getEmail());
            ps.setInt(5,client.getId());
        }
        catch (SQLException e) {
            throw new TechnicalException(e);
        }
    }

    public void deleteClient(Client client) throws SQLException{
        String sql = "delete from client " +
                "where client.id = ? ";
        try {
            Connection conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1,client.getId());
        }
        catch (SQLException e) {
            throw new TechnicalException(e);
        }
    }


}