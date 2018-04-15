package Lista35;

import java.util.Scanner;

public class Lista35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, sp = 0, si = 0;
		while (i <= 1000) {
			i = sc.nextInt();
			if (i>1000) {
				break;
			}
			System.out.println(i);
			if (i%2 == 0) {
				sp = i + sp;
			}
			if (i%2 == 1) {
				si = i + si;
			}
			
		}
			
		
		System.out.println(sp);
		System.out.println(si);
	}
}
