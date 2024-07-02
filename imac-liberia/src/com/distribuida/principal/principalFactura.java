package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;

public class principalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDAO facturaDAO = context.getBean( "facturaDAOlmpl" ,FacturaDAO.class);
		ClienteDAO clienteDAO =context.getBean("clienteDAOlmpl",ClienteDAO.class);
		
		Factura factura =new Factura(0,"FAC-0001",new Date(),60.62,16.39,67.53);
		factura.setCliente(clienteDAO.findOne(2));
		//facturaDAO.add(factura);
		
		Factura factura2 =new Factura(93,"FAC-0004",new Date(),60.63,17.40,68.54);
		factura2.setCliente(clienteDAO.findOne(3));
		//facturaDAO.up(factura2);
		
		facturaDAO.del(93);
		
		
		//System.out.println("************** del ***************"+facturaDAO.findOne(91));
		facturaDAO.findALL().forEach(item ->{System.out.println(item.toString());});
		
		context.close();
	}	
	
		
	
	

}
