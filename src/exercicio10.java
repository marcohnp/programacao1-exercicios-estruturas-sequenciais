import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		double f, c, k;
		
		//Entrada
		System.out.print("Digite a temperatura em Fahrenheit: ");
		f = teclado.nextDouble();
		
		// Processamento
		c = (5 * (f - 32)) / 9;
		k = c + 273;
		
		// Sa�da
		System.out.println("Temperatura Celsius: " + c + " �C");
		System.out.print("Temperatura em Kelvin: ");
		System.out.print(k + " �K"); 
		


	}

}
