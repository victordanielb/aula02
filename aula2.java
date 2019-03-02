package aula2;

public class aula2 {
	
	public static void main (String[]args) {
		double gaso =3.15;
		double alco =2.15;
		double valor =0;
		valor = gaso * 0.77;
		
		if(valor > alco) {
			System.out.println("Alcool é Melhor");
		}
		else if (valor > gaso) {
			System.out.println("Gasolina é Melhor");
		}
		else {
			System.out.println("Gasolina e Alcool sao iguais");
		
		}
}
}

