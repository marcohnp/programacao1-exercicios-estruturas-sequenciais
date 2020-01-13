import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// Declarações
		Scanner teclado = new Scanner(System.in);
		double pol, mil, res;
		pol = 25.4;
		
		// Entrada
		System.out.print("Digite o valor em polegadas: ");
		mil = teclado.nextDouble();
				
		
		// Processamento
		res = pol * mil;
		
		// Saída
		System.out.print("Conversão em milímitros: ");
		System.out.print(res);

	}

}
