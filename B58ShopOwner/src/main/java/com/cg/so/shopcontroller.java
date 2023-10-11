package com.cg.so;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class shopcontroller {
	
	@Autowired
	
	private shopservice service ;
	
	//Retrieval
	@GetMapping("/shops")
	public List<shop> list() {
		return service.listAll();
	}
	
	//Retrieval By Id
	@GetMapping("/shops/{id}")
	public ResponseEntity <shop> get(@PathVariable Integer id) {
		
			try {
				shop shop=service.get(id);
				return new ResponseEntity <shop> (shop,HttpStatus.OK);
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				return new ResponseEntity<shop> (HttpStatus.NOT_FOUND);
			}
	}
	
	//Create
	@PostMapping("/shops")
	public void add(@RequestBody shop shop) {
		service.save(shop);
	}
	
	//Update
	@PostMapping("/shops/{id}")
	public ResponseEntity<?> update(@RequestBody shop shop, @PathVariable Integer id) {
		try {
			shop existshop=service.get(id);
			service.save(shop);
			return new ResponseEntity <> (HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	//Delete
	@DeleteMapping("shops/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
}

}
