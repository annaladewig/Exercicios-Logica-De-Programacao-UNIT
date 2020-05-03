package ListaExerciciosRevisao1;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	
		double valorDiario, valorBanco, valorFundoCaixa;
		
		System.out.print("Qual o valor total arrecadado no dia de hoje? R$ ");
		valorDiario = teclado.nextDouble();
		
		valorBanco = Math.floor(valorDiario / 3);
		valorFundoCaixa = (valorDiario % 3);
		
		System.out.printf("O valor depositado em cada banco é de R$ %f.\n", valorBanco);
		System.out.printf("O valor do fundo do caixa é de R$ %f.", valorFundoCaixa);
		teclado.close();
		
		
	}

}
