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
			System.out.println("A primeira nota � a maior");
		}else if(n2 > n1 && n2 > n3){
			System.out.println("A segunda nota � a maior");
		}else{
			System.out.println("A terceira nota � maior");
		}
		m = ((double)n1+(double)n2+(double)n3)/3;
		System.out.println("A m�dia das notas s�o: " + m);
	}

}
