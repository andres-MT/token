package com.distribuida.principal;
import java. util. List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Patrón 10C Inversión de Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO AutorDAO = context.getBean( "autorDAOlmpl" ,AutorDAO.class);
		
		Autor autor =new Autor(0,"123456789","jack1","tejada","av por nose","094837673","jack@gmail.com", null);
		//AutorDAO.add(autor);
		
		Autor autor3 =new Autor(60,"1234597892","jack2","gordillo2","av por ahi2","0948336762","gordillo2@gmail.com",null);
	    //AutorDAO.up(autor3);
		
		//AutorDAO.del(60);
		//System.out.println("************** del ***************"+AutorDAO.findOne(1));
		try {System.out.println("************** del ***************"+AutorDAO.findOne(1));} catch(Exception e) {e.printStackTrace();}
		AutorDAO.findALL().forEach(item ->{System.out.println(item.toString());});
		
		
		
//		List<Autor> Autors= AutorDAO.findALL();
//		
//		Autors.forEach(item -> {System.out.println(item.toString());});
		
		context.close();
	}

}

