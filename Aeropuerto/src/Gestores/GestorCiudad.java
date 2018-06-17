package Gestores;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Clases.Ciudad;
public class GestorCiudad {

	public List<Ciudad> listaCiudades = new ArrayList<Ciudad>();
	private int iterador = 0;
	private Iterator iter = listaCiudades.iterator();
	//private ListIterator iteradorlista = listaCiudades.listIterator();
	
	public void crearCiudad(int pidCiudad, String pNombreCiudad, String pCodigoPostal) {
		//
		//listaCiudades.add(nuevaCiudad);
		boolean bandera = false;
		
		if(iterador == 0) {
			Ciudad nuevaCiudad = new Ciudad(pidCiudad,pNombreCiudad,pCodigoPostal);
			listaCiudades.add(nuevaCiudad);
			System.out.println("El avion fue creado exitosamente.");
			iterador++;
		}
		 
		
		//for (Ciudad misCiudades : listaCiudades){
		while(iter.hasNext()) {
			Ciudad misCiudades = (Ciudad)iter.next();
			if(misCiudades.getIdCiudad() == pidCiudad || misCiudades.getCodigoPostal() == pCodigoPostal) {
				bandera = true;
			}
			if (bandera == true) {
				System.out.println("No se puede crear el Avion, ya existe en el sistema");
			}
			else {
				Ciudad nuevaCiudad = new Ciudad(pidCiudad,pNombreCiudad,pCodigoPostal);
				listaCiudades.add(nuevaCiudad);
				System.out.println("El avion fue creado exitosamente.");
			}
		}
		
		/*for (Ciudad misCiudades : listaCiudades) {
			if(misCiudades.getIdCiudad() == pidCiudad || misCiudades.getCodigoPostal() == pCodigoPostal) {
				Ciudad nuevaCiudad2 = new Ciudad(pidCiudad,pNombreCiudad,pCodigoPostal);
				listaCiudades.add(nuevaCiudad2);
				return true;
		//return nuevaCiudad;
			}
			else {
				return false;
			}
		}
		return false;*/
	}
	public String mostrarCiudades() {
		for(Ciudad misCiudades : listaCiudades) {
			System.out.println(misCiudades.getNombre());
			return misCiudades.devolverCiudad();
				
		}
		return "";
	}
	
	public boolean modificarCodigoPostal(String pCodigoPostalViejo, String pCodigoPostalNuevo) {
		for (Ciudad misCiudades : listaCiudades) {
			if(misCiudades.getCodigoPostal() == pCodigoPostalViejo) {
				misCiudades.setCodigoPostal(pCodigoPostalNuevo);
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public boolean modificarnombre(int pIdCiudad, String pNombreNuevo) {
		for (Ciudad misCiudades : listaCiudades) {
			if(misCiudades.getIdCiudad() == pIdCiudad) {
				misCiudades.setNombre(pNombreNuevo);;
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public boolean modificarCodigoPostalYNombre(String pCodigoPostalViejo, String pCodigoPostalNuevo, String pNombreNuevo, int pIdCiudad) {
		for (Ciudad misCiudades : listaCiudades) {
			if(misCiudades.getCodigoPostal() == pCodigoPostalViejo) {
				misCiudades.setCodigoPostal(pCodigoPostalNuevo);
				return true;
			}
			else {
				if(misCiudades.getIdCiudad() == pIdCiudad) {
					misCiudades.setNombre(pNombreNuevo);
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
	
	public boolean borrarCiudadPorCoidgoPostal(String pCodigoPostalViejo) {
		for (Ciudad misCiudades : listaCiudades) {
			if(misCiudades.getCodigoPostal() == pCodigoPostalViejo) {
				return true;
			}
			else {
					return false;
				
			}
		}
		return false;
	
	}
	
	
	
	
	
	//*public String 
}
