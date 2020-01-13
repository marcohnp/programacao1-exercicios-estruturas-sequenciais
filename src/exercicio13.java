import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// declaracoes
		Scanner teclado = new Scanner(System.in);
		int val1, val2, val3, val4, val5, res;
		
		// entrada
		System.out.print("Digite valor 1: ");
		val1 = teclado.nextInt();
		System.out.print("Digite valor 2: ");
		val2 =  teclado.nextInt();
		System.out.print("Digite valor 3: ");
		val3 = teclado.nextInt();
		System.out.print("Digite valor 4: ");
		val4 = teclado.nextInt();
		System.out.print("Digite valor 5: ");
		val5 = teclado.nextInt();
			
		
		// processamento
		res = (val1 + val2 + val3 + val4 + val5) / 5;
		
		// saida
		System.out.print("Resultado: ");
		System.out.print(res);

	}

}
