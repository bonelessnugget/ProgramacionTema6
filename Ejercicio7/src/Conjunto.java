/**
 * Escribir una clase Conjunto que gestione un conjunto de enteros (int) con ayuda de una tabla de
tamaño fijo (100) (un conjunto contiene una lista no ordenada de elementos y se caracteriza
por el hecho de que cada elemento es único: no se debe encontrar dos veces el mismo valor en
la tabla). Las operaciones a implementar (métodos de la clase) son las siguientes:
 vaciar: vacía el conjunto.
 agregar: añade un entero al conjunto
 eliminar: retira un entero del conjunto (habrá que desplazar elementos).
 copiar: recopila un conjunto en otro
 esMiembro: devuelve verdadero si existe en el conjunto un entero dado, o falso si no
existe.
 posicion: reenvía la posición en el conjunto de un entero dado, o el valor -1 si no existe.
 esIgual: devuelve true si un conjunto es igual a otro, teniendo en cuenta que dos
conjuntos son iguales si tienen los mismos elementos y en el mismo orden
 imprimir: realiza la visualización del conjunto.1
 * @author yszee
 *
 */
public class Conjunto {

	public static void main(String[] args) {
		int[] conjunto = new int[100];
		int numero;
		for (int i = 0; i<conjunto.length; i++) {
			numero = (int ) (Math.random() * (100-1)+1);
			conjunto[i] = numero;
			for (int k = 0; k<conjunto.length; k++) {
				
			}
					System.out.println(numero);
		}
	}
}
