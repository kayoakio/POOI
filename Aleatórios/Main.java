import java.util.Scanner;
import java.lang.*;

class Ex{

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

/*método para receber como argumento um número inteiro e mostra todos os números primos
menores (utilize o método do exercício 1).*/
	public static int ajuda (int x){

			int i, cont = 0;

			for (i = 1; i <= x; i++){
				if (x % i == 0)
					cont++;
			}

		return cont;
	}

	public static void primos (int x){

		int aux = 2;

		while (aux < x){

			int resul = ajuda(aux);

			if (resul == 2){
				System.out.println(aux);
			}

			aux++;
		}
	}

/*Um método que recebe como argumento um número inteiro e 
retorne uma true caso esse número seja um número perfeito e false caso contrário.*/

	public static boolean perfeito(int x){

		int soma = 0, i;

		for (i = 1; i < x; i++){

			if(x % i == 0)
				soma += i;
		}

		if (soma == x)
			return true;
		else
			return false;
	}

/*Um método que receba como argumento dois valores inteiros e 
retorne o Máximo Divisor Comum dos dois.*/

	public static int mdc (int x, int y){

		int resto;

		do{

			resto = x % y;

			x = y;
			y = resto;

		} while(resto != 0);

		return x;
	}
}

public class Main{
	public static void main(String[] args){

	}
}