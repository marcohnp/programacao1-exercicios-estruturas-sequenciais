import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// declaracoes
		Scanner teclado = new Scanner(System.in);
		int val1, res;
		
		// entrada
		System.out.print("Digite valor: ");
		val1 = teclado.nextInt();
			
		
		// processamento
		res = val1 * val1 ;
		
		// saida
		System.out.print("Resultado: ");
		System.out.print(res);


	}

}
