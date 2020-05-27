package Avaliacao_Unidade_I;

import java.util.Scanner;

public class QuestaoPratica02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final float valorMax = 1000f;
		String tipo, continuar;
		float valor = 0, acumulado = 0;
		int cont = 0, qtdPecas = 0;
		
		do {
			System.out.print("Digite (P) para peça ou (S) para serviço: ");
			tipo = teclado.next();
			
			if(tipo.equalsIgnoreCase("P") || tipo.equalsIgnoreCase("S")) {
			
				if (tipo.equalsIgnoreCase("P")) {
					System.out.print("\nDigite o valor da peça: R$ ");
					valor = teclado.nextFloat();
					valor = valor - (valor * 0.10f);
					qtdPecas++;
					
				} else {
					System.out.print("\nDigite o valor do serviço: R$ ");
					valor = teclado.nextFloat();
					valor = valor - (valor * 0.20f);
				}

			} else {
				System.out.println("\nPor favor, digite apenas P ou S.\n");
				continue;
			}
			
			acumulado += valor;
			
			if (acumulado > valorMax) {
				System.out.println("Foi ultrapassado o limite, item cancelado.");
				acumulado -= valor;
				if (tipo.equalsIgnoreCase("P")) {
					qtdPecas--;
				}
			}
			
			cont++;
			
			if (cont < 6) {
				System.out.println("Deseja adicionar mais um item? (S/N) ");
			
			continuar = teclado.next();
			
				if (continuar.equalsIgnoreCase("S")) {
					continue;
				} else {
					System.out.println("\nEncerramento da entrada de serviços e peças.\n");
					break;
				}
			}
		} while (cont < 6);
		
		System.out.println("\n---------------------------------------");
		System.out.printf("A quantidade total de peças: %d.\n", qtdPecas);
		System.out.printf("O valor total foi de R$ %.2f.", acumulado);
		teclado.close();
	}

}
