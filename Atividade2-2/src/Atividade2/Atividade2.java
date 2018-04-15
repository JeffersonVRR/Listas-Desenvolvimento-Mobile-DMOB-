package Atividade2;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String args[]){
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro lado do triângulo: ");
		n1 = sc.nextInt();
		System.out.println("Digite o valor do segundo lado do triângulo: ");
		n2 = sc.nextInt();
		System.out.println("Digite o valor do terceiro lado do triângulo: ");
		n3 = sc.nextInt();
		
		if(n1 + n2 > n3 && n2 + n3 > n1 && n3 + n1 > n2){
			System.out.println("É um triângulo");
			if(n1 == n2 && n1 == n3 && n2 == n3){
				System.out.println("Triângulo Equilátero");
			}else if(n1 != n2 && n2 != n3 && n1 != n3){
				System.out.println("Triângulo Escaleno");
			}else if(n1 == n2 || n2 == n3){
				System.out.println("Triângulo Isósceles");
			}
		}else{
			System.out.println("Não é um triângulo");
		}
		
	}
}
