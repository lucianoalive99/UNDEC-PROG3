package Clases;

public class Pasajero {


	Integer idPasajero;
	String CUIL;
	String apellido;
	String nombres;
	String telefono;
	
	

	public Integer getIdPasajero() {
		return idPasajero;
	}
	public void setIdPasajero(Integer idPasajero) {
		this.idPasajero = idPasajero;
	}
	public String getCUIL() {
		return CUIL;
	}
	public void setCUIL(String cUIL) {
		CUIL = cUIL;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public Pasajero(Integer idPasajero, String cUIL, String apellido, String nombres, String telefono) {
		super();
		this.idPasajero = idPasajero;
		CUIL = cUIL;
		this.apellido = apellido;
		this.nombres = nombres;
		this.telefono = telefono;
	}
	
	

}
