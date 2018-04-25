package clases;

import java.time.LocalDateTime;
import java.util.List;

public class Vuelo {
	String codigoVuelo;
	Aeropuerto salida;
	LocalDateTime fechaHoraSalida;
	Aeropuerto arribo;
	LocalDateTime fechaHoraArribo;
	Aerolinea aerolinea;
	List<Piloto> pilotos;
	Avion avion;
	List<Asignacion> pasajeros;
	
	
	
	public String getCodigoVuelo() {
		return codigoVuelo;
	}
	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}
	public Aeropuerto getSalida() {
		return salida;
	}
	public void setSalida(Aeropuerto salida) {
		this.salida = salida;
	}
	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Aeropuerto getArribo() {
		return arribo;
	}
	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}
	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}
	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public List<Piloto> getPilotos() {
		return pilotos;
	}
	public void setPilotos(List<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public List<Asignacion> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(List<Asignacion> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
	
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, List<Piloto> pilotos, Avion avion,
			List<Asignacion> pasajeros) {
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = pilotos;
		this.avion = avion;
		this.pasajeros = pasajeros;
	}
	
	public String devolverVuelo() {
		return getCodigoVuelo() + " - " + avion.getModelo() + 
				salida.mostrarAeropuertos() + 
				arribo.mostrarAeropuertos();
	}
	
	
}
