package repeticaoexercicio23;
import java.util.Scanner;

public class repeticaoexercicio23 {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner (System.in);
		
		System.out.println(" imprime o menor número");
		
		System.out.print("Escolha a quantidade de número ");
		int quant = scanner.nextInt();
		
		System.out.print("Escolha o primeiro Número  1: ");
		int primeiro = scanner.nextInt();
		
		for (int i=2 ; i<=quant ; i++) {
			
			System.out.print("Escolha o proximo número   " + i + ":" );
			int numero = scanner.nextInt();
			
			if(numero < primeiro) {
				primeiro = numero;
			}
		}
		
		System.out.print( "O menor número é "  + primeiro );

	}

}
