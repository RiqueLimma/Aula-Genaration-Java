package br.com.generation0306;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main (String [] args) {
	
		Scanner entrada  = new Scanner(System.in);
	
	int n1, n2, n3, maior = 0;
	
	System.out.println("Digite um Primeiro Número");
	n1 = entrada.nextInt();
	
	System.out.println("Digite um Segundo Número");
	n2 = entrada.nextInt();
	
	System.out.println("Digite um Terceiro Número");
	n3 = entrada.nextInt();


	if (n1 < n2 && n2 < n3) {
			System.out.println(n1+"\n"+n2+"\n"+n3);
		}
		 if ( n2< n3 && n1 <n3) {
			System.out.println(n2+"\n"+n1+"\n"+n3);
		}
		else if (n3 < n1 && n1 < n2) {
			System.out.println(n2+"\n"+n3+"\n"+n1);
			}
		}

}


