package Atividade4;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String args[]){
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro valor de A: ");
		a = sc.nextInt();
		System.out.println("Segundo valor de B: ");
		b = sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Os valores invertidos são: A = " + a + "B = " + b);
	}
}
