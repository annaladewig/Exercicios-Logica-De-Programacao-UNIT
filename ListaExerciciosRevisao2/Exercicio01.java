package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float salario;
		System.out.println("Digite o sal�rio: R$ ");
		salario = teclado.nextFloat();
		
		if (salario <= 1200){
			
			System.out.println("Voc� tem direito ao aux�lio emergencial.");
		
		} else {
			
			System.out.println("Voc� n�o tem direito ao aux�lio emergencial.");
		}
		teclado.close();
	}

}
