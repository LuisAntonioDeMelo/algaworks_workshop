package com.algaworks.comercial.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.comercial.model.Oportunidade;
//Get and Post
//localhost:9090/oportunidades

@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {

	@GetMapping
	public List<Oportunidade> listar() {
		Oportunidade oportunidade = new Oportunidade();
		oportunidade.setId(1L);
		oportunidade.setDescricao("Desenvolvimento de ERP com Angular e Spring");
		oportunidade.setNomeProspecto("Grupo Logística Brasil");
		oportunidade.setValor(new BigDecimal(49000));
		
		Oportunidade op2 = new Oportunidade();
		op2.setId(2l);
		op2.setDescricao("Desenvolvimento no IEL");
		op2.setNomeProspecto("AlgaIels");
		op2.setValor(new BigDecimal(5000));
		
		return Arrays.asList(oportunidade,op2);
	}
	
}
