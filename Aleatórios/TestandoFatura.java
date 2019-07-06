import java.util.Scanner;

class Fatura{
	
	private int numeroFatura;
	private int quantidadeComprada;
	private String descricao;
	private float precoPorItem;

	public void setNumeroFatura(int num){
		numeroFatura = num;
	}

	public void setQuantidade(int qtd){
		quantidadeComprada = qtd;
	}

	public void setDescricao (String desc){
		descricao = desc;
	}

	public void setPrecoItem (float precoNovo){
		precoPorItem = precoNovo;
	}

	public float getPrecoItem(){
		return precoPorItem;
	}

	public int getNumeroFatura(){
		return numeroFatura;
	}

	public int getQuantidade(){
		return quantidadeComprada;
	}

	public String getDescricao(){
		return descricao;
	}

	public float getTotalFatura(){
		return (precoPorItem * quantidadeComprada);
	}

	public Fatura(){

		Scanner leitura = new Scanner (System.in);

		System.out.print("\nNúmero da Fatura: ");
		setNumeroFatura(leitura.nextInt());

		System.out.print("Quantidade Comprada: ");
		setQuantidade (leitura.nextInt());

		leitura.nextLine();

		System.out.print("Descrição: ");
		setDescricao(leitura.nextLine());

		System.out.print("Preço por Item: ");
		setPrecoItem(leitura.nextFloat());
	}
}

public class TestandoFatura{

	public static void main(String[] args){

		Fatura f1 = new Fatura();

		System.out.println ("\nFatura Final");
		System.out.println ("Fatura : " + f1.getNumeroFatura());
		System.out.println ("Quantidade: " + f1.getQuantidade());
		System.out.println ("Descrição: " + f1.getDescricao());
		System.out.println ("Preço por Item: " + f1.getPrecoItem());
		System.out.println ("Total: " + f1.getTotalFatura());

	}

}