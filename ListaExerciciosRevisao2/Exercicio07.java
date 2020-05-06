package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final float valorDiario = 500;
		float debito, sobra; 
		String continuar = "S";
		
		sobra = valorDiario;
		
		do {
			System.out.println("Digite o valor do d�bito: ");
			debito = teclado.nextFloat();
			
			sobra = sobra - debito;
			
			if(sobra < 0) {
				System.out.println("Voc� n�o pode fazer esse d�bito, pois ultrapassa o valor dispon�vel em caixa.");
				sobra = sobra + debito;
				continue;
			}
			
			System.out.printf("O saldo do fundo do caixa � de R$ %.2f.\n", sobra);
			
			System.out.println("Deseja continuar (S/N)? ");
			continuar = teclado.next();
			
			if (continuar.equalsIgnoreCase("N")) {
				System.out.println("Sess�o encerrada.");
				break;
			}
			
		} while (sobra >= 0);
		teclado.close();
	}

}
