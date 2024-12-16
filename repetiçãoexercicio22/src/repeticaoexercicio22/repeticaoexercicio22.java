package repeticaoexercicio22;
import java.util.Scanner;

public class repeticaoexercicio22 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner (System.in);
		  
		  System.out.println(" Leia um Número e imprimar o maior ");
		  
		  System.out.print(" a quantitade de numero ");
		  int num = scanner.nextInt(); // aqui  seria a quantidade de numero  escolhido 
		  
		  System.out.print(" Digite  número 1 :");
		  int maior = scanner.nextInt();
		  
		  for ( int i=2 ;i <=num ; i++) { //  esse num  seria tipo  <=100
			  
			  System.out.print(" Digite numero  " + i + " : ");
			  int numero = scanner.nextInt();
			  
			  if (numero > maior) {
				  
				  maior = numero;
			  }
			  
			 
		  }
		   System.out.println("O maior número é: " + maior);
		  
	}

}
