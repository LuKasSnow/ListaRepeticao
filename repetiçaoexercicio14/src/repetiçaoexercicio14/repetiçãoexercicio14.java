package repetiçaoexercicio14;
import java.util.Scanner;

public class repetiçãoexercicio14 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
		 
          for (int i= 1 ; i <= 15 ; i++) {
        	  
        	  System.out.println("Digite o número " + i  );
        	  double numero = scanner.nextDouble();
        	  double raiz = Math.sqrt(numero);
        	  
        	  System.out.printf(" A raiz quadrada de " + (int)  numero + "  é %.2f\n  " , raiz  );
        	  

          }
          
          scanner.close();
	}

}
