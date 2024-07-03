package com.distribuida.principal;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.Factura_detalleDAO;
import com.distribuida.entities.Factura_detalle;
public class PrincipalFactura_detalle {
public static void main(String[]args) {
	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
	com.distribuida.dao.Factura_detalleDAO Factura_detalleDAO =context.getBean("Factura_detalleDAOlmpl",Factura_detalleDAO.class);
	List<com.distribuida.entities.Factura_detalle> Factura_detalle=Factura_detalleDAO.findAll();
	Factura_detalle.forEach(item ->{
		
		System.out.print(item.toString());
	});
	context.close();
}
}
