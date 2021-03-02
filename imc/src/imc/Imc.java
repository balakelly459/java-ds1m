package imc;

public class Imc {

	public static void main(String[] args) {
	
		float peso;
		float altura;
		float imc;
		
		peso = 51;
		altura = 1.65f;
		
		imc = peso / (altura * altura);
		
		System.out.print(imc);
			
		
	}	
	
}
