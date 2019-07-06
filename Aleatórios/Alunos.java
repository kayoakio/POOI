import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;


class TAlunos{

	private String nomeA;
	private String cursoA;
	private ArrayList <String> telefones = new ArrayList<String>();
	private float[] notas = new float[5];

	public void inputNotas(){

		Scanner leitura = new Scanner(System.in);
	
		for (int i = 0; i < 5; i++)
			notas[i] = leitura.nextFloat();

	}

	public void inputTelefones(){

		Scanner leitura = new Scanner(System.in);

		for (String i: telefones)
			System.out.println(i);
	}

	public void adicionarTelefone(String telNovo){
		telefones.add(telNovo);
	}

	public void eliminarTelefone(String tel){
		telefones.remove(tel);
	}

	public void alterarNota(int indice, float novaN){
		notas[indice] = novaN;
	}
}

public class Alunos{

	public static void main(String[] args){

	}

}


