package com.distribuida.principal;
import java. util. List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Patrón 10C Inversión de Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean( "clienteDAOlmpl" ,ClienteDAO.class);
		
		Cliente cliente =new Cliente(0,"123456789","jack","tejada","av por nose","094837673","jack@gmail.com");
		clienteDAO.add(cliente);
		Cliente cliente1 =new Cliente(1,"123456789","jack","tejada","av por nose","094837673","jack@gmail.com");
		clienteDAO.add(cliente);
		Cliente cliente2 =new Cliente(2,"123456789","jack","tejada","av por nose","094837673","jack@gmail.com");
		clienteDAO.add(cliente);
		clienteDAO.del(1);
		System.out.println("************** del ***************"+clienteDAO.findOne(1));
		clienteDAO.findALL().forEach(item ->{System.out.print(item.toString());});
		
		
		
		List<Cliente> clientes= clienteDAO.findALL();
		
		clientes.forEach(item -> {
			
			System. out. println(item.toString());
		});
		
		context.close();
	}

}
