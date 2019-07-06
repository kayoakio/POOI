public class Fatura{
	
	private int numeroFatura;
	private int quantidadeComprada;
	private String descricao;
	private float precoPorItem;

	//Construtor Fatura

	public void setNumeroFatura(int num){
		numeroFatura = num;
	}

	public void setQuantidade (int qtd){
		quantidadeComprada = qtd;
	}

	public void setDescricao (String desc){
		descricao = desc;
	}

	public void setPrecoItem (float precoNovo){
		precoPorItem = precoNovo;
	}

	//Gets

	public static void main(String[] args) {
		System.out.println("Opa");
	}
}

//classe pra testar a classe Fatura