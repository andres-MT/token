package com.distribuida.entities;

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
	private int idcategoria;
	@Column(name="categoria")
	private String categoria;
	@Column(name="descripcion")
	private String descripcion;

	 
	
	 public Categoria() {}
	 
	public Categoria(int id_categoria, String categoria, String descripcion) {
		
		this.idcategoria = id_categoria;
		this.categoria = categoria;
	}



	public int getId_categoria() {
		return idcategoria;
	}



	public void setId_categoria(int id_categoria) {
		this.idcategoria = id_categoria;
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

	




	@Override
	public String toString() {
		return "categoria [id_categoria=" + idcategoria + ", categoria=" + categoria + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
