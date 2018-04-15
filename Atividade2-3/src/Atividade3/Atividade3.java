package Atividade3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int n1,n2,n3;
		double m;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeira nota: ");
		n1 = sc.nextInt();
		System.out.println("Segunda nota: ");
		n2 = sc.nextInt();
		System.out.println("Terceira nota: ");
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n2){
			System.out.println("A primeira nota é a maior");
		}else if(n2 > n1 && n2 > n3){
			System.out.println("A segunda nota é a maior");
		}else{
			System.out.println("A terceira nota é maior");
		}
		m = ((double)n1+(double)n2+(double)n3)/3;
		System.out.println("A média das notas são: " + m);
	}

}
