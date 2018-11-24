package com.cenfotec.exam.domain;

import org.springframework.data.annotation.Id;

public class VariedadCafe {
	@Id
	private String id;
	private String nombre;
	private String descripcion;
	//Constructors
	public VariedadCafe() {}
	// Getters & Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
