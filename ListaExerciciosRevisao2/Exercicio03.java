package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float salario, valor;
		
		System.out.println("Digite o sal�rio: R$ ");
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
			System.out.println("Voc� n�o tem direito ao aux�lio emergencial.");			
		} else {
			System.out.printf("Voc� tem direito a um aux�lio emergencial de R$ %.2f.", valor);
		}
		teclado.close();

	}

}
