package com.cenfotec.exam.domain;

import org.springframework.data.annotation.Id;

public class Finca {
	@Id
	private String Id;
	private String Nombre;
	private String Descripcion;
	
	//Constructors
	public Finca() {}
	public Finca(String id, String nombre, String descripcion) {
		Id = id;
		Nombre = nombre;
		Descripcion = descripcion;
	}

	// Getters & Setters
	public String getId() {
		return Id;
	}
	
	public void setId(String id) {
		Id = id;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

}
