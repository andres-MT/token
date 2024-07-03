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

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

@Controller
@RequestMapping("/categoria") //Path principal
public class CategoriaController {
	
	private CategoriaDAO categoriaDAO;
	
	@GetMapping("/findAll") //Path secundario
	public String findAll(Model model) {
		
		//try {
			
			List<Categoria> categoria = categoriaDAO.findALL();
			model.addAllAttributes(categoria);
			return "listar-categoria"; //esto es el nombre del formulario EJ."listar -categoria.html" o"listar -categoria.jsp"
			
	//	}catch(Exception e) {
	//		e.printStackTrace();
	//	}
		
	}
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idCategoria")@Nullable Integer idCategoria 
			             ,@RequestParam("opcion")@Nullable Integer opcion
			             ,Model model
			
			) {
		//try {
			if(idCategoria !=null) {
				Categoria categoria =categoriaDAO.findOne(idCategoria);
				model.addAttribute("categoria", categoria);
			}
			if(opcion ==1)return"add-categoria";
			else return "del-categoria" ;
		//} catch (Exception e) {
			// TODO: handle exception
		//}
		
	}
	
	@PostMapping("/add")
	public String add(@RequestParam("idCategoria") @Nullable Integer idCategoria
			         ,@RequestParam("cedula") @Nullable String cedula
			         ,@RequestParam("nombre") @Nullable String nombre
			         ,@RequestParam("apellido") @Nullable String apellido
			         ,@RequestParam("direccion") @Nullable String direccion
			         ,@RequestParam("telefono") @Nullable String telefono
			         ,@RequestParam("correo") @Nullable String correo
			         ,Model model
			         ) {
		//try {
			
			
			
			if(idCategoria ==null) {
			 Categoria categoria = new Categoria(0,cedula,nombre,apellido,direccion,telefono,correo);
			categoriaDAO.add(categoria);
		} else {
			Categoria categoria1 = new Categoria(idCategoria,cedula,nombre,apellido,direccion,telefono,correo);
			categoriaDAO.add(categoria1);
			
		}
			return "redirect:/categoria/findAll";
			
			
		//} catch (Exception e) {
			// TODO: handle exception
	//	}
		
}


	
	@GetMapping("/del")
	public String del (@RequestParam("idCliente")@Nullable Integer idCliente) {
		
		//try {
			categoriaDAO.del(idCliente);
			
			return "redirect:/categoria/findAll";
		//} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
 


