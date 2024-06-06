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
@Table(name="categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id_categoria")
	private int id_categoria;
	@Column(name="categoria")
	private String categoria;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="libro")
	 private Libro libro;
	 
	
	 public Categoria() {}
	public Categoria(int id_categoria, String categoria, String descripcion) {
		
		this.id_categoria = id_categoria;
		this.categoria = categoria;
		this.descripcion = descripcion;
	}



	public int getId_categoria() {
		return id_categoria;
	}



	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	


	public Libro getLibro() {
		return libro;
	}



	public void setLibro(Libro libro) {
		this.libro = libro;
	}



	@Override
	public String toString() {
		return "categoria [id_categoria=" + id_categoria + ", categoria=" + categoria + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
