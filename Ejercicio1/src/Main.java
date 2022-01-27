/**
 * 
 * @author yszee
 *Se generan 20 números aleatorios de tipo entero y se almacenan en un vector. Hay que calcular
y mostrar la media y, además, mostrar cuántos números hay:
-Superiores a la media
-Inferiores a la media
-Iguales a la media
 */
public class Main {

	public static void main(String[] args) {
		int supMedia = 0;
		int infMedia = 0;
		int eqMedia = 0;
		int media = 0;
		int suma = 0;
		int num = 0;
		int[] vector = new int[20];
		for (int i = 0; i<vector.length; i++) {
	
			System.out.print(" " + vector[i]);
			suma += vector[i];
			if (vector[i] > media) {
				supMedia++;
			}
			if(vector[i] < media) {
				infMedia++;
			}
			if(vector[i] == media) {
				eqMedia++;
			}
		}
		media = suma /20;

		System.out.println(" ");
	System.out.println("La media es: " + media);
	System.out.println("Hay " + supMedia + " números superiores a la media.");
	System.out.println("Hay " + infMedia + " números inferiores a la media.");
	System.out.println("Hay " + eqMedia + " números iguales a la media.");
	}

}
