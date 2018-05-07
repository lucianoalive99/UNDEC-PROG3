package Clases;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
	
	public long duracionDeVueloHoras() {
		
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		 
        //Date fechaInicial=dateFormat.parse("2016-02-14 10:00:00");
       // Date fechaFinal=dateFormat.parse("2016-02-15 11:10:10");
 
       /* int diferencia=(int) ((fechaHoraArribo.)-fechaHoraSalida.getTime())/1000);
 
        int dias=0;
        int horas=0;
        int minutos=0;
        if(diferencia>86400) {
            dias=(int)Math.floor(diferencia/86400);
            diferencia=diferencia-(dias*86400);
        }
        if(diferencia>3600) {
            horas=(int)Math.floor(diferencia/3600);
            diferencia=diferencia-(horas*3600);
        }
        if(diferencia>60) {
            minutos=(int)Math.floor(diferencia/60);
            diferencia=diferencia-(minutos*60);
        }
        System.out.println("Hay "+dias+" dias, "+horas+" horas, "+minutos+" minutos y "+diferencia+" segundos de diferencia");*/
		
		/*LocalTime startLocalTime = LocalTime.of(fechaHoraSalida.getHour(),fechaHoraSalida.getMinute());
        LocalTime endLocalTime = startLocalTime.plus((Duration.ofHours(fechaHoraArribo.getHour() + Duration.ofMinutes(fechaHoraArribo.getMinute()))));  // 11:30
 
        long diffSeconds = Duration.between(startLocalTime, endLocalTime).get();
        return diffSeconds; // 10800 seconds*/
    
		LocalDateTime d1 = LocalDateTime.of(fechaHoraSalida.getYear(), fechaHoraSalida.getMonth(), fechaHoraSalida.getDayOfMonth(), fechaHoraSalida.getHour(), fechaHoraSalida.getMinute());
		LocalDateTime d2 = LocalDateTime.of(fechaHoraArribo.getYear(), fechaHoraArribo.getMonth(), fechaHoraArribo.getDayOfMonth(), fechaHoraArribo.getHour(), fechaHoraArribo.getMinute());

		long horas = ChronoUnit.HOURS.between(d1, d2);
		//long minutos = ChronoUnit.MINUTES.between(d1, d2);
		return horas;
	}
	
	public String duracionDeVueloMinutos() {
		
		String formato = "%02dh:%02dm";
		LocalDateTime d1 = LocalDateTime.of(fechaHoraSalida.getYear(), fechaHoraSalida.getMonth(), fechaHoraSalida.getDayOfMonth(), fechaHoraSalida.getHour(), fechaHoraSalida.getMinute());
		LocalDateTime d2 = LocalDateTime.of(fechaHoraArribo.getYear(), fechaHoraArribo.getMonth(), fechaHoraArribo.getDayOfMonth(), fechaHoraArribo.getHour(), fechaHoraArribo.getMinute());

		//long horas = ChronoUnit.HOURS.between(d1, d2);
		long minutos = ChronoUnit.MINUTES.between(d1, d2);
		
		long horasReales = TimeUnit.MINUTES.toHours(minutos);
	    long minutosReales = TimeUnit.MINUTES.toMinutes(minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours(minutos));
	    return String.format(formato, horasReales, minutosReales);
	}
	
	/*public String formatearMinutosAHoraMinuto(int minutos) {
	    String formato = "%02d:%02d";
	    long horasReales = TimeUnit.MINUTES.toHours(minutos);
	    long minutosReales = TimeUnit.MINUTES.toMinutes(minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours(minutos));
	    return String.format(formato, horasReales, minutosReales);
	}*/
	
	public String devolverVuelo() {
		
		return getCodigoVuelo() + " - " + avion.getModelo() + 
				" - " + fechaHoraSalida.getDayOfMonth() + 
				" de " + fechaHoraSalida.getMonth() + 
				" " + fechaHoraSalida.getHour() +
				":" + fechaHoraSalida.getMinute() + 
				" " + salida.mostrarCodigoAeropuerto() +
				" (" + salida.ciudad.devolverCiudad() + " - " + salida.mostrarNombreAeropuerto() + ") " + 
				" - " + fechaHoraArribo.getDayOfMonth() + 
				" de " + fechaHoraArribo.getMonth() + 
				" " + fechaHoraArribo.getHour() +
				":" + fechaHoraArribo.getMinute() + 
				" " + arribo.mostrarCodigoAeropuerto() +
				" (" + arribo.ciudad.devolverCiudad() + " - " + arribo.mostrarNombreAeropuerto() + ") " +
				" - Operado por " + aerolinea.devolverAerolinea()  +
				" Duración " + duracionDeVueloMinutos();
		
	}
	
	
}
