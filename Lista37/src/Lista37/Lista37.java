package Lista37;

import java.util.Scanner;

public class Lista37 {
	public static void main(String args[]){
		double m, medmaior, medmenor, medarit = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		m = sc.nextDouble();
		medmaior = m;
		medmenor = m;
		while (m > 0) {
			if (m > medmaior) {
				medmaior = m;
			}
			if (m < medmenor) {
				medmenor = m;
			}
			medarit = m + medarit;
			c++;
			m = sc.nextDouble();
		}
		medarit = medarit / c;
		System.out.println(medmaior);
		System.out.println(medmenor);
		System.out.println(medarit);
	}
}	
