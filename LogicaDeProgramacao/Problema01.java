package LogicaDeProgramacao;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Vari�veis
		Double valorBrutoImp, valorPagarImp;
		int numDep;
		
		
		//Entradas
		System.out.print("Informe o valor bruto do imposto: R$ ");
		valorBrutoImp = teclado.nextDouble();
		System.out.print("Informe o n�mero de dependentes: ");
		numDep = teclado.nextInt();
		
		//Processamento
		valorPagarImp = valorBrutoImp - (1000 * numDep);
			
		if(valorPagarImp < 0){
				valorPagarImp = 0.0;
			}		
	
		//Sa�da
		System.out.printf("O valor total a ser pago de imposto � de R$ %.2f.",valorPagarImp);
		

	}

}
