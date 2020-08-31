package LogicaDeProgramacao;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Variáveis
		Double valorBrutoImp, valorPagarImp;
		int numDep;
		
		
		//Entradas
		System.out.print("Informe o valor bruto do imposto: R$ ");
		valorBrutoImp = teclado.nextDouble();
		System.out.print("Informe o número de dependentes: ");
		numDep = teclado.nextInt();
		
		//Processamento
		valorPagarImp = valorBrutoImp - (1000 * numDep);
			
		if(valorPagarImp < 0){
				valorPagarImp = 0.0;
			}		
	
		//Saída
		System.out.printf("O valor total a ser pago de imposto é de R$ %.2f.",valorPagarImp);
		

	}

}
