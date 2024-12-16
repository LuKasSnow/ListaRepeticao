package repetiçãoexercicio11;
import java.util.Scanner;
public class repetiçãoexercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
			
			
		for ( int i=1; i <=10 ; i++) {
			
			
			System.out.print("digite um número " + i + ":");
			double numero = scanner.nextDouble();
			double metade = numero / 2.0;
			System.out.println("A metade de " + numero + " é " + metade);

			
			
		}
		 scanner.close();
	}

}
