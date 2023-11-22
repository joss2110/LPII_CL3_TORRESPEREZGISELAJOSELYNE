package com.bd.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tbl_productocl3")
public class ClassProducto {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductocl3;
	private String nombrecl3;
	private double precioventacl3;
	private double preciocompracl3;
	private String estadocl3;
	private String descripcl3;
	
	
	public ClassProducto(int idproductocl3, String nombrecl3, double precioventacl3, double preciocompracl3,
			String estadocl3, String descripcl3) {
		//super();
		this.idproductocl3 = idproductocl3;
		this.nombrecl3 = nombrecl3;
		this.precioventacl3 = precioventacl3;
		this.preciocompracl3 = preciocompracl3;
		this.estadocl3 = estadocl3;
		this.descripcl3 = descripcl3;
	}
	public ClassProducto() {
		//super();
	}
	public int getIdproductocl3() {
		return idproductocl3;
	}
	public void setIdproductocl3(int idproductocl3) {
		this.idproductocl3 = idproductocl3;
	}
	public String getNombrecl3() {
		return nombrecl3;
	}
	public void setNombrecl3(String nombrecl3) {
		this.nombrecl3 = nombrecl3;
	}
	public double getPrecioventacl3() {
		return precioventacl3;
	}
	public void setPrecioventacl3(double precioventacl3) {
		this.precioventacl3 = precioventacl3;
	}
	public double getPreciocompracl3() {
		return preciocompracl3;
	}
	public void setPreciocompracl3(double preciocompracl3) {
		this.preciocompracl3 = preciocompracl3;
	}
	public String getEstadocl3() {
		return estadocl3;
	}
	public void setEstadocl3(String estadocl3) {
		this.estadocl3 = estadocl3;
	}
	public String getDescripcl3() {
		return descripcl3;
	}
	public void setDescripcl3(String descripcl3) {
		this.descripcl3 = descripcl3;
	}
	@Override
	public String toString() {
		return "ClassProducto [idproductocl3=" + idproductocl3 + ", nombrecl3=" + nombrecl3 + ", precioventacl3="
				+ precioventacl3 + ", preciocompracl3=" + preciocompracl3 + ", estadocl3=" + estadocl3 + ", descripcl3="
				+ descripcl3 + "]";
	}
	
	
	
	
	
}
