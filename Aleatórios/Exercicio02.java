/* 2 – Escreva uma aplicação em Java que tenha como entrada uma lista de números inteiros positivos terminada pelo número 0 (zero). 
Ao final, o algoritmo deve mostrar a média aritmética de todos os números lidos (excluindo o zero). 
Números negativos devem ser descartados. */

import java.util.Scanner;

public class Exercicio02{

	public static void main(String[] args){

		//Variáveis
		int cont = 0, somafinal = 0, valor;
		float media;
		
		Scanner leitura = new Scanner(System.in);

		do{

			valor = leitura.nextInt();

			if (valor != 0){
			
				somafinal += valor; 
				cont++;

			}

		} while (valor != 0);

		media = somafinal / cont;

		System.out.println ("\nSoma Final: " + somafinal);
		System.out.println ("Quantidade de Números: " + cont);	
		System.out.println ("Média: " + media);
		
	} //fechamento do main

} //fechamento da class
