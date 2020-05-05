package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float salario, valor;
		
		System.out.println("Digite o salário: R$ ");
		salario = teclado.nextFloat();
		
		
		if (salario <= 1200){
			
			valor = 1200;
		
		} else if (salario <= 2000) {
			
			valor = 1500;
		
		} else if (salario <= 3000) {
			
			valor = 2000;
			
		} else {
			
			 valor = 0;
		}
		
		if (valor == 0) {
			System.out.println("Você não tem direito ao auxílio emergencial.");			
		} else {
			System.out.printf("Você tem direito a um auxílio emergencial de R$ %.2f.", valor);
		}
		teclado.close();

	}

}
