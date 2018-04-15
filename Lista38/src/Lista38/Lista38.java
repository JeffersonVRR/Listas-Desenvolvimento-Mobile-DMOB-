package Lista38;

import java.util.Scanner;

public class Lista38 {

	public static void main(String[] args) {
		double n1;
		int c1 = 0, c2 = 0;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextDouble();
		
		for (int i = 0; i < n1; i++) {
			if (i%2 == 0) {
				
				c1++;
				System.out.println(i);
			}
		}
		System.out.println("Quantidade " + c1);
		for (int k = 0; k < n1; k++) {
			if (k%2 == 1) {
				c2++;
				System.out.println(k);
				
			}
		}
		System.out.println("Quantidade " + c2);
	}

}
