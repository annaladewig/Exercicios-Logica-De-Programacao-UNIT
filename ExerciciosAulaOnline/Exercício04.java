package ExerciciosAulaOnline;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String placa, finalPlaca;
		double valorVeiculo = 0.0, valorIpva = 0.0;
		double acumJan = 0.0, acumFev = 0.0, acumMar = 0.0, acumAbr = 0.0, acumTotal = 0.0;
		final double percIpva = 0.10;
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("Digite a placa do %d� ve�culo (XXX-0000): ", i + 1);
			placa = teclado.next();
			System.out.print("Digite o valor desse ve�culo: R$ ");
			valorVeiculo = teclado.nextDouble();
		
			valorIpva = valorVeiculo * percIpva;
			finalPlaca = placa.substring(7,8);
		
		
			if(finalPlaca.equals("1") || finalPlaca.equals("2") || finalPlaca.equals("3") ) {
			
				System.out.println("O m�s do pagamento do seu IPVA � JANEIRO.");
				System.out.println("------------------------------------------");
				acumJan = acumJan + valorIpva;
			
			} else if(finalPlaca.equals("4") || finalPlaca.equals("5") || finalPlaca.equals("6") ) {
		
				System.out.println("O m�s do pagamento do seu IPVA � FEVEREIRO.");
				System.out.println("------------------------------------------");
				acumFev = acumFev + valorIpva;
			
			} else if(finalPlaca.equals("7") || finalPlaca.equals("8") || finalPlaca.equals("9") ) {
			
				System.out.println("O m�s do pagamento do seu IPVA � MAR�O.");
				System.out.println("------------------------------------------");
				acumMar = acumMar + valorIpva;
			
			} else {
				System.out.println("O m�s do pagamento do seu IPVA � ABRIL.");
				System.out.println("------------------------------------------");
				acumAbr = acumAbr + valorIpva;
			}
		}
		
		System.out.printf("O total arrecadado de IPVA no m�s de JANEIRO foi R$ %.2f. \n", acumJan);
		System.out.printf("O total arrecadado de IPVA no m�s de FEVEREIRO foi R$ %.2f. \n", acumFev);
		System.out.printf("O total arrecadado de IPVA no m�s de MAR�O foi R$ %.2f. \n", acumMar);
		System.out.printf("O total arrecadado de IPVA no m�s de ABRIL foi R$ %.2f. \n", acumAbr);
		
		acumTotal = acumJan + acumFev + acumMar + acumAbr;
		System.out.printf("O total geral arrecadado de IPVA foi R$ %.2f.", acumTotal);

		teclado.close();
	}

}
