package com.bd.tienda.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.tienda.modelo.ClassProducto;
import com.bd.tienda.repositorios.IProductoRepository;

@Service
public class ClassProductoServicioImp implements IProductoServicio{

	//aplicamos la inyeccion de dependencia...
	@Autowired
	private IProductoRepository iproductorepository;
	
	@Override
	public List<ClassProducto> ListadoProductos() {
		// TODO Auto-generated method stub
		return (List<ClassProducto>) iproductorepository.findAll() ;
	}

	@Override
	public void Registrar(ClassProducto prod) {
		// TODO Auto-generated method stub
		iproductorepository.save(prod);
	}

	@Override
	public ClassProducto BuscarporId(Integer id) {
		// TODO Auto-generated method stub
		return iproductorepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		iproductorepository.deleteById(id);
	}

}
