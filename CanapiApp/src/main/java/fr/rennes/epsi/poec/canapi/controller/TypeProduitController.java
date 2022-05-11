package fr.rennes.epsi.poec.canapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.rennes.epsi.poec.canapi.domain.TypeProduit;
import fr.rennes.epsi.poec.canapi.service.TypeProduitService;

@RestController
public class TypeProduitController {
	
	@Autowired
	private TypeProduitService typeProduitService;
	
	@PostMapping("/user/listTypeProduit")
	public List<TypeProduit> getType() {
		return typeProduitService.getType();
	}
	
}
