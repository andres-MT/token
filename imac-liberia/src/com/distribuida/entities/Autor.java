package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Autor {
	private int id_autor;
	private String nombre1;
	private String nombre2;
	private String apellido;
	private String pais;
	private String direccion;
	private String telefono;
	private String correo ;
	private Libro libro;
	
	
	public Autor() {}
	
	public Autor(int id_autor, String nombre1, String nombre2, String apellido, String pais, String direccion,
			String telefono, String correo, Libro libro) {
		
		this.id_autor = id_autor;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido = apellido;
		this.pais = pais;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.libro = libro;
	}
	
	
	public int getId_autor() {
		return id_autor;
	}
	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}
	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public String getNombre2() {
		return nombre2;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	@Override
	public String toString() {
		return "Autor [id_autor=" + id_autor + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido="
				+ apellido + ", pais=" + pais + ", direccion=" + direccion + ", telefono=" + telefono + ", correo="
				+ correo + ", libro=" + libro + "]";
	}
	
}
	
	

