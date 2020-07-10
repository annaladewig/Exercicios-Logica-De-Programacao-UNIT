package Array;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int [] contaminados = new int [5];
		String [] cidades = new String [5];
		int acumulador = 0;
		double media;
		
		for (int i = 0; i < contaminados.length; i++) {
			System.out.printf("Nome da %dº cidade: \n", i + 1 );
			cidades[i] = teclado.next();
			System.out.printf("Quantidade de contaminados de %s: \n", cidades[i]);
			contaminados[i] = teclado.nextInt();
			
			acumulador = acumulador + contaminados[i];
		}
		
		media = acumulador/ cidades.length;
		System.out.println("--------------------------------------------------");
		System.out.println("Essas foram as cidades que tiveram igual ou mais infectados que a média: ");
			
		for (int i = 0; i < contaminados.length; i++) {
			if (contaminados[i] >= media) {
				System.out.printf("A Cidade de %s com %d contaminados.\n", cidades[i], contaminados[i]);
			}
		}
		teclado.close();		
	}
}
