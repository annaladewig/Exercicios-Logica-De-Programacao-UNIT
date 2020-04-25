package EstruturaDeDecisao;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String candidato1, candidato2, candidato3;
		int votos1, votos2, votos3;
		
		//Entradas
		System.out.println("Qual o nome do 1º candidato? ");
		candidato1 = teclado.next();
		System.out.println("Qual a quantidade de votos do 1º candidato? ");
		votos1 = teclado.nextInt();
		
		System.out.println("Qual o nome do 2º candidato? ");
		candidato2 = teclado.next();
		System.out.println("Qual a quantidade de votos do 2º candidato? ");
		votos2 = teclado.nextInt();
		
		System.out.println("Qual o nome do 3º candidato? ");
		candidato3 = teclado.next();
		System.out.println("Qual a quantidade de votos do 3º candidato? ");
		votos3 = teclado.nextInt();
		
		//Processamento e Saída
		if (votos1 > votos2 + votos3 || votos2 > votos1 + votos3 || votos3 > votos1 + votos2) {
			System.out.printf("Não haverá segundo turno.");
		} else {
			System.out.println("Haverá segundo turno.");
		}
		teclado.close();

	}

}
