package com.derso.security.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstouSeguradoController {

	@GetMapping("/")
	public Map<String, String> home() {
		HashMap<String, String> resposta = new HashMap<>();
		resposta.put("status", "ok");
		resposta.put("mensagem", "Estou segurado!");
		return resposta;
	}
	
}
