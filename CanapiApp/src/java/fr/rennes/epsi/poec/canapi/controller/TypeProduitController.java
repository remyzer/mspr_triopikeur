package fr.rennes.epsi.poec.canapi.controller;

import java.lang.reflect.Type;
import java.util.List;

import fr.rennes.epsi.poec.canapi.domain.Client;
import fr.rennes.epsi.poec.canapi.domain.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.rennes.epsi.poec.canapi.domain.TypeProduit;
import fr.rennes.epsi.poec.canapi.service.TypeProduitService;

@RestController
public class TypeProduitController {
	
	@Autowired
	private TypeProduitService typeProduitService;
	
	@CrossOrigin
	@PostMapping("/public/listTypeProduit")
	public Response<List<TypeProduit>> getType() {
		List<TypeProduit> typeProduit= typeProduitService.getType();
		Response<List<TypeProduit>> response = new Response<>();
		response.setData(typeProduit);
		return response ;
	}
	
}
