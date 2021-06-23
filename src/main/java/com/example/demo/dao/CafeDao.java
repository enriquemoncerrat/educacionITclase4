package com.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.demo.config.ConnectionManager;
import com.example.demo.excepciones.NegocioExcepcion;
import com.example.demo.model.Cafe;


public class CafeDao {
	
	
	public void insertaCafe(Cafe cafe) throws NegocioExcepcion, NumberFormatException, SQLException {
		
		Connection conn = null;
		PreparedStatement ps= null;
		
		  conn =  ConnectionManager.getConnection();
		   if(existeCafe(cafe.getId())) {
			   
			   throw new NegocioExcepcion("el cliente ya fue cargado ");
			   
		   }
		    //insert '
		   String sql =  "insert into productoscafe (id, tipo, color, precio,region) values (?,?,?,?)";
		   ps = conn.prepareStatement(sql);
		   ps.setInt(1, cafe.getId());
		   ps.setString(2,cafe.getTipo());
		   ps.setString(3, cafe.getColor());
		   ps.setInt(4,Integer.parseInt(cafe.getPrecio()));
		   ps.setString(5, cafe.getRegion());
		   ps.execute();
		   ps.close();

		  
	}
	
	
	
	public boolean existeCafe(int id) {
		
		//select y comparar
		return false;
		
		
	}

}
