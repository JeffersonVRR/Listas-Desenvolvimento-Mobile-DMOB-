package Lista36;

import java.util.Scanner;

public class Lista36 {

	public static void main(String[] args) {
		double v1,v2,v3,s,p,m;
		Scanner sc = new Scanner(System.in);
		
		do {
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();
			s = v1 + v2 + v3;
			p = v1 * v2 * v3;
			m = (v1 + v2 + v3)/3;
			System.out.println("Soma: " + s);
			System.out.println("Produto: " + p);
			System.out.println("Média: " + m);
		} while (v1 < v2);
	}

}
