package caixeiroviajante;

import java.io.*;

public interface CaixeiroInterface{

    //Número de Cidades
    public abstract int verificacao();
    
    //Criar um Objeto Caixeiro
    //Leitura de Arquivo
    public abstract void criar(String caminho) throws IOException;
    
    //Mostrar
    public abstract void mostrar();
    
    //Distância entre duas(2) cidades
    public abstract double distancia(int cidade1, int cidade2) throws CidadeInvalida;
    
    //Retorna a cidade mais próxima
    public abstract int proxima(int cidade) throws CidadeInvalida;
    
} //CaixeiroInterface