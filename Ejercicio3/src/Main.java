/**
 * Leer un vector de 10 componentes enteros; calcular el mayor, el menor y los lugares donde se
encuentran.
 * @author yszee
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] vector = new int[] {1,2,3,4,5,6,7,8,9,10};
		int valorMax = vector[0];
		int valorMin = vector[0];
		int posMax = 0;
		int posMin = 0;
		for (int i = 0; i<vector.length; i++) {
			if(vector[i] > valorMax) {
				valorMax = vector[i];
			}
			if (vector[i] < valorMin) {
				valorMin = vector[i];
			}

			
		}
		posMax = valorMax -1;
		posMin = valorMin -1;
		System.out.println("valorMax " + valorMax);
		System.out.println("posMax " + posMax);
		System.out.println("valorMin " + valorMin);
		System.out.println("posMin " + posMin);
	}

}
