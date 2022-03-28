package br.com.projeto.tcc.TecHealth.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	
	@GetMapping(value = "/teste")
	public ResponseEntity<List<String>> teste() {
		List<String> listTeste = new ArrayList();
		listTeste.add("Diego");
		listTeste.add("Alves");
		listTeste.add("Vicente");
		
		return ResponseEntity.ok(listTeste);
	}
}
