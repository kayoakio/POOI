import java.util.Scanner;
import java.lang.*;

public class Ex1{

/*Método para calcular e retornar a potencia de 2 números (x, y) se ambos os números for inteiros, 
deve-se escrever um novo método utilizando alguma estrutura de controle, se um ou ambos os argumentos 
for double pode utilizar a classe Math para calcular a potenciação.*/

	public static int potencia (int x, int y){
		
		int i, aux = 1;

		for (i = 0; i < y; i++)
			aux *= x;

		return aux;
	}

	public static double potencia (int x, double y){
		return Math.pow (x, y);
	}

	public static double potencia (double x, int y){
		return Math.pow (x, y);
	}

	public static double potencia (double x, double y){
		return Math.pow (x, y);
	}

/*Método para receber como argumento um número inteiro e 
retornar uma mensagem dizendo se o valor é primo ou não.*/

	public static void primo (int x){

		if (x >= 2){
			int i, cont = 0;

			for (i = 1; i <= x; i++){
				if (x % i == 0)
					cont++;
			}

			if (cont == 2)
				System.out.println ("O número é primo.");
			else 
				System.out.println ("O número não é primo.");
		} 
		else {
			System.out.println ("Digite um valor maior ou igual a 2");
		}

	}

/*Método que receba dois pontos no espaço euclideano e 
retorne a distância entre eles.*/

	public static double distancia (int xa, int ya, int xb, int yb){

		int x = xa - xb; 
		int y = ya - yb;

		double resultado = Math.pow(x,2) + Math.pow(y,2);
		
		return Math.sqrt(resultado);

	}
}
