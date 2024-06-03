package com.distribuida.entities;

import java. util.Date;

import org.springframework.stereotype.Component; 

@Component
public class Cliente {
		private int idCliente;
		private String cedula;
		private String nobre;
		private String apellido;
		private Date fechaNacimiento;
		private String direccion;
		private String telefomo;
		private String correo;
		private Factura factura;
		
		public Cliente(int idCliente, String cedula, String nobre, String apellido, Date fechaNacimiento,
				String direccion, String telefomo, String correo) {
			super();
			this.idCliente = idCliente;
			this.cedula = cedula;
			this.nobre = nobre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
			this.direccion = direccion;
			this.telefomo = telefomo;
			this.correo = correo;
		}
		
		public int getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getNobre() {
			return nobre;
		}

		public void setNobre(String nobre) {
			this.nobre = nobre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getTelefomo() {
			return telefomo;
		}

		public void setTelefomo(String telefomo) {
			this.telefomo = telefomo;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}
		
		

		
		public Factura getFactura() {
			return factura;
		}

		public void setFactura(Factura factura) {
			this.factura = factura;
		}

		@Override
		public String toString() {
			return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nobre=" + nobre + ", apellido="
					+ apellido + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", telefomo="
					+ telefomo + ", correo=" + correo + "]";
		} 
		
		
		
		
		
		
			
		

}
