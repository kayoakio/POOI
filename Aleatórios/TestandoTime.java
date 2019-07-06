import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;

class Jogador{

	private String nome;
	private Float salario;
	private Float luvas;
	private String telefone;

	//Sets()

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setSalario(Float salario){
		this.salario = salario;
	}

	public void setLuvas(Float luvas){
		this.luvas = luvas;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

	//Gets()

	public String getNome(){
		return nome;
	}

	public Float getSalario(){
		return salario;
	}

	public Float getLuvas(){
		return luvas;
	}

	public String getTelefone(){
		return telefone;
	}

	//Retornar o Salario Total
	public Float getValorReceber(){
		return (salario + luvas);
	}
}

class Time{

	private String nome;
	private String dataCriacao;
	private ArrayList<Jogador> Jogadores = new ArrayList<Jogador>();

	//Sets()
	public void setNome(String nome){
		this.nome = nome;
	}

	public void setDataCriacao(String dataCriacao){
		this.dataCriacao = dataCriacao;
	}

	//Gets()
	public String getNome(){
		return nome;
	}

	public String getDataCriacao(){
		return dataCriacao;
	}

	//Outras funções
	public int getQtdJogador(){

		int qtd = Jogadores.size();

		return qtd;
	}

	public void listarJogadores(){

		for (Jogador i : Jogadores){
			System.out.println(i.getNome());
			System.out.println(i.getSalario());
			System.out.println(i.getLuvas());
			System.out.println(i.getTelefone());
		}

	}

	public void adicionarJogador(Jogador jog){

		Jogadores.add(jog);
	
	}

	public void removerJogador(Jogador jog){

		Jogadores.remove (jog);

	}

	public float getFolhaPagamento(){
		
		float somatotal = 0;

		for(Jogador i: Jogadores)
			somatotal = somatotal + i.getValorReceber();

		return somatotal;
	}		

}

public class TestandoTime{

	public static void main(String[] args){

	Time primeiro = new Time();
	Jogador ele = new Jogador();
	Jogador ela = new Jogador();

	ele.setNome("Deise");
	ele.setSalario(30.00f);
	ele.setLuvas(300.00f);
	ele.setTelefone("38999889989");

	primeiro.adicionarJogador(ele);

	ela.setNome("Sula");
	ela.setSalario(30.00f);
	ela.setLuvas(300.00f);
	ela.setTelefone("38999889989");

	primeiro.adicionarJogador(ela);

	//primeiro.removerJogador(ela);

	primeiro.listarJogadores();

	float folha =  primeiro.getFolhaPagamento();

	String mostrar = "Folha de Pagamento: " + folha;

	System.out.println(mostrar);

	}
}