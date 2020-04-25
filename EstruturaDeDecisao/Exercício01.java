package EstruturaDeDecisao;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String candidato1, candidato2, candidato3, vencedor;
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
		
		//Processamento
		if (votos1 > votos2 && votos1 > votos3) {
			vencedor = candidato1;
		} else if (votos2 > votos1 && votos2 > votos3) {
			vencedor = candidato2;
		} else {
			vencedor = candidato3;
		}
		
		//Saída
		System.out.printf("O vencedor foi o candidato %s.", vencedor);
		teclado.close();

	}

}
