package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float salario, tempoServico;
		System.out.println("Digite o sal�rio: R$ ");
		salario = teclado.nextFloat();
		
		System.out.println("Digite o tempo de servi�o: ");
		tempoServico = teclado.nextFloat();
		
		if (salario <= 1200 && tempoServico >= 3){
			
			System.out.println("Voc� tem direito ao aux�lio emergencial.");
		
		} else {
			
			System.out.println("Voc� n�o tem direito ao aux�lio emergencial.");
		}
		teclado.close();

	}

}
