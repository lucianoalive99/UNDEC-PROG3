package Clases;

public class Asignacion {
	Pasajero pasajero;
	Asiento	asiento;
	String codigoAsignacion;
	
	
	
	public Pasajero getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	public Asiento getAsiento() {
		return asiento;
	}
	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}
	public String getCodigoAsignacion() {
		return codigoAsignacion;
	}
	public void setCodigoAsignacion(String codigoAsignacion) {
		this.codigoAsignacion = codigoAsignacion;
	}
	
	
	public Asignacion(Pasajero pasajero, Asiento asiento, String codigoAsignacion) {
		super();
		this.pasajero = pasajero;
		this.asiento = asiento;
		this.codigoAsignacion = codigoAsignacion;
	}
	

}
