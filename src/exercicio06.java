import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quer saber a �rea de um C�rculo?");
		// Calcular a �rea de c�rculo a partir do raio.
		
		// Declara��es
		double area, raio, pi;
		pi = 3.14;
		
		
		// Entrada
		System.out.print("Digite o raio: ");
		raio = teclado.nextDouble();
		
		//Processamento
		area = pi * (raio * raio);
		
		// Sa�da
		System.out.print("�rea do c�rculo = ");
		System.out.println(area + " 'unidade de medida' �");
	
	

	}

}
