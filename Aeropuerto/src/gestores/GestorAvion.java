package gestores;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Collections;

import clases.Asiento;
import clases.Avion;
import clases.Ciudad;
import clases.Vuelo;

public class GestorAvion {

	private LinkedList<Avion> listaAviones = new LinkedList<Avion>();	
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
			return true;
			
		}
		else
		{
		 
			for (Avion aviones : listaAviones){
				
				if(aviones.getIdAvion() == pAvion.getIdAvion() || aviones.getMatricula() == pAvion.getMatricula()) {
					bandera = true;
				}
			}
			if (bandera == true) {
				bandera = false;
				return false;
				
			}
			else {
					
				if(pAvion.getListaAsiento().isEmpty()) {
					return false;
						
				}
				else {
					listaAviones.add(pAvion);
					return true;
				}
					
				
			}
		}
		
	}

	public LinkedList<Avion> getColeccionAviones() {
		return listaAviones;
	}

	public int horasVueloAvion(Collection<Vuelo> crearVuelos, Avion avion1) {
		
		for (Vuelo vuelos : crearVuelos) {
			if (vuelos.getAvion().getMatricula() == avion1.getMatricula()) {
				String formato = "%02dh:%02dm";
				LocalDateTime d1 = LocalDateTime.of(vuelos.getFechaHoraSalida().getYear(), vuelos.getFechaHoraSalida().getMonth(), vuelos.getFechaHoraSalida().getDayOfMonth(), vuelos.getFechaHoraSalida().getHour(), vuelos.getFechaHoraSalida().getMinute());
				LocalDateTime d2 = LocalDateTime.of(vuelos.getFechaHoraArribo().getYear(), vuelos.getFechaHoraArribo().getMonth(), vuelos.getFechaHoraArribo().getDayOfMonth(), vuelos.getFechaHoraArribo().getHour(), vuelos.getFechaHoraArribo().getMinute());
		
				//long horas = ChronoUnit.HOURS.between(d1, d2);
				long minutos = ChronoUnit.MINUTES.between(d1, d2);
				
				long horasReales = TimeUnit.MINUTES.toHours(minutos);
			    long minutosReales = TimeUnit.MINUTES.toMinutes(minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours(minutos));
			    avion1.acumularhorasdevuelo(horasReales*60);
			    avion1.acumularhorasdevuelo(minutosReales);
			}
		}
		
		return avion1.devolverHoraDeVuelo();
	}
		
	
}
