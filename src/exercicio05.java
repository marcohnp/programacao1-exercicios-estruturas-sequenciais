import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// declaracoes
		Scanner teclado = new Scanner(System.in);
		int val1, res, res2, res3, res4, res5;
		
		// entrada
		System.out.print("Digite um número: ");
		val1 = teclado.nextInt();
		
		
		// processamento
		res = val1 * val1; res2 = val1 / 3; 
		res2 = val1 / 3;
		res3 = (val1 / 2) * val1;
		res4 = val1 / 2;
		res5 = val1 % 3;

		
		
		// saida
		System.out.print(val1 + "² = ");
		System.out.println(res);
		System.out.print(val1 + " / 3 = ");
		System.out.println(res2);
		System.out.print("O resto da divisão de " + val1 + " por 3 é: ");
		System.out.println(res5);
		System.out.print("A metade de " + val1 + " é: ");
		System.out.println(res4);
		System.out.print(val1 + " * " + res4 + " = ");
		System.out.println(res3);
	

	}

}
