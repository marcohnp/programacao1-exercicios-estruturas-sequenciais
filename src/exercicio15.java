import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
				// Declarações
				int a, m, d, res1, val1;
				
				
				// Entrada
				Scanner teclado = new Scanner(System.in);
				System.out.print("Quantos dias foram vividos: ");
				val1 = teclado.nextInt();
				
				// Processamento
				a = val1 / 360;
				res1 = val1 % 360;
				m = res1 / 30;
				d = res1 % 30;
				
				
						
				
				
				// Saída
				System.out.print("Foram vividos: ");
				System.out.println(a + " anos, " + m + " meses e " + d + " dias.");
			
				
						


	}

}
