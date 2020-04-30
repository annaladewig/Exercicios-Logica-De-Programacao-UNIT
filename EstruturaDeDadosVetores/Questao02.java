package EstruturaDeDadosVetores;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float [] temperatura = {26f, 28.5f, 23.5f, 27f, 23.5f, 25f, 26.5f};
		float menorTemp = 0;
		
		for (int i = 0; i < temperatura.length; i++) {
			if (i==0) {
				menorTemp = temperatura[i];
			}
			if (temperatura[i] < menorTemp) {
				menorTemp = temperatura[i];
			}
		}
		System.out.printf("A menor temperatura foi a de %.1f°C.", menorTemp);
		teclado.close();	
	}
}
