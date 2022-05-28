package fr.rennes.epsi.poec.canapi.dao;

import fr.rennes.epsi.poec.canapi.domain.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

@Repository
public class CommandeDAO {

    @Autowired
    private DataSource ds;

    public void addCommande(Commande commande) throws SQLException {
        //TODO
    }

    public List<Commande> getList() throws SQLException {
        //TODO
        return null;
    }
}
