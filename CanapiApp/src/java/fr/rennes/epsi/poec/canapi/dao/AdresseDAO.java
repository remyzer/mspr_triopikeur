package fr.rennes.epsi.poec.canapi.dao;

import fr.rennes.epsi.poec.canapi.domain.Adresse;
import fr.rennes.epsi.poec.canapi.exception.TechnicalException;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

@Repository
public class AdresseDAO {


    private DataSource ds;

    public int getIdAdresse() throws SQLException {
        String sql = "SELECT id from adresse_client\n" +
                "ORDER BY id DESC\n" +
                "LIMIT 1";
        Statement stmt = ds.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        int result = 0;
        while (rs.next()){
            result = rs.getInt(1);
        }

        return result;

    }

    public void addAdresse(Adresse adresse) throws SQLException {
        String sql ="insert into adresse_client" +
                "(numero, adresse, code_postal, ville) VALUES (?,?,?,?)";
        try {
            Connection conn = ds.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, adresse.getNumero());
            ps.setString(2, adresse.getAdresse());
            ps.setString(3, adresse.getCode_postal());
            ps.setString(4, adresse.getVille());

        }
        catch (SQLException e) {
            throw new TechnicalException(e);
        }
    }
}
