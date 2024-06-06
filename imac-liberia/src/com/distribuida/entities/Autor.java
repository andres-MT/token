package com.distribuida.entities;

import java. util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private int idautor;
	@Column(name="nobre1")
	private String nombre1;
	@Column(name="nombre2")
	private String nombre2;
	@Column(name="apellido")
	private String apellido;
	@Column(name="pais")
	private String pais;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="correo")
	private String correo;
	@Column(name="libro")
	private Libro libro;
	
	
	public Autor() {}
	
	public Autor(int id_autor, String nombre1, String nombre2, String apellido, String pais, String direccion,
			String telefono, String correo, Libro libro) {
		
		this.idautor = id_autor;
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
		return idautor;
	}
	public void setId_autor(int id_autor) {
		this.idautor = id_autor;
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
		return "Autor [id_autor=" + idautor + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido="
				+ apellido + ", pais=" + pais + ", direccion=" + direccion + ", telefono=" + telefono + ", correo="
				+ correo + ", libro=" + libro + "]";
	}
	
}
	
	

