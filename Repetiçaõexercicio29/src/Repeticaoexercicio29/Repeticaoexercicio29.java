package Repeticaoexercicio29;
import java.util.Scanner;

public class Repeticaoexercicio29 {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		
		
            System.out.println(" quantos numero maior que 30 entre  15 número");
            int contador30 =0;
            for (int i = 1 ; i<=15 ; i++) {
            	
            	System.out.print("Digite o primeiro número " + i + ":");
            	int numeros = scanner.nextInt();
            	
            	if(numeros >=30) {
            		
            		contador30++;
            		
            		
            	}
            	
            }
            System.out.print( "Existem " + contador30 + " Numero maior do que 30 ");
            scanner.close();
	}

}
