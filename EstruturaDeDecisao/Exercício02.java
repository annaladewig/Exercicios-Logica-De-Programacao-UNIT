package EstruturaDeDecisao;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String candidato1, candidato2, candidato3;
		int votos1, votos2, votos3;
		
		//Entradas
		System.out.println("Qual o nome do 1� candidato? ");
		candidato1 = teclado.next();
		System.out.println("Qual a quantidade de votos do 1� candidato? ");
		votos1 = teclado.nextInt();
		
		System.out.println("Qual o nome do 2� candidato? ");
		candidato2 = teclado.next();
		System.out.println("Qual a quantidade de votos do 2� candidato? ");
		votos2 = teclado.nextInt();
		
		System.out.println("Qual o nome do 3� candidato? ");
		candidato3 = teclado.next();
		System.out.println("Qual a quantidade de votos do 3� candidato? ");
		votos3 = teclado.nextInt();
		
		//Processamento e Sa�da
		if (votos1 > votos2 + votos3 || votos2 > votos1 + votos3 || votos3 > votos1 + votos2) {
			System.out.printf("N�o haver� segundo turno.");
		} else {
			System.out.println("Haver� segundo turno.");
		}
		teclado.close();

	}

}
