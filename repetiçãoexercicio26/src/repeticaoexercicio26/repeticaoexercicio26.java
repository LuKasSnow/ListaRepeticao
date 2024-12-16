package repeticaoexercicio26;
import java.util.Scanner;

public class repeticaoexercicio26 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
		 
		   System.out.print("Digite o limite inferior");
		   int limiteinferior = scanner.nextInt();
		   
		   System.out.print("Digite o limite superior");
		   int limitesuperior = scanner.nextInt();
		   int soma = 0;
		   
		   if (limitesuperior < limiteinferior) {
			   
			   System.out.print("O primeiro número  deve ser maior que o segundo número");
		   }
		   
		   else {
		   for (int i = limiteinferior +1 ; i < limitesuperior; i++ ) {
			   
			   if( i % 2==0) {
				   System.out.println("Número pares " +i);
				   soma += i;
			   }
			   
		   }
		   
		   System.out.print("Soma dos número pares " + soma);
		   scanner.close();
	}
		   
	}
}
