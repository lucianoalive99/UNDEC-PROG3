package gestores;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

import clases.Asiento;
import clases.Avion;
import clases.Ciudad;

public class GestorAvion {

	private List<Avion> listaAviones = new ArrayList<Avion>();	
	private int iterador = 0;
	private boolean bandera = false;
	

	public GestorAvion(LinkedList<Avion> linkedList) {
		linkedList.addAll(listaAviones);
	}

	public void GestorAvion() {
		
	}
	
	public boolean crearAvion(Avion pAvion) {
		//Avion nuevoavion = new Avion(pidAvion,pModelo, pMatricula, pListaAsiento);
		if(iterador == 0) {
			listaAviones.add(pAvion);
			System.out.println("El Avion fue creado exitosamente.");
			iterador++;
			
		}
		else
		{
		 
			for (Avion aviones : listaAviones){
				
				if(aviones.getIdAvion() == pAvion.getIdAvion() || aviones.getMatricula() == pAvion.getMatricula()) {
					bandera = true;
				}
			}
			if (bandera == true) {
				System.out.println("No se puede crear el avion, ya existe en el sistema");
				bandera = false;
				
			}
			else {
					
				if(pAvion.getListaAsiento().isEmpty()) {
					System.out.println("No se puede crear el avion, la lista de asientos esta vacia,");
					bandera = false;
						
				}
				else {
					listaAviones.add(pAvion);
					System.out.println("El Avion fue creado exitosamente.");
					bandera = false;
				}
					
				
			}
		}
		
	}

	public LinkedList<Avion> getColeccionAviones() {
		
	}
		
	
}
