package fr.rennes.epsi.poec.canapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.rennes.epsi.poec.canapi.domain.Produit;
import fr.rennes.epsi.poec.canapi.service.ProduitService;

@RestController
public class ProduitController {

	@Autowired
	private ProduitService produitService;
	/*
	@GetMapping("/public/produits")
	public List<Produit> getList() {
		return produitService.getList();
	}
	*/
	@PostMapping("/user/produit")
	public void addProduit(Produit produit) {
		produitService.addProduit(produit);
		
	}
	
}
