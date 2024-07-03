package com.distribuida.principal;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Patron IK Inversión de Control
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LibroDAO libroDAO =context.getBean("LibroDAOlmpl",LibroDAO.class);
		
		List<Libro> libro=libroDAO.findALL();
		
		libro.forEach(item ->{
			
			System.out.println(item.toString());
		});
		
		context.close();
	}

}
