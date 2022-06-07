package fr.rennes.epsi.poec.canapi.domain;

public class Client {

	private int id;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private int adresse_client_id;


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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdresse_client_id() {
		return adresse_client_id;
	}
	public void setAdresse_client_id(int adresse_client_id) {
		this.adresse_client_id = adresse_client_id;
	}
}
