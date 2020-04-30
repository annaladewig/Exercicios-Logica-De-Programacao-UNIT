package EstruturaDeDadosVetores;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//float [] temperatura = {26f, 28.5f, 23.5f, 27f, 23.5f, 25f, 26.5f};
		
		float maisAlta = 0;
		float [] temperatura = new float[7];
		
		while (true) {		
			for(int i = 0; i < temperatura.length; i++) {
				System.out.printf("Digite a %dº temperatura: \n", i+1);
				temperatura[i] = teclado.nextFloat();
				
				if(temperatura[i] < 0) {
					System.out.println("Por favor, digite apenas temperaturas positivas.");
					i--;
					continue;
				} 
			} 
			break;
		}
		
		for(int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] > maisAlta) {
				maisAlta = temperatura[i];
			}
		}
		System.out.printf("A temperatura mais alta digitada foi de %.1f°C.", maisAlta);
		teclado.close();
	}

}
