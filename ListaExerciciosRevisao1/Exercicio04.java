package ListaExerciciosRevisao1;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float valorCond, valorSet, valorFinal;
		int qtdUnidades;
		
		System.out.print("Digite o valor da taxa mensal de condomínio: R$ ");
		valorCond = teclado.nextFloat();
		System.out.print("Digite a quantidade de unidades habitacionais: ");
		qtdUnidades = teclado.nextInt();
		
		valorSet = valorCond + (valorCond / 2);
		valorFinal = valorSet * qtdUnidades;
		
		System.out.printf("A previsão de arrecadação no mês de SETEMBRO é de R$ %.2f.",valorFinal);
		teclado.close();
	}

}
