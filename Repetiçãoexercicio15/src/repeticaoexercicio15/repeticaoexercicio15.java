package repeticaoexercicio15;
import java.util.Scanner;

public class repeticaoexercicio15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		 System.out.println(" Programa que ler  logaritmo de  um número na base 10");
		 
		 for (int i = 1 ; i <=8 ; i++) {
			 
			 System.out.println(" Digite o número "  +  i );
			 double numero = scanner.nextDouble();
			 
			 if (numero >0) 
			 {
			double log = Math.log10(numero);
			
			System.out.printf ("O resultado do logaritmo de " + (int) numero + " é   %.2f\n " , log);
			 }
			 
			 else {
				 System.out.println("Número inválido! O logaritmo só pode ser calculado para números positivos");
			 }

		 }

	}

}
