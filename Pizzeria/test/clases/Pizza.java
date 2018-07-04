package clases;

import java.util.Collection;

public class Pizza {

	private Integer idPizza;
	private String nombre;
	private Base base;
	private Collection<Cubierta> cubierta;
	private double precio;
	
	
	
	
	public Pizza() {
		
	}

	

	public Pizza(Integer idPizza, String nombre, Base base, Collection<Cubierta> cubierta, double precio) {
		this.idPizza = idPizza;
		this.nombre = nombre;
		this.base = base;
		this.cubierta = cubierta;
		this.precio = precio;
	}



	public Pizza(String pNombre, double pPrecio, Base pBase, Collection<Cubierta> pcubiertaNapolitana) {
		Pizza unaPizza = new Pizza();
		unaPizza.setBase(pBase);
		unaPizza.setCubierta(pcubiertaNapolitana);
		unaPizza.setNombre(pNombre);
		unaPizza.setPrecio(pPrecio);
	}



	public Integer getIdPizza() {
		return idPizza;
	}



	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Base getBase() {
		return base;
	}



	public void setBase(Base base) {
		this.base = base;
	}



	public Collection<Cubierta> getCubierta() {
		return cubierta;
	}



	public void setCubierta(Collection<Cubierta> cubierta) {
		this.cubierta = cubierta;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	

}
