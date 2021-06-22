package com.example.demo.model;



public class Cafe {
	
	private int id;
	private String tipo;
	private String color;
	private String fragancia;
	private String region;
	private String precio;
	
	
	public Cafe() {
		super();
	}
	public Cafe(int id, String tipo, String color, String fragancia, String region, String precio) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.color = color;
		this.fragancia = fragancia;
		this.region = region;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFragancia() {
		return fragancia;
	}
	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	} 
	
	

}
