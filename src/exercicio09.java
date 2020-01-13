import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
					// Declarações
					Scanner teclado = new Scanner(System.in);
					double f, c;
					
					//Entrada
					System.out.print("Digite a temperatura em Fahrenheit: ");
					f = teclado.nextDouble();
					
					// Processamento
					c = (5 * (f - 32)) / 9;
					
					// Saída
					System.out.print("Temperatura em Celsius: ");
					System.out.print(c + " °C"); 
					


	}

}
