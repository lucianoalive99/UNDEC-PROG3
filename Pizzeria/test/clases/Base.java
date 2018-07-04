package clases;

public class Base {

	private Integer idBase;
	private String nombre;
	
	
	public Base() {
		// TODO Apéndice de constructor generado automáticamente
	}


	public Base(Integer idBase, String nombre) {
		this.idBase = idBase;
		this.nombre = nombre;
	}


	public Base(String tipoBase) {
		
	}


	public Integer getIdBase() {
		return idBase;
	}


	public void setIdBase(Integer idBase) {
		this.idBase = idBase;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
