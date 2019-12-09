package coleccion_banco;

public class Libro {
	
	private String titulo;
	private String autor;
	private int isbn;
	
	public Libro(String titulo, String autor, int ISBN) {
		this.titulo= titulo;
		this.autor = autor;
		this.isbn = ISBN;
	}
	
	public String getDatos() {
		return "Titulo:"+ titulo+" "+"Autor:" +autor+" "+"ISBN:"+ isbn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}
	
	/*public boolean equals(Object obj) {
		
		if(obj instanceof Libro) {
			
			Libro otro= (Libro)obj;
			
			if (this.isbn == otro.isbn) {
				
				return true;
				
			}else {
				
				return false;
			}
		}else {
			return false;
		}
	}*/
	
	
}


