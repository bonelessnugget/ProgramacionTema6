
public class Coleccion {
	String titulo;
	int numCanciones;
	int precio;
	
	public Coleccion(String titulo, int numCanciones, int precio) {
		this.titulo = titulo;
		this.numCanciones = numCanciones;
		this.precio = precio;
	}
	
	public void verDatos() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Número de canciones: " + numCanciones);
		System.out.println("Presio: " + precio + " lei");
	}
}
