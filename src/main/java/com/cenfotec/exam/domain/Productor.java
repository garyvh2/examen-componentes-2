package com.cenfotec.exam.domain;

import org.springframework.data.annotation.Id;

public class Productor {
	@Id
	private String Id;
	private String Cedula;
	private String Empresa;
	private String Nombre;
	private String Provincia;
	private String Canton;
	private String Distrito;
	private String DireccionNominal;
	// Constructores
	public Productor() {}
	public Productor(String id, String cedula, String empresa, String nombre, String provincia, String canton, String distrito, String direccionNominal) {
		Id = id;
		Cedula = cedula;
		Empresa = empresa;
		Nombre = nombre;
		Provincia = provincia;
		Canton = canton;
		Distrito = distrito;
		DireccionNominal = direccionNominal;
	}

	// Getters & Setters
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getCanton() {
		return Canton;
	}
	public void setCanton(String canton) {
		Canton = canton;
	}
	public String getDistrito() {
		return Distrito;
	}
	public void setDistrito(String distrito) {
		Distrito = distrito;
	}
	public String getDireccionNominal() {
		return DireccionNominal;
	}
	public void setDireccionNominal(String direccionNominal) {
		DireccionNominal = direccionNominal;
	}
}
