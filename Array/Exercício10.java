package Array;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String [] formaPgto = {"E", "D", "E", "D", "E", "C", "E", "D", "D", "E", "E", "D", "E", "D", "E", "C", "E", "D", "D", "E"};
		float [] valorPgto = {100, 25, 222, 45, 17, 376, 573, 74, 90, 23, 1000, 250, 267, 450, 1700, 3760, 5730, 740, 900, 230};
		int [] qtdParcelas = {4, 0, 0, 0, 0, 5, 10, 0, 0, 0, 5, 0, 0, 0, 0, 8, 10, 0, 0, 0};
		final float percTaxa = 0.03f;
		
		float totalBrutCredito = 0, totalAVista = 0, totalLiqCredito = 0, totalLiqDebito = 0,
				taxaCartao = 0, parcelasBrutas = 0, parcelas = 0, acumParcelas = 0, totalLiqCredAnt = 0;
		
		for (int i = 0; i < valorPgto.length; i++) {
			
			if (formaPgto[i].equalsIgnoreCase("D") || formaPgto[i].equalsIgnoreCase("E")) {
				totalAVista += valorPgto[i];
			}
			
			if(formaPgto[i].equalsIgnoreCase("C")) {
				totalBrutCredito += valorPgto[i];
			}
			
			if (formaPgto[i].equalsIgnoreCase("D") || formaPgto[i].equalsIgnoreCase("C")) {
				taxaCartao = valorPgto[i] * percTaxa;
			}
			
			if (formaPgto[i].equalsIgnoreCase("D")) {
				totalLiqDebito += (valorPgto[i] - taxaCartao);
			}
			
			if(formaPgto[i].equalsIgnoreCase("C")) {
				totalLiqCredito += (valorPgto[i] - taxaCartao);
			}
			
			if(formaPgto[i].equalsIgnoreCase("C")) {
				
				parcelasBrutas = (valorPgto[i] - taxaCartao) / qtdParcelas[i];
				
				for(int p = 1; p <= qtdParcelas[i]; p++) {

					parcelas = (parcelasBrutas - (parcelasBrutas * percTaxa * p));
					acumParcelas += parcelas;
				}

				totalLiqCredAnt += acumParcelas;
				acumParcelas = 0;	
			}
			
		}
		
		System.out.printf("O valor total bruto das vendas à vista (espécie/débito) foi de R$ %.2f.\n", totalAVista);
		System.out.printf("O valor total bruto das vendas no crédito foi de R$ %.2f.\n", totalBrutCredito);
		System.out.printf("O valor total líquido a receber das vendas a débito é de R$ %.2f.\n", totalLiqDebito);
		System.out.printf("O valor total líquido a receber das vendas a crédito SEM antecipação é de R$ %.2f.\n", totalLiqCredito);
		System.out.printf("O valor total líquido a receber das vendas a crédito COM antecipação é de R$ %.2f.\n", totalLiqCredAnt);
		
		teclado.close();
	}

}
