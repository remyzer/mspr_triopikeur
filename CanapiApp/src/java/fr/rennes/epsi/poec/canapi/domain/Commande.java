package fr.rennes.epsi.poec.canapi.domain;

import java.time.LocalDate;
import java.util.List;

public class Commande {
	
	private String numero;
	private LocalDate date;
	private List<Produit> contenu;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<Produit> getContenu() {
		return contenu;
	}
	public void setContenu(List<Produit> contenu) {
		this.contenu = contenu;
	}
	
	
	
}
