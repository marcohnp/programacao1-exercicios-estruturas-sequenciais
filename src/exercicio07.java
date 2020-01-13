import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// Declarações
		Scanner teclado = new Scanner(System.in);
		double s, r, p, sn;
		
		
		//Entrada
		System.out.print("Digite o salário atual: ");
		s = teclado.nextDouble();
				
		System.out.print("Digite o percentual de ajuste: ");
		p = teclado.nextDouble();
		
		// Processamento
		r = p / 100;
		sn = s + (s * r);
		
		// Saída
		System.out.print("Novo salário é: ");
		System.out.print(sn);
		
		
				
		
	
	}

}
