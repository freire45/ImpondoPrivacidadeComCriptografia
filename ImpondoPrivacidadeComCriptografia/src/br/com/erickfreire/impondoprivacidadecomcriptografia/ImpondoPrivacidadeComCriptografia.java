package br.com.erickfreire.impondoprivacidadecomcriptografia;

import java.util.Scanner;

/**
 * Programa em Java com criptografia
 * @author Erick Freire
 * @version 1 - Criado em 13-04-2021 as 14:24
 */

public class ImpondoPrivacidadeComCriptografia {
	public static void main(String[] args) {
		
		int numero;
		int val1;
		int val2;
		int val3;
		int val4;
		int aux;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que criptografa um valor de 4 digitos:");
		
		System.out.print("Informe um valor: ");
		numero = entrada.nextInt();
		
		while(numero < 1000) {
			System.out.print("Valor Muito Pequeno, digite novamente: ");
			numero = entrada.nextInt();
		}
		
		while(numero > 9999) {
			System.out.print("Valor Muito Grande, digite novamente: ");
			numero = entrada.nextInt();
		}
		
		if(numero < 10000 & numero > 999) {
			val1 = numero / 1000;
			val2 = (numero % 1000) / 100;
			val3 = (numero % 100) / 10;
			val4 = (numero % 10) / 1;
			
			val1 = val1 + 7;
			val2 = val2 + 7;
			val3 = val3 + 7;
			val4 = val4 + 7;
			
			val1 = val1 % 10;
			val2 = val2 % 10;
			val3 = val3 % 10;
			val4 = val4 % 10;
			
			aux = val1;
			val1 = val3;
			val3 = aux;
			
			aux = val2;
			val2 = val4;
			val4 = aux;
			
			System.out.printf("O valor encriptografado é de: %d%d%d%d%n", val1, val2, val3, val4);
			
		}
		
		
		
		
		
	}

}
