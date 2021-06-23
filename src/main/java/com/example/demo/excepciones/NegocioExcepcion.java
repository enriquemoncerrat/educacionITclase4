package com.example.demo.excepciones;

public class NegocioExcepcion extends Exception  {
  
	 private String mensaje ;

	 
	 
	 
	public NegocioExcepcion(String mensaje) {
		super();
		this.mensaje = mensaje;
	}




	public NegocioExcepcion() {
		super();
	}




	public String getMensaje() {
		return mensaje;
	} 
	 
}
