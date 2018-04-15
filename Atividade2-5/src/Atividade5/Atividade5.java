package Atividade5;

import java.util.Scanner;


public class Atividade5 {

	public static void main(String[] args) {
		int n1,n2,n3;
		int o;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		n3 = sc.nextInt();
		
		System.out.println("Escolha uma opção:");
		System.out.println("(1) Calcular a média.");
		System.out.println("(2) Calcular a soma.");
		System.out.println("(3) Calcular a multiplicação.");
		o = sc.nextInt();
		
		switch (o) {
		case 1:
			double m;
			m = ((double)n1+(double)n2+(double)+n3)/3;
			System.out.println("A média é: " + m);	
			break;
		case 2:
			int s;
			s = n1 + n2 + n3;
			System.out.println("A soma é: " + s);
			break;
		case 3:
			int mp;
			mp = n1 * n2 * n3;
			System.out.println("A multiplicação é: " + mp);
			break;
		default:
			System.out.println("Seleciono a opção errada!");
			break;
		}
	}

}
