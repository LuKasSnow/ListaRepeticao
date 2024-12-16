package repeticaoexercicio21;
import java.util.Scanner;

public class repeticaoexercicio21 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.print("Digite a quantidade de números: ");
		 int num = scanner.nextInt();
		 
		 System.out.print("Digite o número 1: ");
		 int maior = scanner.nextInt();
		 
		 for (int i = 2; i <= num; i++) {
			    System.out.print("Digite o número " + i + ": ");
			    int numero = scanner.nextInt();
			    if (numero > maior) {
			        maior = numero;
			    }
			   
			}
		 System.out.println("O maior número é: " + maior);
	}

}
