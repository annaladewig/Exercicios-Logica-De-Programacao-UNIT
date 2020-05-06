package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String flor1, flor2, flor3, pri = "", seg = "", ter = "";
		
		System.out.println("Digite o nome da 1º flor: ");
		flor1 = teclado.next();
		
		System.out.println("Digite o nome da 2º flor: ");
		flor2 = teclado.next();
		
		System.out.println("Digite o nome da 3º flor: ");
		flor3 = teclado.next();

		if(flor1.compareToIgnoreCase(flor2) < 0 && flor1.compareToIgnoreCase(flor3) < 0) {
			
			pri = flor1;
			
			if(flor2.compareToIgnoreCase(flor2) < 0 ) {
				seg = flor2;
				ter = flor3;
			}  else {
				seg = flor3;
				ter = flor2;
			}
		} else if(flor2.compareToIgnoreCase(flor1) < 0 && flor2.compareToIgnoreCase(flor3) < 0) {
			
			pri = flor2;
			
			if(flor1.compareToIgnoreCase(flor3) < 0 ) {
				seg = flor1;
				ter = flor3;
			}  else {
				seg = flor3;
				ter = flor1;
			} 
		} else if ( flor3.compareToIgnoreCase(flor1) < 0 && flor3.compareToIgnoreCase(flor2) < 0) {
			
			pri = flor3;
			
			if(flor1.compareToIgnoreCase(flor2) < 0 ) {
				seg = flor1;
				ter = flor2;
			}  else {
				seg = flor2;
				ter = flor1;
			}
		}
		
		System.out.printf("O nome das flores em ordem são %s, %s, %s", pri, seg, ter);
		teclado.close();
		
	}

}
