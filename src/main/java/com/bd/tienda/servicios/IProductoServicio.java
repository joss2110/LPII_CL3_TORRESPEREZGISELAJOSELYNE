package com.bd.tienda.servicios;

import java.util.List;

import com.bd.tienda.modelo.ClassProducto;

public interface IProductoServicio {
	
	public List<ClassProducto> ListadoProductos();
	public void Registrar(ClassProducto prod );
	public ClassProducto BuscarporId (Integer id);
	public void eliminar(Integer id);
	
	
	
}
