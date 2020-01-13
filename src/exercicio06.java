import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quer saber a área de um Círculo?");
		// Calcular a área de círculo a partir do raio.
		
		// Declarações
		double area, raio, pi;
		pi = 3.14;
		
		
		// Entrada
		System.out.print("Digite o raio: ");
		raio = teclado.nextDouble();
		
		//Processamento
		area = pi * (raio * raio);
		
		// Saída
		System.out.print("Área do círculo = ");
		System.out.println(area + " 'unidade de medida' ²");
	
	

	}

}
