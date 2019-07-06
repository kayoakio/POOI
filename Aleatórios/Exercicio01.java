/*1 - Escreva uma aplicação em Java que tenha como entrada a idade e nome de um jogador de futebol. 
Classifique esse jogador como infantil( 5 a 10 anos), Juvenil( de 11 a 17 anos) e adulto (de 18 anos acima). 
Mostre ao final o nome o jogador e sua categoria.*/

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args){

	//Variáveis
	String nome;	
	int idade; 
	
	Scanner leitura = new Scanner (System.in);

	System.out.print("Jogador(a): "); nome = leitura.nextLine();
	System.out.print("Idade: "); idade = leitura.nextInt();

		if (idade >= 5 && idade <= 10){
			System.out.println (nome + " é infantil.");
		} else 
		if (idade >= 11 && idade <= 17){
			System.out.println (nome + " é juvenil.");		
		} else 
		if (idade >= 18){
			System.out.println (nome + " é adulto(a).");		
		} else {
			System.out.println (nome + " é muito novo.");
		}

	} //fechamento do main

} //fechamento da classe
