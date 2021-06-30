package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cafe;
import com.example.demo.service.CafeService;

@RestController
@RequestMapping("/api")
public class CafeController {
	
	//ENDPOINTS
	@Autowired
	private CafeService cafeService;
	//consulte cafes
	
	@GetMapping("/getproductos")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<List<Cafe>> getCafe(){
		
		List<Cafe> cl = new ArrayList<Cafe>();
		
		//lllamar al service y llamar al adao y crear la consulta
	
		
		/*
		cl.add(newef Cafe(1, "tostado", "negro", "suave","brasil", "30"));
		cl.add(new Cafe(2, "verde", "marron", "suave","colombia", "50"));
		cl.add(new Cafe(3, "molido", "negro", "fuerte","chile", "25"));
		cl.add(new Cafe(4, "grano", "negro", "fuerte","chile", "65"));
		*/
		
		return ResponseEntity.ok(this.cafeService.listarCafe());
		}
	
	
	
	// crear cafe
	@PostMapping("/addCoffe")
	public ResponseEntity<Boolean> addCoffe(@RequestParam Cafe cafe){
		
		
		return ResponseEntity.ok(this.cafeService.addCoffeService(cafe));
		
		
	}
	
	@DeleteMapping("/deleteCofee")
	public ResponseEntity<Boolean> deleteCoffe(@PathVariable int id){
		
		this.cafeService.deleteCoffeeService(id);
		
		return null;
		
		
		
	}
	
	
	@PutMapping("/actualizarCoffe")
	public ResponseEntity<Boolean> updateCoffe(@RequestParam Cafe cafe){
		return ResponseEntity.ok(this.cafeService.actualizarCafe(cafe));

	}

	
	
	//delete cafe
	//modificar cafe

}
