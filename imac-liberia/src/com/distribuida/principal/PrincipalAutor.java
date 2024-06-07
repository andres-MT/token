package com.distribuida.principal;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Patron IK Inversión de Control
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AutorDAO autorDAO =context.getBean("AutorDAOmpl",AutorDAO.class);
		List<Autor> autor=autorDAO.findALL();
		autor.forEach(item ->{
			System.out.println(item.toString());
		});
		context.close();
	}

}
