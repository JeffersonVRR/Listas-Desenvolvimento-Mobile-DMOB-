package Atividade1;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String args[]){
			int numero1;
			int numero2;
			int soma;
			int diferenca;
			double media;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre com o primeiro n�mero: ");
			numero1 = sc.nextInt();
			System.out.println("Entre com o segundo n�mero: ");
			numero2 = sc.nextInt();
			
			soma = numero1 + numero2;
			System.out.println("A soma: " + soma);
			
			diferenca = numero1 - numero2;
			System.out.println("A diferen�a: " + diferenca);
			
			media = ((double)numero1) + ((double)numero2);
			media = media/2;
			System.out.println("A media: " + media);
		
	}
}
