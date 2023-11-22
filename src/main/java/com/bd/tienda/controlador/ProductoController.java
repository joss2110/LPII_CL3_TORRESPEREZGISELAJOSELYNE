package com.bd.tienda.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.tienda.modelo.ClassProducto;
import com.bd.tienda.servicios.IProductoServicio;

@Controller
@RequestMapping("/Vistas")
public class ProductoController {

	//inyeccion de dependencia...
	@Autowired
	private IProductoServicio iproductoservicio;
	//creamos el metodo listado..
	@GetMapping("ListadoProductos")
	public String ListadoProducto(Model modelo) {
		//recuperamos el listado de productos..
		List<ClassProducto> listado=iproductoservicio.ListadoProductos();
		for(ClassProducto lis:listado) {
	System.out.println("codigo "+lis.getIdproductocl3()+" "+" nombre "+lis.getNombrecl3());
		}
		//enviamos la data hacia la vista..
		modelo.addAttribute("listado",listado);
		//retornamos
		return "/Vistas/ListadoProductos";
		
	}  //fin del metodo listado producto...
	
	//creamos los respectivos para metodos para registrar...
	@GetMapping("/RegistrarProducto")
	public String RegistrarProducto(Model modelo) {
		//realizamos la respectiva instancia...
		ClassProducto clproducto=new ClassProducto();
		//enviamos a la vista...
		modelo.addAttribute("regproducto",clproducto);
		//retornamos
		return "/Vistas/FrmCrearProducto";
		
	}  //fin del metodo registrar.
	
	//realizamos el mapeo con postmapping
	@PostMapping("/GuardarProducto")
	public String GuardarProducto(@ModelAttribute ClassProducto prod,Model modelo) {
		iproductoservicio.Registrar(prod);
		System.out.println("dato registrado en la bd");
		//retornamos al listado...
		return "redirect:/Vistas/ListadoProductos";	
	}  //fin del metodo string...
	
	//*****************crearmos el metodo editar...
	@GetMapping("/editar/{id}")
	public String Editar(@PathVariable("id") Integer idproducto,Model modelo) {
		ClassProducto clproducto=iproductoservicio.BuscarporId(idproducto);
		//enviamos hacia la vista...
		modelo.addAttribute("regproducto",clproducto);
		//retornamos el frmcrearproducto...
		return "/Vistas/FrmCrearProducto";	
	}  //fin del metodo editar...
	
	//*****************crearmos el metodo eliminar...
	@GetMapping("/eliminar/{id}")
	public String Eliminar(@PathVariable("id") Integer idproducto,Model modelo) {
		//aplicamos inyeccion de dependencia
		iproductoservicio.eliminar(idproducto);
		//actualizar el listado
		List<ClassProducto> listado=iproductoservicio.ListadoProductos();
		//enviamos hacia la vista...
		modelo.addAttribute("listado", listado);
		//redireccionamos
		return "redirect:/Vistas/ListadoProductos";	
	}  //fin del metodo eliminar...
	

}   //fin de la clase productocontroller
