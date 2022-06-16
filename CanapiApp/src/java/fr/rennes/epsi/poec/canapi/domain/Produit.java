package fr.rennes.epsi.poec.canapi.domain;

public class Produit {
	
	private int id;
	private String libelle;
	private double prix;
	private int type_produit_id;

	private int quantite;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getType_produit_id() {
		return type_produit_id;
	}

	public void setType_produit_id(int type_produit_id) {
		this.type_produit_id = type_produit_id;
	}
}
