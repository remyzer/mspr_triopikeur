package fr.rennes.epsi.poec.canapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import fr.rennes.epsi.poec.canapi.domain.User;

@Repository
public class UserDAO {
	@Autowired
	private DataSource ds;
	
	@Autowired
	private PasswordEncoder passwordEncoder; //pattern IOC
	
	public User getUserByEmail(String login) throws SQLException {
		String sql = "select login, mot_de_passe from utilisateur where login = '" + login +"'";
		Statement stmt = ds.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
			User user = new User();
			user.setLogin(rs.getString(1));
			user.setPassword(rs.getString(2));
			return user;
		} else {
			return null;
		}
	}
	public void addUser(User user) throws SQLException {
		String password = passwordEncoder.encode(user.getPassword());
		String sql = "Insert into utilisateur (login,mot_de_passe) value ('"+ user.getLogin() +"', '" + password + "')";
		Statement stmt = ds.getConnection().createStatement();
		stmt.executeUpdate(sql);
	}
}
