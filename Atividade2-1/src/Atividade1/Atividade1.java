package Atividade1;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String args[]){
		int n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o n�mero: ");
		n1 = sc.nextInt();
		
		if (n1 % 2 == 1 && n1 > 0) {
			System.out.println("N�mero informado � impar e positivo");
		}else if((n1*-1) % 2 == 1 && n1 < 0){
			System.out.println("N�mero informado � impar negativo" );
		}else if(n1 % 2 == 0 && n1 > 0){
			System.out.println("N�mero informado � par e positivo");
		}else{
			System.out.println("N�mero informado � par e negativo");
		}
	}
}