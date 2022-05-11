package fr.rennes.epsi.poec.canapi.domain;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails{
	
	private String login;
	private String nom;
	private String prenom;
	private String password;
	private boolean active = true;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(UserRole.ROLE_USER);
	}
	@Override
	public String getUsername() {
		return login;
	}
	@Override
	public boolean isAccountNonExpired() {
		return active;
	}
	@Override
	public boolean isAccountNonLocked() {
		return active;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return active;
	}
	@Override
	public boolean isEnabled() {
		return active;
	}
	
	public String createLogin(String nom,String prenom) {
		StringBuilder str = new StringBuilder();
		str.append(prenom);
		String login = Character.toString(str.charAt(0)) + nom;
		login.toLowerCase();
		return login;
	}
}
