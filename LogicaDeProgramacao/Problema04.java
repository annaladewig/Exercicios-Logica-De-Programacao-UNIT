package LogicaDeProgramacao;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {
		
			Scanner teclado = new Scanner(System.in);
			
			//Variáveis
			int numInicial, numFinal;
			int qtdPassageiros;
			double totValor;
			final double valorPassagem = 4.5;
			final int limite = 999;
			
			//Entradas
			System.out.println("Qual o número incial da catraca? ");
			numInicial = teclado.nextInt();
			System.out.println("Qual o número final da catraca? ");
			numFinal = teclado.nextInt();
			
			//Processamento
			if (numInicial > numFinal) {
				qtdPassageiros = limite - numInicial + numFinal;
			} else {
				qtdPassageiros = numFinal - numInicial;
			}
			totValor = qtdPassageiros * valorPassagem;
			
			//Saída
			System.out.printf("A quantidade total foi de %d passageiros.", qtdPassageiros);
			System.out.println("");
			System.out.printf("O valor total arrecadado foi de R$ %.2f.", totValor);

	}

}
