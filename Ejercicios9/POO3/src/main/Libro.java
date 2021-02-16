package main;

public class Libro {
	
    private String titulo;
    private String autor;
    private boolean estado;

    public Libro() {
    	this.titulo = "";
        this.autor = "";
        this.estado = true;  	
    }
    
	public Libro(String titulo, String autor, boolean estado) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
    }
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public String prestado(boolean b) {
		String estado = "Disponible";
		if (!b) {
			estado = "Prestado";
		}
		return estado;
		
	}
	

	@Override
	public String toString() {
		return "Titulo: " + titulo + 
				"\nAutor: " + autor + 
				"\nEstado: " + prestado(estado);
	} 
    
   
   
}