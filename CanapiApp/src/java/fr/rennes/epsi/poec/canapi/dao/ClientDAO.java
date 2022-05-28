package fr.rennes.epsi.poec.canapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

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
        //TODO
        return null;
    }

    public void updateClient(Client client) throws SQLException {
        //TODO
    }

    public void deleteClient(Client client) throws SQLException{
        //TODO
    }


}