package com.distribuida.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Factura {
	private int idFactura;
	private String num_Factura;
	private Date fecha;
	private double total_neto;
	private double iva;
	private double total;
	//private int idCliente
	private Cliente cliente;
	private Factura_detalle factura_detalle;
	
	
	
	public Factura(int idFactura, String num_factura, Date fecha, float total_neto, float iva, float total) {
	
		this.idFactura = idFactura;
		this.num_Factura = num_factura;
		this.fecha = fecha;
		this.total_neto = total_neto;
		this.iva = iva;
		this.total = total;
	
	}

	


	public int getIdFactura() {
		return idFactura;
	}




	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}




	public String getNum_factura() {
		return num_Factura;
	}




	public void setNum_factura(String num_factura) {
		this.num_Factura = num_factura;
	}




	public Date getFecha() {
		return fecha;
	}




	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}




	public double getTotal_neto() {
		return total_neto;
	}




	public void setTotal_neto(double total_neto) {
		this.total_neto = total_neto;
	}




	public double getIva() {
		return iva;
	}




	public void setIva(double iva) {
		this.iva = iva;
	}




	public double getTotal() {
		return total;
	}




	public void setTotal(double total) {
		this.total = total;
	}








	




	public String getNum_Factura() {
		return num_Factura;
	}




	public void setNum_Factura(String num_Factura) {
		this.num_Factura = num_Factura;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	




	public Factura_detalle getFactura_detalle() {
		return factura_detalle;
	}




	public void setFactura_detalle(Factura_detalle factura_detalle) {
		this.factura_detalle = factura_detalle;
	}




	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", num_Factura=" + num_Factura + ", fecha=" + fecha + ", total_neto="
				+ total_neto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}
	
	
} 


