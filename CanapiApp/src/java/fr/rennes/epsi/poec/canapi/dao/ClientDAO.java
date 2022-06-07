package fr.rennes.epsi.poec.canapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import fr.rennes.epsi.poec.canapi.domain.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.rennes.epsi.poec.canapi.domain.Client;

@Repository
public class ClientDAO {

    @Autowired
    private DataSource ds;


    public void addClient(Client client)throws SQLException {
        //TODO
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
        //TODO
    }

    public void deleteClient(Client client) throws SQLException{
        //TODO
    }


}