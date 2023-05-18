package principal;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double dolar = 5.14;
		System.out.println("Digite o valor que quer converter em dolar");
		dolar = sc.nextDouble();
		sc.close();
		double numero2= 5.14;
		calculo(dolar, numero2);
	}

	static void calculo (double dolar, double m) {
		System.out.println("O resultado da converção é : US$ " +( m * dolar));
		//int resultado = n + m;
	}
}
