package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float salario;
		System.out.println("Digite o salário: R$ ");
		salario = teclado.nextFloat();
		
		if (salario <= 1200){
			
			System.out.println("Você tem direito ao auxílio emergencial.");
		
		} else {
			
			System.out.println("Você não tem direito ao auxílio emergencial.");
		}
		teclado.close();
	}

}
