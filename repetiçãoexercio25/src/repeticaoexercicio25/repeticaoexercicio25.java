package repeticaoexercicio25;
import java.util.Scanner;

public class repeticaoexercicio25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		   
		System.out.println(" Descubra o maior e o segundo maior número");
		
		
		
		System.out.print("Escolha o primeiro número ");
		int maior = scanner.nextInt();
		int segundomaior = maior;
		
		for(int i =2 ; i <= 10 ; i++) {
			
			System.out.print("Escolha o proximo número  "+ i);
			int numeroatual = scanner.nextInt();
			
			
			
			if (numeroatual > maior ) {
				
				segundomaior =maior;
				maior = numeroatual;
			}
			
			else if (numeroatual > segundomaior ) {
				
				segundomaior = numeroatual;
			}
			
			
			
		}
		System.out.println("Maior número: " + maior);
        System.out.println("Segundo maior número: " + segundomaior);

	}

}
