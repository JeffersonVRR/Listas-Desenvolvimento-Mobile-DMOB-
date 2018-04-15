package Lista39;

import java.util.Scanner;
import java.util.Vector;

public class Lista39 {
	public static void main(String[] args) {
		int n, c = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			System.out.println("É primo");
		}else {
			System.out.println("Não é primo"); 
		}
	}
}
