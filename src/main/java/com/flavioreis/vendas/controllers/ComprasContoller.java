package com.flavioreis.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flavioreis.vendas.DTO.ClienteDTO;
import com.flavioreis.vendas.DTO.ComprasDTO;
import com.flavioreis.vendas.services.ClienteService;
import com.flavioreis.vendas.services.ComprasService;

@RestController // ela vai ter endpoints
@RequestMapping("/compras")
public class ComprasContoller {

	@Autowired
	private ComprasService comprasService;

	@GetMapping
	public ResponseEntity<List<ComprasDTO>> findAll() {
		List<ComprasDTO> lista = comprasService.findAll();
		return ResponseEntity.ok(lista);
	}

}
