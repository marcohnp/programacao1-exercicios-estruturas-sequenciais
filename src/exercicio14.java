import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos kg preciso para o churrasco? ");
		System.out.println("Quanto cada convidado vai consumir em média? ");
		System.out.println("Homens 650g, mulheres 420g, crianças 290g.");
		// Declarações
		int h, m, c, res1, res2, res3;
		double resfg, resfk;
		
		// Entrada
		System.out.print("Quantos convidados homens? ");
		h = teclado.nextInt();
		System.out.print("Quantos convidadas mulheres? ");
		m = teclado.nextInt();
		System.out.print("Quantos convidados crianças? ");
		c = teclado.nextInt();
		
		// Processamento
		res1 = h * 650;
		res2 = m * 420;
		res3 = c * 290;
		resfg = res1 + res2 + res3;
		resfk = resfg / 1000;
		
		// Saida
		System.out.print("Quantos kg de carne será preciso para o churrasco? ");
		System.out.print(resfk + "kg");
		
		

	}

}
