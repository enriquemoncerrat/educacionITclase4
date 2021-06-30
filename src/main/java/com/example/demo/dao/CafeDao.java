package com.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		//
		//select y comparar
		return false;
		
		
	}
	
	public String borrarCafe(int id) throws SQLException {
		
		Connection conn = null;
		PreparedStatement ps= null;
		
		   conn =  ConnectionManager.getConnection();
		   ps = conn.prepareStatement("DELETE FROM cafe where id = '" + id + "'");
		   ps.execute();
		   ps.close();
        return "ok" ;
    }
    
    public void modificarCafe(Cafe c) throws SQLException {
          Connection conn = null;
    	   conn =  ConnectionManager.getConnection();
            PreparedStatement st = conn.prepareStatement("update cafe set id= ? where id= ?");
            st.setInt(1, c.getId());
            st.execute();
            st.close();
        }

	public List<Cafe> listarCafe(){
		ArrayList<Cafe>  cafes = new ArrayList<Cafe>();
		Connection conn = null;
		ResultSet rs = null;
		conn = ConnectionManager.getConnection();
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("select * from productoscafe order by id asc");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs = st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				  Cafe c = new Cafe();
				  c.setId(rs.getInt("id"));
				  c.setColor(rs.getString("color"));
				  c.setFragancia(rs.getString("fragancia"));
				  c.setPrecio(rs.getString("precio"));
				  c.setRegion(rs.getString("region"));
				  c.setTipo(rs.getString("tipo"));
				  cafes.add(c);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return cafes;
	}
	//metodo delete del cafe lo q recibe delete from  ....
	//metodo de consultar la lista de cafes  select * from....
	//modificar un cafe update from .................




}
