package ListaExerciciosRevisao1;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String horaDada;
		int hora, min, seg, horaEmMin, horaEmSeg;
		
		System.out.println("Digite uma hora (HH:MM:SS): ");
		horaDada = teclado.next();

		hora = Integer.parseInt(horaDada.substring(0,2));
		
		min = Integer.parseInt(horaDada.substring(3,5));
		
		seg = Integer.parseInt(horaDada.substring(6,8));
		
		horaEmMin = min + (hora * 60) + (seg / 60);
		System.out.printf("A hora fornecida em minutos dão %d minutos.\n", horaEmMin);
		
		horaEmSeg = seg + (hora * 3600) + (min * 60);
		System.out.printf("A hora fornecida em segundos dão %d segundos.", horaEmSeg);
		
		teclado.close();
		
	}

}
