package Atividade5;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String args[]){
		int n1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor: ");
		n1 = sc.nextInt();
		
		n1 = n1 * n1;
		System.out.println("O quadrado do valor informado é: " + n1);
	}
}
