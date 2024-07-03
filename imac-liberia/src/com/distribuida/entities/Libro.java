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
@Table(name="libro")
public class Libro {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="id_libro")
	private int idlibro;
	@Column(name ="titulo")
	private String titulo;
	@Column(name ="editorial")
	private String editorial;
	@Column(name ="num_paginas")
	private int numpaginas;
	@Column(name ="edicion")
	private String edicion;
	@Column(name ="idioma")  
	private String idioma;
	@Column(name ="fecha_publicacion")  
	private String fechapublicacion;
	@Column(name ="descripcion")  
	private String descripcion ;
	@Column(name ="tipo_pasta")  
	private String tipopasta;
	@Column(name ="ISBN")  
	private String ISBN;
	@Column(name ="num_ejemplo")  
	private String numejemplo;
	@Column(name ="portada")  
	private String portada;
	@Column(name ="presentacion")  
	private String presentacion;
	@Column(name =" precio")  
	private double precio;
	
	
	private Factura_detalle factura_detalle;
	private Categoria categoria;
	private Autor autor;
	
	

	
	public Libro() {}
	public Libro(int idlibro, String titulo, String editorial, int numpaginas, String edicion, String idioma,
			String fechapublicacion, String descripcion, String tipopasta, String iSBN, String numejemplo,
			String portada, String presentacion, double precio, int id_categoria, int id_autor) {
		
		this.idlibro = idlibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.numpaginas = numpaginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fechapublicacion = fechapublicacion;
		this.descripcion = descripcion;
		this.tipopasta = tipopasta;
		ISBN = iSBN;
		this.numejemplo = numejemplo;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		
	}


	public int getidlibro() {
		return idlibro;
	}


	public void setidlibro(int idlibro) {
		this.idlibro = idlibro;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getnumpaginas() {
		return numpaginas;
	}


	public void setnumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}


	public String getEdicion() {
		return edicion;
	}


	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public String getfechapublicacion() {
		return fechapublicacion;
	}


	public void setfechapublicacion(String fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String gettipopasta() {
		return tipopasta;
	}


	public void settipopasta(String tipopasta) {
		this.tipopasta = tipopasta;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getnumejemplo() {
		return numejemplo;
	}


	public void setnumejemplo(String numejemplo) {
		this.numejemplo = numejemplo;
	}


	public String getPortada() {
		return portada;
	}


	public void setPortada(String portada) {
		this.portada = portada;
	}


	public String getPresentacion() {
		return presentacion;
	}


	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	

	public Factura_detalle getFactura_detalle() {
		return factura_detalle;
	}


	public void setFactura_detalle(Factura_detalle factura_detalle) {
		this.factura_detalle = factura_detalle;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "libro [idlibro=" + idlibro + ", titulo=" + titulo + ", editorial=" + editorial + ", numpaginas="
				+ numpaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechapublicacion="
				+ fechapublicacion + ", descripcion=" + descripcion + ", tipopasta=" + tipopasta + ", ISBN=" + ISBN
				+ ", numejemplo=" + numejemplo + ", portada=" + portada + ", presentacion=" + presentacion
				+ ", precio=" + precio + ", id_categoria=" + ", id_autor="+ "]";
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
