package ListaExerciciosRevisao1;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float valorCardapio, distancia, valorFinal;
		int qtdDePessoas;
		final int taxa = 3;
		
		System.out.print("Digite o valor do cardápio escolhido: R$ ");
		valorCardapio = teclado.nextFloat();
		System.out.print("Digite a quantidade de pessoas: ");
		qtdDePessoas = teclado.nextInt();
		System.out.print("Digite a distância do evento em km: ");
		distancia = teclado.nextFloat();
		
		valorFinal = (valorCardapio * qtdDePessoas) + (distancia * taxa);
		
		System.out.printf("O valor que o Buffet deverá cobrar pelo evento é de R$ %.2f.", valorFinal);
		teclado.close();
		

	}

}
