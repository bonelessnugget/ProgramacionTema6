/**
 * Escribe un programa que utilice la clase Empleado, creando un vector de objetos de la clase
Empleado y luego lo llene con datos correspondientes a 50 empleados (utilizar una tabla de
nombres para rellenar con un random). Una vez rellenado, visualizar los datos de todos los
empleados
 * @author yszee
 *
 */
public class Empleado {
	
	private String nombre;
	private int numero = 0;
	
	public Empleado(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
	
	public void verDatos() {
		System.out.println("Nombre: " + "lil "+ nombre + " | " + "Numero: " + numero);
	}
}
