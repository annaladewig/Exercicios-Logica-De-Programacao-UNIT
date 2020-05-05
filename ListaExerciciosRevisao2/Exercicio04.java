package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome, sexo;
		int idade;
		
		System.out.println("Digite o nome: ");
		nome = teclado.next();
		
		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();
		
		System.out.println("Digite o sexo (F/M): ");
		sexo = teclado.next();
		
		if (sexo.equalsIgnoreCase("F") && idade >= 60 || sexo.equalsIgnoreCase("M") && idade < 7) {
			
			System.out.printf("%s, você foi selecionado para o teste.", nome);
		
		} else {
			
			System.out.printf("%s, não tem papel disponível no momento.", nome);
		}
		teclado.close();
	}

}
