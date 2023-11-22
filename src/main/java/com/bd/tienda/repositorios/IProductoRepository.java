package com.bd.tienda.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.bd.tienda.modelo.ClassProducto;

public interface IProductoRepository extends CrudRepository<ClassProducto,Integer>{
	
}
