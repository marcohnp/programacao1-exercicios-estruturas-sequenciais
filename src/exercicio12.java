import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// Declarações
		int h, m, s, res1, res2, res3, resf;
		
		
		// Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.print("Horas: ");
		h = teclado.nextInt();
		System.out.print("Minutos: ");
		m = teclado.nextInt();
		System.out.print("Segundos: ");
		s = teclado.nextInt();
		
		// Processamento
		res1 = h * 3600;
		res2 = m * 60;
		res3 = s * 1;
		resf = res1 + res2 + res3;
		
		// Saída
		System.out.print("Quantos segundos se passaram no dia? ");
		System.out.print(resf + " segundos.");
				
	}

}
