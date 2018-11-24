package com.cenfotec.exam.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Productor {
	@Id
	private String id;
	private String cedula;
	private String empresa;
	private String nombre;
	private String provincia;
	private String canton;
	private String distrito;
	private String direccionNominal;
	private List<String> fincas = new ArrayList<String>();
	// Constructores
	public Productor() {}
	// Getters & Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCanton() {
		return canton;
	}
	public void setCanton(String canton) {
		this.canton = canton;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getDireccionNominal() {
		return direccionNominal;
	}
	public void setDireccionNominal(String direccionNominal) {
		this.direccionNominal = direccionNominal;
	}
	public List<String> getFincas() {
		return fincas;
	}
	public void setFincas(List<String> fincas) {
		this.fincas = fincas;
	}
	public void addFinca(String fincaId) {
		this.fincas.add(fincaId);
	}
	
	
}
