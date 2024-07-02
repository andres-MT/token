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
@Table(name ="factura")
public class Factura {
	

	//@OneToOne
	//@ManyToOne
	//@OneToMany
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura")
	private int idFactura;
	@Column(name = "num_factura")
	private String numFactura;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "total_neto")
	private double totalneto;
	@Column(name = "iva")
	private double iva;
	@Column(name = "total")
	private double total;
	
	@JoinColumn(name ="id_cliente")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Cliente cliente;

	
	public Factura() {}
	
	public Factura(int idFactura, String numFactura, Date fecha, double totalneto, double iva, double total) {
	
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.fecha = fecha;
		this.totalneto = totalneto;
		this.iva = iva;
		this.total = total;
	
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getTotalneto() {
		return totalneto;
	}

	public void setTotalneto(double totalneto) {
		this.totalneto = totalneto;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalneto="
				+ totalneto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}
	
	
	
	
	
} 


