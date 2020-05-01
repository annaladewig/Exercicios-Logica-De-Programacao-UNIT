package EstruturaDeDadosVetores;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float [] temperatura = {2f, -1f, 0f, -2f, 1f, 3f, -1f};
		float maisAlta = 0;
		float maisBaixa = 0;
		
		for(int i = 0; i < temperatura.length; i++) {
			if (i == 0) {
				maisAlta = temperatura[i];
				maisBaixa = temperatura[i];
			}
			if (temperatura[i] > maisAlta) {
				maisAlta = temperatura[i];
			}
			if (temperatura[i] < maisBaixa) {
				maisBaixa = temperatura[i];
			}
		}
		System.out.printf("A temperatura MAIS ALTA digitada foi de %.1f°C.\n", maisAlta);
		System.out.printf("A temperatura MAIS BAIXA digitada foi de %.1f°C.", maisBaixa);
		teclado.close();
	}
}
