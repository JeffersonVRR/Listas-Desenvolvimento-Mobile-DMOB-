package Lista33;

public class Lista33 {

	public static void main(String[] args) {
		int j = 0;
		double soma = 0;
		for (int i = 1; i <=99; i+=2) {
			j++;
			soma = i/j + soma;	
		}
		System.out.println(soma);
	}
}
