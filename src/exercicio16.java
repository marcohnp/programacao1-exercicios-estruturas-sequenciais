import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
				// Declara��es
				int a, b, val1, val2, na, nb;
				
				// Entrada
				Scanner teclado = new Scanner(System.in);
				System.out.print("Digite um valor: ");
				a = teclado.nextInt();
				System.out.print("Digite outro valor: ");
				b = teclado.nextInt();
				
				// Processamento
				val1 = a;
				val2 = b;
				na = val2;
				nb = val1;
				
				// Sa�da
				System.out.println(a + " � A, " + b + " � B.");
				System.out.println("Agora as vari�veis trocaram de valor.");
				System.out.println("A � " + na + " e B � " + nb);
				
				
	}

}
