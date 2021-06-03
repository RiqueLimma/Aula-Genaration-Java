/*
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
package br.com.generation0306;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		
		int x, i, c, maior = 0;
		
		System.out.println("Digite um Primeiro Número");
		x = entrada.nextInt();
		
		System.out.println("Digite um Segundo Número");
		i = entrada.nextInt();
		
		System.out.println("Digite um Terceiro Número");
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
