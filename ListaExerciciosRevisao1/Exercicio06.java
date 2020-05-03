package ListaExerciciosRevisao1;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float consumoAgua, consumoEnerg, aguaPorLitro, energiaPorKw, mediaAgua, mediaEnergia;
		final int mes = 30;
		
		System.out.print("Digite o consumo mensal de �gua em litros: ");
		consumoAgua = teclado.nextFloat();
		System.out.print("Digite o consumo mensal de energia em kw/h: ");
		consumoEnerg = teclado.nextFloat();
		System.out.print("Digite o valor cobrado por litro de �gua utilizado: R$ ");
		aguaPorLitro = teclado.nextFloat();
		System.out.print("Digite o valor cobrado por kw/h utilizado: R$ ");
		energiaPorKw = teclado.nextFloat();
		
		mediaAgua = (consumoAgua * aguaPorLitro) / mes;
		mediaEnergia = (consumoEnerg * energiaPorKw) / mes;
		
		System.out.printf("O gasto com o consumo m�dio de �gua di�rio � de R$%.2f.\n", mediaAgua);
		System.out.printf("O gasto com o consumo m�dio de energia di�rio � de R$%.2f.", mediaEnergia);
		teclado.close();
	}

}
