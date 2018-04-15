package Lista32;

public class Lista32 {
	public static void main(String args[]){
		for (int i = 0; i <= 9; i++) {
			System.out.println("--------");
			for (int j = 0; j <=9; j++) {
				int soma = i * j;
				System.out.println(i + "X" + j + " = " + soma);
			}
		}
		
	}
}

