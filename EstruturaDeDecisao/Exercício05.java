package EstruturaDeDecisao;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		final int p1 = 4;
		final int p2 = 6;
		
		//Entradas
		System.out.print("Digite a 1º nota: ");
		nota1 = teclado.nextDouble();
		System.out.print("Digite a 2º nota: ");
		nota2 = teclado.nextDouble();
		System.out.print("Digite a 3º nota: ");
		nota3 = teclado.nextDouble();
		
		//Processamento
		
		//Isolamos a menor nota para descobrir as maiores.
		if (nota1 < nota2 && nota1 < nota3) { //As maiores notas são a 2 e 3.
			
			if (nota2 > nota3) { 
				media = (nota2 * p1 + nota3 * p2)/10; 
			} else {
				media = (nota3 * p1 + nota2 * p2)/10;
			}
			
		} else if (nota2 < nota1 && nota2 < nota3) { //As maiores notas são a 1 e 3.
			
			if (nota1 > nota3) {
				media = (nota1 * p1 + nota3 * p2)/10;
			} else {
				media = (nota3 * p1 + nota1 * p2)/10;
			}
			
		} else { // As maiores notas são a 1 e 2.
			
			if(nota1 > nota2) {
				media = (nota1 * p1 + nota2 * p2)/10;
			} else {
				media = (nota2 * p1 + nota1 * p2)/10;
			}
		}
		//Saída
		
		System.out.printf("A média do aluno é %.2f", media);
		teclado.close();

	}

}
