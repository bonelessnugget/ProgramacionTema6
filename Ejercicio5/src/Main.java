import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		boolean funcionando = true;
		int op;
		int op2;
		int indice = 0;
		Scanner teclado = new Scanner(System.in);
		Coleccion[] discos = new Coleccion[100];
		do {
			System.out.println("1. Crear discos.");
			System.out.println("2. Ver discos.");
			System.out.println("3. Salir.");
			op = teclado.nextInt();
			switch (op) {
			case 1: {
				System.out.println("Cuántos discos quieres crear: ");
				op2 = teclado.nextInt();
				for (int i = 0; i<op2; i++) {
					System.out.println("Introduce el titulo del disco: ");
					String titulo = teclado.next();
					System.out.println("Introduce el numero de canciones: ");
					int numCanciones = teclado.nextInt();
					System.out.println("Introduce el presio: ");
					int precio = teclado.nextInt();
					discos[i] = new Coleccion(titulo, numCanciones, precio);
					indice++;
				}
				break;
			}
			case 2: {
				for (int k = 0; k<indice; k++) {
					discos[k].verDatos();
					
					
				}
				System.out.println("Tienes " + indice);
				break;
			}
			case 3:{
				funcionando = false;
			}
			}
		}while (funcionando == true);
	}

}
