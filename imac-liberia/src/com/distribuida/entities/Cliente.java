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
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cliente")
		private int idCliente;
	@Column(name="cedula")
		private String cedula;
	@Column(name="nombre")
		private String nombre;
	@Column(name="apellido")
		private String apellido;
	@Column(name="direccion")
		private String direccion;
	@Column(name="telefono")
		private String telefomo;
	@Column(name="correo")
		private String correo;
	
	public  Cliente() {}
		public Cliente(int idCliente, String cedula, String nobre, String apellido,
				String direccion, String telefomo, String correo) {
			
			this.idCliente = idCliente;
			this.cedula = cedula;
			this.nombre = nobre;
			this.apellido = apellido;			
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

		

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
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
		
		

		


		@Override
		public String toString() {
			return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
					+ apellido + ", direccion=" + direccion + ", telefomo=" + telefomo + ", correo=" + correo + "]";
		} 
		
		
		
		
		
		
			
		

}
