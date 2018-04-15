package Atividade3;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String args[]){
		double pi;
		pi = 3.1416;
		double raio;
		double altura;
		double volume;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculando o volume de uma lata de oleo");
		System.out.println("Qual o raio da lata? ");
		raio = sc.nextDouble();
		System.out.println("Qual a altura? ");
		altura = sc.nextDouble();
		
		volume = pi * (raio * raio) * altura;
		System.out.println("O volume da lata é : " + volume);
	}
}
