package modelo;

public class Productos {
	
	private String n_articulo;
	private String seccion;
	private String precio;
	private String pais_origen;
	
	public Productos() {
		
		n_articulo = "";
		seccion = "";
		precio="";
		pais_origen="";
		
	}
	
	public String getN_articulo() {
		return n_articulo;
	}
	public void setN_articulo(String n_articulo) {
		this.n_articulo = n_articulo;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getPais_origen() {
		return pais_origen;
	}
	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}

	
	
}
