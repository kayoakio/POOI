/*4 - Escreva uma aplicação em Java que tenha como entrada um número inteiro X qualquer,
calcule e mostre o fatorial de X.*/

import java.util.Scanner;

public class Exercicio04{

	public static void main (String[] args){

		//Variáveis
		int x, fatorial = 1;

		Scanner leitura = new Scanner (System.in);

		x = leitura.nextInt ();

		while (x != 0){

			fatorial *= x;

			x--;
		}

		System.out.println ("Fatorial: " + fatorial);

	} //fechamento do main

} //fechamento da class