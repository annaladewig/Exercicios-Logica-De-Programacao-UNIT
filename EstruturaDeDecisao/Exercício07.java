package EstruturaDeDecisao;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		double valorParcela, totMulta, valorTotal;
		int diaVenc, diaPgto, diasDeAtraso;
		final float percMulta = 0.004f; 
		
		//Entradas
		System.out.print("Valor da Parcela: R$ ");
		valorParcela = teclado.nextDouble();
		System.out.print("Dia do vencimento: ");
		diaVenc = teclado.nextInt();
		System.out.print("Dia do pagamento: ");
		diaPgto = teclado.nextInt();
		
		//Processamento e Saídas
		if (diaPgto > diaVenc) {
			diasDeAtraso = diaPgto - diaVenc;
			System.out.printf("Houve um total de %d dias de atraso. \n", diasDeAtraso);
			totMulta = diasDeAtraso * valorParcela * percMulta;
			System.out.printf("O valor dos juros é de R$ %.2f. \n", totMulta);
			valorTotal = valorParcela + totMulta;
			System.out.printf("O valor total do pagamento é de R$ %.2f. \n", valorTotal);
		} else {
			System.out.println("O pagamento foi realizado dentro do vencimento.");
		}

	}

}
