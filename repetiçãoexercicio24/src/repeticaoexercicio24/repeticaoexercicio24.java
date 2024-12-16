package repeticaoexercicio24;
import java.util.Scanner;
public class repeticaoexercicio24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ler o  menor e o  maior número ");
		
		System.out.println(" Escolha a quantidade de número");
		int quantidade = scanner.nextInt();
		
		System.out.print("Escolha o primeiro número	");
		int num1 = scanner.nextInt();
		int num2 = num1;
		
		for(int i =2 ; i<= quantidade ; i++) {
			
			System.out.print("Escolha o proximo número " + i + " : ");
			int num = scanner.nextInt();
			
			
			if (num < num1)
			{
				num1 = num;
			}
			
			 if (num >num2) {
				
				num2 =num;
			}
				
					
			}
		
             
				System.out.print("O menor  numero é "+ num1 +" o maior numero" + num2  );
			
			
			
			
			
		

	}

}
