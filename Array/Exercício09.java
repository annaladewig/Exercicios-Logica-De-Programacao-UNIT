package Array;

import java.util.Scanner;

public class Exercício09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [] primeiras12H = {200, 350, 500, 450, 700, 1000, 2000, 1500, 1000, 1300, 1200, 1500};
		int [] segundas12H = {1500, 1300, 1300, 1500, 1300, 1800, 1700, 1600, 1500, 1200, 1000, 500};
	
		int acumParte1 = 0, acumParte2 = 0, maiorParte1 = 0, maiorParte2 = 0, horaPicoParte1 = 0, horaPicoParte2 = 0;
		float qtdMediaParte1, qtdMediaParte2;
		
		for (int i = 0; i < primeiras12H.length; i++) {
			acumParte1 += primeiras12H[i];
			acumParte2 += segundas12H[i];
			
			if (primeiras12H[i] > maiorParte1) {
				maiorParte1 = primeiras12H[i];
				horaPicoParte1 = i + 1;
			}
			
			if (segundas12H[i] > maiorParte2) {
				maiorParte2 = segundas12H[i];
				horaPicoParte2 = i + 13;
			}
		}
		
		qtdMediaParte1 = acumParte1/primeiras12H.length;
		qtdMediaParte2 = acumParte2/segundas12H.length;
	
		System.out.printf("A média de passageiros das primeiras 12h foi de %.1f passageiros.\n", qtdMediaParte1);
		System.out.printf("A média de passageiros das segundas 12h foi de %.1f passageiros.\n", qtdMediaParte2);
		System.out.printf("A hora de pico das primeiras 12h é às %dh.\n",horaPicoParte1);
		System.out.printf("A hora de pico das segundas 12h é às %dh.\n",horaPicoParte2);
		
		int qtdPessoasParte1 = 0, qtdPessoasParte2 = 0;
		float diferenca1 = 0, diferenca2 = 0;
		float perc1 = 0, perc2 = 0;
		String tipo1 = "", tipo2 = "";
		
		for (int i = 0; i < primeiras12H.length; i++) {
			if(i == 0 && i == horaPicoParte1 - 1) {
				qtdPessoasParte1 = primeiras12H[i]/ 2;
			}
				
			if(i != 0 && i == horaPicoParte1 - 2) {
				qtdPessoasParte1 = primeiras12H[i];
			}
			
			if(i == horaPicoParte2 - 14) {
				qtdPessoasParte2 = segundas12H[i];
			}
		}
		
		diferenca1 = qtdPessoasParte1 - qtdMediaParte1;
		perc1 = diferenca1/qtdMediaParte1 * 100;
		
		
		if (diferenca1 >= 0) {
			tipo1 = "acima";
		} else {
			tipo1 = "abaixo";
		}
		
		
		diferenca2 = qtdPessoasParte2 - qtdMediaParte2;
		perc2 = diferenca2/qtdMediaParte2 * 100;
		
		if (diferenca2 >= 0) {
			tipo2 = "acima";
		} else {
			tipo2 = "abaixo";
		}
		
		System.out.printf("O percentual da hora anterior ao pico das primeiras 12h é %.2f %s da média.\n", perc1, tipo1);
		System.out.printf("O percentual da hora anterior ao pico das segundas 12h é %.2f %s da média.\n", perc2, tipo2);
		teclado.close();
	}
	
	

}
