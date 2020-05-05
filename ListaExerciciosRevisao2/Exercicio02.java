package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float salario, tempoServico;
		System.out.println("Digite o salário: R$ ");
		salario = teclado.nextFloat();
		
		System.out.println("Digite o tempo de serviço: ");
		tempoServico = teclado.nextFloat();
		
		if (salario <= 1200 && tempoServico >= 3){
			
			System.out.println("Você tem direito ao auxílio emergencial.");
		
		} else {
			
			System.out.println("Você não tem direito ao auxílio emergencial.");
		}
		teclado.close();

	}

}
