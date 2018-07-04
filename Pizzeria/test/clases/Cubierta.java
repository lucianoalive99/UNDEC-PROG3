package clases;

public class Cubierta {

	
	private Integer idCubierta;
	private String nombre;
	
	
	public Cubierta() {
		
	}


	public Cubierta(Integer idCubierta, String nombre) {
		this.idCubierta = idCubierta;
		this.nombre = nombre;
	}


	public Cubierta(String pNombreCubierta) {
		Cubierta nuevaCubierta= new Cubierta();
		nuevaCubierta.setNombre(pNombreCubierta);
	}


	public Integer getIdCubierta() {
		return idCubierta;
	}


	public void setIdCubierta(Integer idCubierta) {
		this.idCubierta = idCubierta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
