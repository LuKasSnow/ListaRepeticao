package repeticaoexercicio19;

public class repeticaoexercicio19 {

	public static void main(String[] args) {
		System.out.println("soma total dos cuboc");
		
		
		int soma = 0;
		
		for(int i = 1 ; i <=100 ; i++) {
			  
			int  cubo = i*i*i;
			soma += cubo;
			System.out.println(" Núumero " + i + " Cubo " + cubo);
		
		}
		System.out.println("A soma total dos cubos é "  + soma);
	}

}
