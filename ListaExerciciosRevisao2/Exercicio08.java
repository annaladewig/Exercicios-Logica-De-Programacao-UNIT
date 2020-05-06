package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int qtdPessoas = 0, qtdVeiculos = 0, totPessoas = 0;
		float totValor = 0;
		final float valorEntrada = 30;
		String continuar = "S";
		
		while (qtdVeiculos < 5) {
			System.out.println("------------------------------------------------------");
			System.out.printf("Digite a quantidade de pessoas presentes no %dº veículo: ", qtdVeiculos + 1);
			qtdPessoas = teclado.nextInt();
			
			if(qtdPessoas < 1 || qtdPessoas > 7) {
				System.out.println(">> O número de pessoas por carro não pode ser menor que 1 ou maior que 7. <<\n");
				continue;
			}
				
			totPessoas += qtdPessoas;
			
			if(totPessoas > 20) {
				totPessoas -= qtdPessoas;
				System.out.println("Foi extrapolada a quantidade máxima de pessoas. \n"
						+ "Deseja registrar novo veículo com quantidade menor de pessoas? (S/N).");
				continuar = teclado.next();
					if (continuar.equalsIgnoreCase("N")) {
						qtdVeiculos--;
						break;
					} else {
				
						continue;
					}
			}
			
			totValor += valorEntrada;
			
			if (qtdVeiculos != 4) {
			System.out.println("Deseja registrar mais um veículo? (S/N)");
			continuar = teclado.next();
			
				if (continuar.equalsIgnoreCase("N")) {
					break;
				}
			}
			
			qtdVeiculos++;
		}
		 
		System.out.println("------------------------------------------------");
		if (qtdVeiculos == 5) {
			System.out.printf("Existem %d veículos na reserva.\n", qtdVeiculos);
		} else {
			System.out.printf("Existem %d veículos na reserva.\n", qtdVeiculos + 1);
		}
		System.out.printf("Existe um total de %d pessoas na reserva.\n", totPessoas);
		System.out.printf("O valor total arrecadado foi de R$ %.2f.\n", totValor);
		teclado.close();
	}

}
