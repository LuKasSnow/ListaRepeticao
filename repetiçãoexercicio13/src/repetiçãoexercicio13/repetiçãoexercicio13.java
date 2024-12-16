package repetiçãoexercicio13;
import java.util.Scanner;
public class repetiçãoexercicio13 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner (System.in);
		  System.out.println("Este programa calcula o cubo de 10 números inteiros.");

		  
		  for (int i = 1 ;i <=10 ; i++) {
			  
			 System.out.println("Digite o número " + i);
			 int numero = scanner.nextInt();
			 int cubo = numero * numero * numero;
			 System.out.println( + i + " O cubo no número " + numero + " = " + cubo);
		  }
       scanner.close();
	}

}
