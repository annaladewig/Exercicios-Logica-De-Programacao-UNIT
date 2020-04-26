package EstruturaDeDecisao;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double valorParcela, totJuros, totDesconto, valorTotal;
		int diaPgto, diasDeAtraso;
		final int diaVenc = 05;
		final float juros = 0.004f; 
		final float desconto = 0.05f;
		
		//Entradas
		System.out.print("Valor da Parcela: R$ ");
		valorParcela = teclado.nextDouble();
		System.out.print("Dia do pagamento: ");
		diaPgto = teclado.nextInt();
		
		//Processamento e Saídas
		if (diaPgto > diaVenc) {
			diasDeAtraso = diaPgto - diaVenc;
			System.out.printf("Houve um total de %d dias de atraso. \n", diasDeAtraso);
					
			totJuros = diasDeAtraso * valorParcela * juros;
			System.out.printf("O valor do juros é de R$ %.2f. \n", totJuros);
			
			valorTotal = valorParcela + totJuros;
			System.out.printf("O valor total do pagamento é de R$ %.2f. \n", valorTotal);
			
		} else {
			totDesconto = valorParcela * desconto;
			System.out.printf("O valor do desconto é de R$ %.2f. \n", totDesconto);
			
			valorTotal = valorParcela - totDesconto;
			System.out.printf("O valor total do pagamento é de R$ %.2f. \n", valorTotal);
		}

	}

}
