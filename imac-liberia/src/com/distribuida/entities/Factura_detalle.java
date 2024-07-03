package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Factura_detalle")
public class Factura_detalle {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column(name ="id_factura_detalle")
	private int idfacturadetalle;
	@Column(name ="cantidad")
	private int cantidad;
	@Column(name ="subtotal")
	private double subtotal;
	
	
	@JoinColumn(name ="id_factura")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Factura factura;
	
	@JoinColumn(name ="id_libro")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Factura libro;
	
	public Factura_detalle() {}
	
	public Factura_detalle(int id_factura_detalle, int cantidad, float subtotal, int id_factura, int id_libro) {
		
		this.idfacturadetalle = id_factura_detalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		
	}
	
	
	



	public int getId_factura_detalle() {
		return idfacturadetalle;
	}






	public void setId_factura_detalle(int id_factura_detalle) {
		this.idfacturadetalle = id_factura_detalle;
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












	public Factura getFactura() {
		return factura;
	}






	public void setFactura(Factura factura) {
		this.factura = factura;
	}











	@Override
	public String toString() {
		return "factura_detalle [id_factura_detalle=" + idfacturadetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal  + "]";
	}
	
	
	
	
	
}
