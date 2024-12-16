package repetiçãoexercico12;
import java.util.Scanner;

public class repetiçãoexercicio12 {

	public static void main(String[] args) {

               Scanner scanner = new Scanner (System.in);
               
               for (int i =1 ; i <=10 ; i++) {
               
               System.out.println("Digite um número " + i + ":");
               int numero = scanner.nextInt();
               int quadrado = numero * numero;
                
              System.out.println("o quadrado do numero " + numero + " é :" + quadrado);
               
               }
               scanner.close();
	}
      
}
