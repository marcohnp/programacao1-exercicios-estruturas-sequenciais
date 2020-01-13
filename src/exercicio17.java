import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		// Declarações
		System.out.println("Este caixa eletrônico possui notas de 100, 50, 10, 5, 1.");
		int ncem, ncinq, ndez, ncinc, num, val1, res1, res2, res3, res4;
		
		
		// Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual valor deseja sacar? ");
		val1 = teclado.nextInt();
		
		// Processamento
		ncem = val1 / 100;
		res1 = val1 % 100;
		ncinq = res1 / 50;
		res2 = res1 % 50;
		ndez = res2 / 10;
		res3 = res2 % 10;
		ncinc = res3 / 5;
		res4 = res3 % 5;
		num = res4 / 1;
							
					
		// Saída
		System.out.print("Notas de 100: ");
		System.out.println(ncem);
		System.out.print("Notas de 50: ");
		System.out.println(ncinq);
		System.out.print("Notas de 10: ");
		System.out.println(ndez);
		System.out.print("Notas de 5: ");
		System.out.println(ncinc);
		System.out.print("Notas de 1: ");
		System.out.println(num);
	}

}
