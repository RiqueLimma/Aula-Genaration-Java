package br.com.generation0306;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main (String [] args) {
	
		Scanner entrada  = new Scanner(System.in);
	
	int x, i, c, maior = 0;
	
	System.out.println("Digite um Primeiro Número");
	x = entrada.nextInt();
	
	System.out.println("Digite um Segundo Número");
	i = entrada.nextInt();
	
	System.out.println("Digite um Terceiro Número");
	c = entrada.nextInt();


	if (x < i) {
		if ( i < c) {
			System.out.println(x+"\n"+i+"\n"+c);
		}
		
		else if(x < i) {
			System.out.println(x+"\n"+c+"\n"+i);
		} else {
			System.out.println(c+"\n"+x+"\n"+i);
			}
		}
	
		else if ( i< c) {
		if (x <c) {
			System.out.println(i+"\n"+x+"\n"+c);
		}
		else {
			System.out.println(i+"\n"+c+"\n"+x);
			}
		}

	}
}

