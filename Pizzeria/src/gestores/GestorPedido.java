package gestores;


import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

import clases.Pedido;
import clases.Pizza;

public class GestorPedido {

	private LinkedList<Pedido> listaPedidos = new LinkedList<Pedido>();
	private int iterador=0;
	private boolean bandera = false;
	
	
	public GestorPedido() {
	}

	public GestorPedido(LinkedList<Pedido> linkedList) {
		
	}

	public void Pedido(String pNombre, String pDomicilio, double pImporte, LocalDate pFecha, Pizza pPizzaNapolitana) {
		Pedido nuevoPedido = new Pedido();
		nuevoPedido.setDomicilio(pDomicilio);
		nuevoPedido.setFechaEntrega(pFecha);
		nuevoPedido.setImporte(pImporte);
		nuevoPedido.setNombre(pNombre);
		nuevoPedido.setPizzas(pizzas);
	}
	public boolean crearPedido(Pedido factoryPedido) {
		
		if(iterador == 0) {
			listaPedidos.add(factoryPedido);
			return true;
			
		}
		else
		{
		 
			
			for (Pedido pedido : listaPedidos){
				
				if(pedido.getIdPedido() == factoryPedido.getIdPedido()) {
					bandera = true;
				}
			}
			if (bandera == true) {
				bandera = false;
				return false;
				
			}
			else {
					
					listaPedidos.add(factoryPedido);
					return true;
				}
					
				
			}
		}

	public Collection<Pedido> getColeccionPedidos() {
		
		return listaPedidos;
	}
		
		
	

	


}
