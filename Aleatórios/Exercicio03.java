/* 3 – Escreva uma aplicação em Java que tenha como entrada um número inteiro N, 
some todos os números inteiros de 1 a N, e mostre o resultado obtido. */

import java.util.Scanner;

public class Exercicio03{

	public static void main(String[] args) {

		//Variáveis
		int n, resultado = 0;

		Scanner leitura = new Scanner (System.in);
		
		System.out.print("Digite N: "); n = leitura.nextInt();

		while (n != 0){

			resultado += n;

			n--;
		}

		System.out.println ("Soma: " + resultado);
		
	} //fechamento do main
} //fechamento da classe