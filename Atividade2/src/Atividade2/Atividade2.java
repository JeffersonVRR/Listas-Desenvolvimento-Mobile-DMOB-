package Atividade2;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String args[]){
		double centigrados;
		double fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informar a temperatura em Centígrados: ");
		centigrados = sc.nextDouble();
		fahrenheit = (9*centigrados+160)/5;
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
	}
}
