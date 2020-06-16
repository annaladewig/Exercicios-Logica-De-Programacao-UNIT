package Array;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [] infectados = new int[5];
		double acumulador = 0, media = 0.0; 
		int contador = 0;
		
		for (int i = 0; i < infectados.length; i++) {
			System.out.printf("Quantidade de pessoas contaminadas da %dº cidade: ", i + 1);
			infectados[i] = teclado.nextInt();
			acumulador = acumulador + infectados[i]; 
		}
		
		media = acumulador / infectados.length;
		
		for (int i = 0; i < infectados.length; i++) {
			
			if(infectados[i] >= media) {
			contador++;
			}
		}
		
		System.out.printf("Existe uma média de  %.2f infectados nessas %d cidades.\n", media, infectados.length);
		System.out.printf("Existem %d cidades com a quantidade de pessoas infectadas igual ao acima da média.", contador);
		teclado.close();

	}

	}