package ListaExerciciosRevisao1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int qtdPratos10, qtdPratos13;
		float valorTotal;
		final int frete = 7;
		
		System.out.print("Quantidade de pratos com o valor de R$ 10: ");
		qtdPratos10 = teclado.nextInt();
		System.out.print("Quantidade de pratos com o valor de R$ 13: ");
		qtdPratos13 = teclado.nextInt();
		
		valorTotal = (qtdPratos10 * 10) + (qtdPratos13 * 13) + frete;
		
		System.out.printf("O valor total da compra é de R$ %.2f.", valorTotal);
		teclado.close();

	}

}
