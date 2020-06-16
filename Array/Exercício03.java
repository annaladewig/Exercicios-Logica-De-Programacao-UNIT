package Array;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [] infectados = new int[5];
		double acumulador = 0, media = 0.0; 
		int contador = 0, total = 0;
		
		for (int i = 0; i < infectados.length; i++) {
			System.out.printf("Quantidade de pessoas contaminadas da %d� cidade: ", i + 1);
			infectados[i] = teclado.nextInt();
			acumulador = acumulador + infectados[i]; 
		}
		
		media = acumulador / infectados.length;
		
		for (int i = 0; i < infectados.length; i++) {
			
			if(infectados[i] >= media) {
			contador++;
			total = total + infectados[i];
			}
			
		}
		
		System.out.printf("Existe uma m�dia de  %.2f infectados nessas %d cidades.\n", media, infectados.length);
		System.out.printf("Existem %d cidades com a quantidade de pessoas infectadas igual ao acima da m�dia.\n", contador);
		System.out.printf("Houve um total de %d pessoas contaminadas que foram iguais ou superiores a m�dia geral de pessoas contaminadas.", total);
		teclado.close();
	}

}
