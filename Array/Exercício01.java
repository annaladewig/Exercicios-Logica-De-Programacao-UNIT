package Array;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [] infectados = new int[5];
		double acumulador = 0, media = 0.0; 
		
		for (int i = 0; i < infectados.length; i++) {
			System.out.printf("Quantidade de pessoas contaminadas da %dº cidade: ", i + 1);
			infectados[i] = teclado.nextInt();
			acumulador = acumulador + infectados[i]; 
		}
		media = acumulador / infectados.length;
		System.out.printf("Existe uma média de  %.2f infectados nessas %d cidades.", media, infectados.length);
	
		teclado.close();
	}

}
