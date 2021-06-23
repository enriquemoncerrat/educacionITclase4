package com.example.demo.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.example.demo.dao.CafeDao;
import com.example.demo.excepciones.NegocioExcepcion;
import com.example.demo.model.Cafe;

@Service
public class CafeService {
	
	
	private CafeDao cafeDao;
	
	
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
	

}
