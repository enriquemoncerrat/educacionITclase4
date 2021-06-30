package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.CafeDao;
import com.example.demo.excepciones.NegocioExcepcion;
import com.example.demo.model.Cafe;

@Service
public class CafeService {
	
	
	private CafeDao cafeDao = new CafeDao();
	
	
	public List<Cafe> listarCafe(){
		List<Cafe> cafes= this.cafeDao.listarCafe();
		
	return cafes;
	}
	
	
	public boolean addCoffeService( Cafe cafe) 
	{
		try {
			this.cafeDao.insertaCafe(cafe);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegocioExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
		
		
	}
	
	public boolean deleteCoffeeService(int id) {
		
		try {
			this.cafeDao.borrarCafe(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
		
		
	}

	public boolean actualizarCafe(Cafe cafe) {
		// TODO Auto-generated method stub
		try {
			this.cafeDao.modificarCafe(cafe);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	

}
