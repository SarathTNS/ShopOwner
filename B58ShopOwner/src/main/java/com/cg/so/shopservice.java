package com.cg.so;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class shopservice {
	
	@Autowired
	
	private shoprepository repository;

	public List<shop>listAll() {
		return repository.findAll();
		
	}

	public shop get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save(shop shop) {
		repository.save(shop);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	
	
	
	}
