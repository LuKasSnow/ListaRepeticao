package repeticaoexercicio27;
import java.util.Scanner;
public class repeticaoexercicio27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		  System.out.println("Mutlipos de 5 e 3");
             
		  System.out.println("Digite o intervalo desejado");
		  int intervalo = scanner.nextInt();
		
		  
		  for (int i  = 1 ; i  <= intervalo ; i ++) {
			  
			  if (i%3==0 && i%5==0  ) {
				  System.out.println(i + " é múltiplo de 3 e 5 ao mesmo tempo.");
				 			  }
			  
			   
				  
			  }
			 
		  }
	}


