/*
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
package br.com.generation0306;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		
		int x, i, c, maior = 0;
		
		System.out.println("Digite um Primeiro N�mero");
		x = entrada.nextInt();
		
		System.out.println("Digite um Segundo N�mero");
		i = entrada.nextInt();
		
		System.out.println("Digite um Terceiro N�mero");
		c = entrada.nextInt();
		
		if(x > i && x > c)  {
			
			maior = x;
			
			System.out.println("Primeira Resposta e Maior !!");
		} 
		else if (i > x && i > c ) {
			
			maior = i;
			System.out.println(" Segunda Resposta e a Maior !!");
		}
		else if (c > x && c > i) {
			
			maior = c;
			System.out.println("Teceira Resposta e a Maior !!");
		}
		
		System.out.println("Resultado: " + maior);

	}

}
