/**
 * Escribe un programa que utilice la clase Empleado, creando un vector de objetos de la clase
Empleado y luego lo llene con datos correspondientes a 50 empleados (utilizar una tabla de
nombres para rellenar con un random). Una vez rellenado, visualizar los datos de todos los
empleados
 * @author yszee
 *
 */
import java.util.Random;
public class Main {
	public static String nombresRandom() {
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int tamaño = (int) (Math.random()*(15-5)+5);
		for (int i=0; i<tamaño; i++) {
			int index = random.nextInt(caracteres.length());
			char randomChar = caracteres.charAt(index);
			sb.append(randomChar);
			
			
			
		}
		String nombre = sb.toString();
		return nombre;
	}
	public static void main(String[] args) {
		Empleado[] empleado = new Empleado[50];
		String[] nombres = new String[50];
		int numero = -1;
		
		for (int i = 0; i<nombres.length; i++) {
			nombres[i] = nombresRandom();
		}
		for (int k = 0; k<empleado.length; k++) {
			
			numero++;
			empleado[k] = new Empleado(nombres[k], numero);
		}
		
		for (int j = 0; j<empleado.length; j++) {
			empleado[j].verDatos();
			
			
		}

	}

}
