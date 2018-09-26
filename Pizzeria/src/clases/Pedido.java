package clases;

import java.time.LocalDate;
import java.util.Collection;

public class Pedido {

	
	private Integer idPedido;
	private String nombre;
	private String domicilio;
	private double importe;
	private LocalDate fechaEntrega;
	private Collection<Pizza> pizzas;
	
	public Pedido() {
		
	}

	public Pedido(Integer idPedido, String nombre, String domicilio, double importe, LocalDate fechaEntrega,
			Collection<Pizza> pizzas) {
		this.idPedido = idPedido;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.importe = importe;
		this.fechaEntrega = fechaEntrega;
		this.pizzas = pizzas;
	}


	public Pedido(String pNombre, String pDomicilio, double pImporte, LocalDate pFecha, Pizza pPizzaNapolitana) {
		
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Collection<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(Collection<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	

	public void agregarPizza(Pizza pizzaFugazzeta) {
		
		
	
	}

	public double importeTotal(double pImporte) {
		importe+=pImporte;
		return importe;
	}

	public String getBase() {
		
		return "Masa Tipo";
	}

	

	
	
	
}

	


	
