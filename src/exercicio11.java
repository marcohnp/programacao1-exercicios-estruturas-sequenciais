import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		double pol, mil, res;
		pol = 25.4;
		
		// Entrada
		System.out.print("Digite o valor em polegadas: ");
		mil = teclado.nextDouble();
				
		
		// Processamento
		res = pol * mil;
		
		// Sa�da
		System.out.print("Convers�o em mil�mitros: ");
		System.out.print(res);

	}

}
