package Atividade2;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String args[]){
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro lado do tri�ngulo: ");
		n1 = sc.nextInt();
		System.out.println("Digite o valor do segundo lado do tri�ngulo: ");
		n2 = sc.nextInt();
		System.out.println("Digite o valor do terceiro lado do tri�ngulo: ");
		n3 = sc.nextInt();
		
		if(n1 + n2 > n3 && n2 + n3 > n1 && n3 + n1 > n2){
			System.out.println("� um tri�ngulo");
			if(n1 == n2 && n1 == n3 && n2 == n3){
				System.out.println("Tri�ngulo Equil�tero");
			}else if(n1 != n2 && n2 != n3 && n1 != n3){
				System.out.println("Tri�ngulo Escaleno");
			}else if(n1 == n2 || n2 == n3){
				System.out.println("Tri�ngulo Is�sceles");
			}
		}else{
			System.out.println("N�o � um tri�ngulo");
		}
		
	}
}
