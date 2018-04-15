package Atividade4;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String args[]){
		int n1,n2,n3;
		String a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		n3 = sc.nextInt();
		
		System.out.println("Digite 'c' para crescente ou 'd' para decrescente: ");
		a = sc.next();
		switch (a) {
		case "c":
			if(n1 > n2 && n1 > n3 && n2 > n3){
				System.out.println("Valores em ordem crescente: " + n3 +", " + n2 + ", " + n1);
			}else if (n1 > n2 && n1 > n3 && n3 > n2) {
				System.out.println("Valores em ordem crescente: " + n2 +", " + n3 + ", " + n1);
			}else if(n2 > n1 && n2 > n3 && n1 > n3){
				System.out.println("Valores em ordem crescente: " + n3 +", " + n1 + ", " + n2);
			}else if (n2 > n1 && n2 > n3 && n3 > n1) {
				System.out.println("Valores em ordem crescente: " + n1 +", " + n3 + ", " + n2);
			}else if (n3 > n1 && n3 > n1 && n1 > n2) {
				System.out.println("Valores em ordem crescente: " + n2 +", " + n1 + ", " + n3);
			}else if (n3 > n1 && n3 > n1 && n2 > n1){
				System.out.println("Valores em ordem crescente: " + n1 +", " + n2 + ", " + n3);
			}
			break;
		case "d":
				if(n1 < n2 && n1 < n3 && n2 < n3){
					System.out.println("Valores em ordem decrescente: " + n1 +", " + n2 + ", " + n3);
				}else if (n1 < n2 && n1 < n3 && n3 < n2) {
					System.out.println("Valores em ordem decrescente: " + n1 +", " + n3 + ", " + n2);
				}else if(n2 < n1 && n2 < n3 && n1 < n3){
					System.out.println("Valores em ordem decrescente: " + n2 +", " + n1 + ", " + n3);
				}else if (n2 < n1 && n2 < n3 && n3 < n1) {
					System.out.println("Valores em ordem decrescente: " + n2 +", " + n3 + ", " + n1);
				}else if (n3 < n1 && n3 < n1 && n1 < n2) {
					System.out.println("Valores em ordem decrescente: " + n3 +", " + n1 + ", " + n2);
				}else if (n3 < n1 && n3 < n1 && n2 < n1){
					System.out.println("Valores em ordem decrescente: " + n3 +", " + n2 + ", " + n1);
				}
			break;
		default:
			System.out.println("Digitou errado");
			break;
		}
	}
}
