package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String senhaAtual, novaSenha, confirmacao;
		boolean erro = true, possuiNum = false, possuiLetra = false;
		
		System.out.println("Digite a senha atual: ");
		senhaAtual = teclado.next();
		
		do {
		System.out.println("Digite a nova senha: ");
		novaSenha = teclado.next();
		
		
		if (novaSenha.length() != 8) {
			System.out.println("A senha deve conter 8 digitos. Tente novamente.");
			continue;
		}
		
		for (int i = 0; i < novaSenha.length(); i++) {
			if (novaSenha.substring(0, i+1).compareTo("0") >= 0 && novaSenha.substring(0, i+1).compareTo("9") <= 0) {
				possuiNum = true;
				break;
			}
			if (novaSenha.substring(0, i+1).compareToIgnoreCase("A") >= 0 && novaSenha.substring(0, i+1).compareToIgnoreCase("z") <= 0) {
				possuiLetra = true;
				break;
			}
		}
		
		if (possuiNum == false || possuiLetra == false) {
			System.out.println("A senha deve conter letras e números. Tente novamente.");
			continue;
		}
		
		System.out.println("Digite novamente a nova senha: ");
		confirmacao = teclado.next();
		
		if(confirmacao.equalsIgnoreCase(novaSenha) == false) {
			System.out.println("Não foi digitada 2 vezes a mesma senha. Tente novamente.");
			continue;
		}
		
		erro = false;
		
		} while (erro = true);
			
		System.out.println("SENHA ALTERADA COM SUCESSO!");
		teclado.close();
	}

}
