package repeticaoexercicio17;

public class repeticaoexercicio17 {

	public static void main(String[] args) {
		
		System.out.print("Soma dos quadrado");
		
		int soma = 0;
		
		for(int i = 1 ; i  <=100 ; i++) {
			
			int quadrado = i*i;
			soma += quadrado ;
			System.out.println("Número "+ i + " quadrado " + quadrado);
		}
		
		
		System.out.print(" Soma total " + soma);
	}

}
