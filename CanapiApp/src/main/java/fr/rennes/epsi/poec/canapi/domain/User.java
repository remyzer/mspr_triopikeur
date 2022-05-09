package fr.rennes.epsi.poec.canapi.domain;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails{
	
	private String email;
	private String password;
	private boolean active = true;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
		return email;
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
}
