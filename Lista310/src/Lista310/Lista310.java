package Lista310;

import java.util.Scanner;

public class Lista310 {

	public static void main(String[] args) {
		int n, c = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n != 0) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println("Esse valor é primo " + n);
			}else {
				System.out.println("Esse valor não é primo "+ n); 
			}
			n--;
			c = 0;
		}
		
	}
}
