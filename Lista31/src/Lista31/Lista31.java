package Lista31;


import java.util.Scanner;

public class Lista31 {
	public static void main(String args []){
		
		double valor, cmaior = 0, cmenor = 1 ;
		
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 15; i++) {
			valor = sc.nextDouble();
			if (valor > cmaior) {
				cmaior = valor;
			}
			if (valor < cmenor) {
				cmenor = valor;
			}
		}
		System.out.println(cmaior);
		System.out.println(cmenor);
	}
}
