package clases;

import java.util.List;

public class Avion {
	Integer idAvion;
	String modelo;
	String matricula;
	List<Avion> listaAsiento;
	
	
	public Integer getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(Integer idAvion) {
		this.idAvion = idAvion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public List<Avion> getListaAsiento() {
		return listaAsiento;
	}
	public void setListaAsiento(List<Avion> listaAsiento) {
		this.listaAsiento = listaAsiento;
	}
	
	
	public Avion(Integer idAvion, String modelo, String matricula, List<Avion> listaAsiento) {
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaAsiento = listaAsiento;
	}
	
	
	
}
