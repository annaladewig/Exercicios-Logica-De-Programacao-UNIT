package Avaliacao_Unidade_I;

import java.util.Scanner;

public class QuestaoPratica01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final float valorMensalPedagio = 300f;
		int qtdDiasUteis, qtdDiasNaoUteis;
		float valorDiasUteis, valorDiasNaoUteis;
		
		System.out.print("Digite a quantidade de dias �teis do m�s: ");
		qtdDiasUteis = teclado.nextInt();
		System.out.print("Digite a quantidade de dias n�o �teis do m�s: ");
		qtdDiasNaoUteis = teclado.nextInt();
		
		valorDiasNaoUteis = (valorMensalPedagio/(qtdDiasNaoUteis + qtdDiasUteis * (float) 2/3));
		valorDiasUteis = (2 * valorDiasNaoUteis) / 3;
		
		System.out.printf("O valor do ped�gio nos dias �teis � de R$ %.2f.\n", valorDiasUteis);
		System.out.printf("O valor do ped�gio nos dias n�o �teis � de R$ %.2f.", valorDiasNaoUteis);
		teclado.close();
	}
}
