package br.com.generation0306;

import java.util.Scanner;

public class ImparPar {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	double a = 0.0;
	
	
	System.out.println("Insira a Primeira N�mero: ");
	a = leia.nextInt();
	
	
	
	if(a%2==0) {
		
		
		System.out.println("� par\n" + a);
		System.out.println(Math.sqrt(a));
		
	
	}else {

		a = Math.pow(a, 2);
		
		System.out.println("� impar\n" + a);
		
	}
	
	
	
	}
}
