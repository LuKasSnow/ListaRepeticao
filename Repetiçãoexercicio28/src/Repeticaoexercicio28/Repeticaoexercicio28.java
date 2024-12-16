package Repeticaoexercicio28;

public class Repeticaoexercicio28 {

	public static void main(String[] args) {
		 
		System.out.println("Ler 200 número e determina quantos são pare e quantos são impares");
		 int par =0;
		 int impar=0;
		for(int i= 1 ; i <=200 ; i++) {
			
			if(i%2==0) {
				par ++;
				 
			}
			else {
				impar ++;
				}
			
			
			}
		 System.out.println("Total de números pares: " + par);
	        System.out.println("Total de números ímpares: " + impar);
		
	}

}
