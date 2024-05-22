package com.distribuida.entities;

public class Libro {
	private int id_libro;
	private String titulo;
	private String editorial;
	private int num_paginas;
	private String edicion;
	private String idioma;
	private String fecha_publicacion;
	private String descripcion ;
	private String tipo_pasta;
	private String ISBN;
	private String num_ejemplo;
	private String portada;
	private String presentacion;
	private double precio;
	private int id_categoria;
	private int id_autor;
	private Factura_detalle factura_detalle;
	private Categoria categoria;
	private Autor autor;
	
	public Libro(int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			String fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, String num_ejemplo,
			String portada, String presentacion, double precio, int id_categoria, int id_autor) {
		super();
		this.id_libro = id_libro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.num_paginas = num_paginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fecha_publicacion = fecha_publicacion;
		this.descripcion = descripcion;
		this.tipo_pasta = tipo_pasta;
		ISBN = iSBN;
		this.num_ejemplo = num_ejemplo;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		this.id_categoria = id_categoria;
		this.id_autor = id_autor;
	}


	public int getId_libro() {
		return id_libro;
	}


	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
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


	public int getNum_paginas() {
		return num_paginas;
	}


	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
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


	public String getFecha_publicacion() {
		return fecha_publicacion;
	}


	public void setFecha_publicacion(String fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipo_pasta() {
		return tipo_pasta;
	}


	public void setTipo_pasta(String tipo_pasta) {
		this.tipo_pasta = tipo_pasta;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getNum_ejemplo() {
		return num_ejemplo;
	}


	public void setNum_ejemplo(String num_ejemplo) {
		this.num_ejemplo = num_ejemplo;
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


	public int getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}


	public int getId_autor() {
		return id_autor;
	}


	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
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
		return "libro [id_libro=" + id_libro + ", titulo=" + titulo + ", editorial=" + editorial + ", num_paginas="
				+ num_paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fecha_publicacion="
				+ fecha_publicacion + ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_pasta + ", ISBN=" + ISBN
				+ ", num_ejemplo=" + num_ejemplo + ", portada=" + portada + ", presentacion=" + presentacion
				+ ", precio=" + precio + ", id_categoria=" + id_categoria + ", id_autor=" + id_autor + "]";
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
