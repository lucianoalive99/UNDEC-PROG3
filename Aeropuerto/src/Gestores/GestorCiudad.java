package Gestores;
import java.util.ArrayList;
import java.util.List;

import Clases.Ciudad;
public class GestorCiudad {

	public List<Ciudad> listaCiudades = new ArrayList<Ciudad>();
	
	public boolean crearCiudad(int pidCiudad, String pNombreCiudad, String pCodigoPostal) {
		for (Ciudad misCiudades : listaCiudades) {
			if(misCiudades.getIdCiudad() == pidCiudad || misCiudades.getCodigoPostal() == pCodigoPostal) {
				Ciudad nuevaCiudad = new Ciudad(pidCiudad,pNombreCiudad,pCodigoPostal);
				listaCiudades.add(nuevaCiudad);
				return true;
		//return nuevaCiudad;
			}
			else {
				return false;
			}
		}
		return false;
	}
	public String mostrarCiudades() {
		for(Ciudad misCiudades : listaCiudades) {
			return misCiudades.getNombre();
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
	
	public Ciudad mostrarTodosLasCiudades() {
		for(Ciudad misCiudades: listaCiudades) {
			Ciudad ciudadImprimir = new Ciudad();
			ciudadImprimir=misCiudades.getNombre();
			return System.out.println(misCiudades.getNombre());
		}
	}
	
	public String 
}
