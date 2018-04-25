package Clases;

public class Aeropuerto {
	Integer idAeropuerto;
	String nombre;
	Ciudad ciudad;
	String codigo;
	
	
	public Integer getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(Integer idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	public Aeropuerto(Integer idAeropuerto, String nombre, Ciudad ciudad, String codigo) {
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigo = codigo;
	}
	
	public String mostrarAeropuertos() {
		return "Aeropuerto: " + getNombre() + " - " + ciudad.devolverCiudad() + " - " + getCodigo();
	}

}
