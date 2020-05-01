package Switch;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String matricula, curso = "";
		boolean erro = false;
		
		System.out.println("Digite a matrícula do aluno:");
		matricula = teclado.next(); 
		
		switch (matricula.substring(0,1)) {
		case "1":
			curso = "técnico";
			break;
		case "2":
		case "3":
		case "4":
			curso = "graduação";
			break;
		case "5":
		case "6":
			curso = "Lato Sensu";
			break;
		case "7":
		case "8":
			curso = "Stricto Senso";
			break;
		default:
			System.out.println("Matrícula incorreta.");
			erro = true;
			break;
		}
		if (erro == false) {
		System.out.printf("A matrícula informada é de um curso de %s.", curso);
		}
		teclado.close();
	}

}
