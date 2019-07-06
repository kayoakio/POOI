/*5 - Escreva uma aplicação em Java que tenha como entrada um número decimal X e um
inteiro Y, calcule e mostre a potência X ^ Y.*/

import java.util.Scanner;

public class Exercicio05{
	
	public static void main(String[] args){

		//Variáveis
		float x, aux = 1; int y, i;

		Scanner leitura = new Scanner (System.in);

		System.out.print ("Digite X (float): ");   x = leitura.nextFloat();
		System.out.print ("Digite Y (inteiro): "); y = leitura.nextInt();

		for (i = 0; i < y; i++){
			aux *= x;
		}

		System.out.println ("X ^ Y : " + aux);

	} //fechamento do main
} //fechamento da class