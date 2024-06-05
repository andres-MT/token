package com.distribuida.entities;

public class Factura_detalle {
	private int id_factura_detalle;
	private int cantidad;
	private double subtotal;
	private int id_factura;
	private int id_libro;
	private Factura factura;
	private Libro libro;
	
	public Factura_detalle() {}
	
	public Factura_detalle(int id_factura_detalle, int cantidad, float subtotal, int id_factura, int id_libro) {
		
		this.id_factura_detalle = id_factura_detalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.id_factura = id_factura;
		this.id_libro = id_libro;
	}
	
	
	



	public int getId_factura_detalle() {
		return id_factura_detalle;
	}






	public void setId_factura_detalle(int id_factura_detalle) {
		this.id_factura_detalle = id_factura_detalle;
	}






	public int getCantidad() {
		return cantidad;
	}






	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}






	public double getSubtotal() {
		return subtotal;
	}






	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}






	public int getId_factura() {
		return id_factura;
	}






	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}






	public int getId_libro() {
		return id_libro;
	}






	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}






	public Factura getFactura() {
		return factura;
	}






	public void setFactura(Factura factura) {
		this.factura = factura;
	}






	public Libro getLibro() {
		return libro;
	}






	public void setLibro(Libro libro) {
		this.libro = libro;
	}






	@Override
	public String toString() {
		return "factura_detalle [id_factura_detalle=" + id_factura_detalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", id_factura=" + id_factura + ", id_libro=" + id_libro + "]";
	}
	
	
	
	
	
}
