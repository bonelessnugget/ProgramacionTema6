/**
 * Escribir una clase Conjunto que gestione un conjunto de enteros (int) con ayuda de una tabla de
tama�o fijo (100) (un conjunto contiene una lista no ordenada de elementos y se caracteriza
por el hecho de que cada elemento es �nico: no se debe encontrar dos veces el mismo valor en
la tabla). Las operaciones a implementar (m�todos de la clase) son las siguientes:
 vaciar: vac�a el conjunto.
 agregar: a�ade un entero al conjunto
 eliminar: retira un entero del conjunto (habr� que desplazar elementos).
 copiar: recopila un conjunto en otro
 esMiembro: devuelve verdadero si existe en el conjunto un entero dado, o falso si no
existe.
 posicion: reenv�a la posici�n en el conjunto de un entero dado, o el valor -1 si no existe.
 esIgual: devuelve true si un conjunto es igual a otro, teniendo en cuenta que dos
conjuntos son iguales si tienen los mismos elementos y en el mismo orden
 imprimir: realiza la visualizaci�n del conjunto.1
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
