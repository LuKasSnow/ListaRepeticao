package Repeticaoexercicio30;
import java.util.Scanner;

public class Repeticaoexercicio30 {

	public static void main(String[] args) {
	   Scanner scanner = new Scanner (System.in);
		System.out.println("Soma de positivo - total de negativo");
	        int soma =0;
	        int negativocontador = 0;
	
		  for(int i = 1 ; i <=20 ; i++) {
			 System.out.print("Entre com os 20 número "  +i + ":");
			 int numero = scanner.nextInt();
			 if (numero>0) {
				 
				 soma += numero;
			 }
			 else	if(numero<0) {
			 		negativocontador ++;
			 	}	 
		
		  }
		    System.out.print("A soma  total dos positivo " +soma);
		    System.out.print( " a quantidade de negativo " +negativocontador);
	}

}
