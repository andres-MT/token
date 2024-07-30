package com.distribuida.controller;

import java.util.List;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

@Controller
@RequestMapping("/autor") //Path principal
public class AutorController {
	
	private AutorDAO AutorDAO;
	
	@GetMapping("/findAll") //Path secundario2
	public String findAll(Model model) {
		
		//try {
			
			List<Autor> autor = AutorDAO.findALL();
			model.addAllAttributes(autor);
			return "listar-autor"; //esto es el nombre del formulario EJ."listar -autor.html" o"listar -autor.jsp"
			
	//	}catch(Exception e) {
	//		e.printStackTrace();
	//	}
		
	}
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idAutor")@Nullable Integer idAutor 
			             ,@RequestParam("opcion")@Nullable Integer opcion
			             ,Model model
			
			) {
		//try {
			if(idAutor !=null) {
				Autor Autor =AutorDAO.findOne(idAutor);
				model.addAttribute("Autor", Autor);
			}
			if(opcion ==1)return"add-autor";
			else return "del-autor" ;
		//} catch (Exception e) {
			// TODO: handle exception
		//}
		
	}
	
	@PostMapping("/add")
	public String add(@RequestParam("idAutor") @Nullable Integer idAutor                
			         ,@RequestParam("idAutor") @Nullable String nombre
			         ,@RequestParam("idAutor") @Nullable String apellido
			         ,@RequestParam("idAutor") @Nullable String pais
			         ,@RequestParam("idAutor") @Nullable String direccion
			         ,@RequestParam("idAutor") @Nullable String telefono
			         ,@RequestParam("idAutor") @Nullable String correo
			         ,Model model
			         //,Model model
			         //chigas 
			         ) {
		//try {
			if(idAutor ==null) {
			 Autor Autor = new Autor(0,nombre,apellido,pais,direccion,telefono,correo);
			AutorDAO.add(Autor);
		} else {
			Autor Autor2 = new Autor(idAutor,nombre,apellido,pais,direccion,telefono,correo);
			AutorDAO.add(Autor2);
			
		}
			return "redirect:/autor/findAll";
			
			
		//} catch (Exception e) {
			// TODO: handle exception
	//	}
		
}


	
	@GetMapping("/del")
	public String del (@RequestParam("idAutor")@Nullable Integer idAutor) {
		
		//try {
			AutorDAO.del(idAutor);
			
			return "redirect:/autor/findAll";
		//} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
 


