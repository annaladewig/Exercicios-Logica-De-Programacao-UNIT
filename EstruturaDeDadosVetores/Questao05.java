package EstruturaDeDadosVetores;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float [] temperatura = {26f, 28.5f, 23f, 27.5f, 23f, 24f, 26.5f};
		float acumulador = 0, mediaTemp = 0, acimaMedia = 0;
		int qtdAcimaMedia = 0;
		
		for(int i = 0; i < temperatura.length; i++) {
			 acumulador += temperatura[i];
		}
		
		mediaTemp = acumulador/temperatura.length;
		System.out.printf("A média das temperaturas é de %.1f°C.\n", mediaTemp);
		
		System.out.print("As temperaturas acima da média foram: ");
		
		for (int i = 0; i < temperatura.length; i++) {
			if(temperatura[i] > mediaTemp) {
				System.out.printf(" %.1f°C", temperatura[i]);
				qtdAcimaMedia++;
				
				if(i == (temperatura.length - 1)) {
					System.out.print(".\n");
				} else {
					System.out.print(", ");
				}
			}			
		}
		System.out.printf("A quantidade de temperaturas acima da média foi de %d.", qtdAcimaMedia);
		
		teclado.close();
	}

}
