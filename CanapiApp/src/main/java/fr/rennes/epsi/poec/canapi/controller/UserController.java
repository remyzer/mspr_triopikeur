package fr.rennes.epsi.poec.canapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.rennes.epsi.poec.canapi.domain.Produit;
import fr.rennes.epsi.poec.canapi.domain.User;
import fr.rennes.epsi.poec.canapi.exception.BusinessException;
import fr.rennes.epsi.poec.canapi.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/public/register")
	public void addUser(User user) {
		userService.addUser(user);
	}
	
}
