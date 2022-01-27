/**
 * Generar dos vectores de dimensión 10 (dar valores aleatorios entre 1 y 5) y comprobar para
cada uno de los elementos del primer vector cuántas veces está en el segundo, es decir
primero: 3,7,2
segundo: 3,3,5
el resultado debe ser:
elemento 1 (3): 2 veces
elemento 2 (7): 0 veces
elemento 3 (2): 0 veces
 * @author yszee
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] vector1 = new int[10];
		int[] vector2 = new int[10];
		boolean uno = false;
		int el1 = 0;
		boolean dos = false;
		int el2 = 0;
		boolean tres = false;
		int el3 = 0;
		boolean cuatro = false;
		int el4 = 0;
		boolean cinco = false;
		int el5 = 0;
		for (int i = 0; i<vector1.length; i++) {
			vector1[i] = (int)(Math.random()*(5-1)+1);
			System.out.print(" " + vector1[i]);
			if (vector1[i] == 1) {
				uno = true;
			}
			if(vector1[i] == 2) {
				dos = true;
			}
			if (vector1[i] == 3) {
				tres = true;
			}
			if (vector1[i] == 4) {
				cuatro = true;
			}
			if (vector1[i] == 5) {
				cuatro = true;
			}
			vector2[i] = (int)(Math.random()*(5-1)+1);
			System.out.print(" " + vector2[i]);
			if (uno == true && vector2[i] == 1) {
				el1++;
			}
			if(dos == true && vector2[i] == 2) {
				el2++;
			}
			if (tres == true && vector2[i] == 3) {
				el3++;
			}
			if (cuatro == true && vector2[i] == 4) {
				el4++;
			}
			if (cinco == true && vector2[i] == 5) {
				el5++;
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("1 se repite " + el1);
		System.out.println("2 se repite " + el2);
		System.out.println("3 se repite " + el3);
		System.out.println("4 se repite " + el4);
		System.out.println("5 se repite " + el5);
		}
	}

