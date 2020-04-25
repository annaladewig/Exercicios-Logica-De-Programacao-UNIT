package EstruturaDeDecisao;

import java.util.Scanner;

public class Exercício04 {

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
		if (nota1 < nota2 && nota1 < nota3) { //Isolamos a menor nota para descobrir as maiores.
			
			media = (nota2 * p1 + nota3 * p2)/10; 
			
		} else if (nota2 < nota1 && nota2 < nota3) {
			
			media = (nota1 * p1 + nota3 * p2)/10;
			
		} else {
			
			media = (nota1 * p1 + nota2 * p2)/10;
			
		}
		//Saída
		
		System.out.printf("A média do aluno é %.2f", media);
		teclado.close();

	}

}
