import java.util.Scanner;
import java.lang.*;

public class Ex2{

/*método para receber como argumento um número inteiro e mostra todos os números primos
menores (utilize o método do exercício 1).*/
	public static int primo (int x){

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

			int resul = primo(aux);

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
