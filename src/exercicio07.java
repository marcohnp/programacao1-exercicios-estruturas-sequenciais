import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// Declara��es
		Scanner teclado = new Scanner(System.in);
		double s, r, p, sn;
		
		
		//Entrada
		System.out.print("Digite o sal�rio atual: ");
		s = teclado.nextDouble();
				
		System.out.print("Digite o percentual de ajuste: ");
		p = teclado.nextDouble();
		
		// Processamento
		r = p / 100;
		sn = s + (s * r);
		
		// Sa�da
		System.out.print("Novo sal�rio �: ");
		System.out.print(sn);
		
		
				
		
	
	}

}
