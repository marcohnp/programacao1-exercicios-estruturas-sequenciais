import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// Declaracoes
		Scanner teclado = new Scanner(System.in);
		int val1, val2, res;
	
		
		// Entrada
		System.out.print("Digite um valor: ");
		val1 = teclado.nextInt();
		System.out.print("Digite outro valor: ");
		val2 = teclado.nextInt();
		
		
		// Processamento
		res = val1 * val2;
		
		// Saida
		System.out.print(val1 + " * " + val2 + " = ");
		System.out.print(res);

	}

}