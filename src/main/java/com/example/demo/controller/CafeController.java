package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ResponseEntity<List<Cafe>> getCafe(){
		
		List<Cafe> cl = new ArrayList<Cafe>();
		
		cl.add(new Cafe(1, "tostado", "negro", "suave","brasil", "30"));
		cl.add(new Cafe(1, "verde", "marron", "suave","colombia", "50"));
		cl.add(new Cafe(1, "molido", "negro", "fuerte","chile", "25"));
		cl.add(new Cafe(1, "grano", "negro", "fuerte","chile", "65"));
		
		
		return ResponseEntity.ok(cl);
		}
	
	
	
	// crear cafe
	@PostMapping("/addCoffe")
	public ResponseEntity<Boolean> addCoffe(@RequestParam Cafe cafe){
		
		
		return ResponseEntity.ok(this.cafeService.addCoffeService(cafe));
		
		
	}
	
	
	//delete cafe
	//modificar cafe

}
