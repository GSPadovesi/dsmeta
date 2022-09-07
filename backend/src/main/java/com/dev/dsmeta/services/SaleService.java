package com.dev.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dsmeta.entities.Sale;
import com.dev.dsmeta.repositories.SaleRepository;

@Service // Essa Annotation registra essa classe sendo um compnente do sistema
public class SaleService {

	@Autowired
	private SaleRepository repository;

	public List<Sale> findSales() {
		return repository.findAll();
	}

}
