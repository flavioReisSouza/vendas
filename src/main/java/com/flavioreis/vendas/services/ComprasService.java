package com.flavioreis.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavioreis.vendas.DTO.ClienteDTO;
import com.flavioreis.vendas.DTO.ComprasDTO;
import com.flavioreis.vendas.entities.Cliente;
import com.flavioreis.vendas.entities.Compras;
import com.flavioreis.vendas.repositories.ClienteRepository;
import com.flavioreis.vendas.repositories.ComprasRepository;

@Service
public class ComprasService {
	
	@Autowired
	private ComprasRepository comprasRepository;

	public List<ComprasDTO> findAll() {
		List<Compras>res = comprasRepository.findAll();
		return res.stream().map(c->new ComprasDTO(c)).collect(Collectors.toList());
	}

}
