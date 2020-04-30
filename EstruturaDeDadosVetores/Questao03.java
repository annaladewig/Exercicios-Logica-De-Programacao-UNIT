package EstruturaDeDadosVetores;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float [] temperatura = {2f, -1f, 0f, -2f, 1f, 3f, -1f};
		float maisAlta = 0;
		
		for(int i = 0; i < temperatura.length; i++) {
			if (i == 0) {
				maisAlta = temperatura[i];
			}
			if (temperatura[i] > maisAlta) {
				maisAlta = temperatura[i];
			}
		}
		System.out.printf("A temperatura mais alta digitada foi de %.1f°C.", maisAlta);
		teclado.close();
	}
}
