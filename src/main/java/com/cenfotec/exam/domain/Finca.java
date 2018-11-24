package com.cenfotec.exam.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Finca {
	@Id
	private String id;
	private String nombre;
	private String descripcion;
	private List<String> cafes = new ArrayList<String>();;
	//Constructors
	public Finca() {}
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
	public List<String> getCafes() {
		return cafes;
	}
	public void setCafes(List<String> cafes) {
		this.cafes = cafes;
	}
	public void addCafes(String cafeId) {
		this.cafes.add(cafeId);
	}
}
