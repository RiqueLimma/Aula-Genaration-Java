package br.com.generation0306;

import java.util.Scanner;

public class OrdemIdade {

	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite Sua Idade");
		idade = entrada.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Infantil");
		}
		
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		} 
		
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Adulto");
		} 
		
		System.out.println("Bem Vindo a Formatura da Generation !! ");
		
	}

}
