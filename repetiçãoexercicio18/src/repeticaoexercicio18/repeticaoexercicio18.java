package repeticaoexercicio18;

public class repeticaoexercicio18 {

	public static void main(String[] args) {
		
		double soma = 0;
		System.out.println(" Soma da metade de 100 numero ");
		for(int i =1 ; i <=100 ;i++) {
			
			
			
			double metade = i/2.0;
			
			soma += metade;
			System.out.println("Número " + i +  " metade " + metade);
		}
		
		System.out.println("O total da metade " + soma);
	}

}
