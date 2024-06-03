package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Categoria {
	private int id_categoria;
	private String categoria;
	private String descripcion;
	 private Libro libro;
	 
	
	
	public Categoria(int id_categoria, String categoria, String descripcion) {
		super();
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
