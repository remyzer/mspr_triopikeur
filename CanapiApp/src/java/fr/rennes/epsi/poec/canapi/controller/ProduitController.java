package fr.rennes.epsi.poec.canapi.controller;

import java.util.List;

import fr.rennes.epsi.poec.canapi.domain.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.rennes.epsi.poec.canapi.domain.Produit;
import fr.rennes.epsi.poec.canapi.service.ProduitService;

@RestController
public class ProduitController {

	@Autowired
	private ProduitService produitService;

	@CrossOrigin
	@GetMapping("/public/listProduit")
	public Response<List<Produit>> getList() {
		List<Produit> produits = produitService.getList();
		Response<List<Produit>> response = new Response<>();
		response.setData(produits);
		return response;
	}

	@CrossOrigin
	@PostMapping("/public/addProduit")
	public void addProduit(@RequestBody Produit produit) {
		produitService.addProduit(produit);
	}

	@CrossOrigin
	@PostMapping("/public/updateProduit")
	public void updateProduit(Produit produit) {
		produitService.updateProduit(produit);
	}

	@CrossOrigin
	@PostMapping("/public/deleteProduit")
	public void deleteProduit(@RequestBody int idProduit) {
		produitService.deleteProduit(idProduit);
	}
}
