package caixeiroviajante;

import java.io.*;

public class Main{
    
    public static void main (String[] args) throws IOException{
        
        //Criar Caixeiro
        Caixeiro novo;
        novo = new Caixeiro();
        
        /*  Definir caminho do arquivo.
            File1 - MA
            File2 - POS     
        */
        String caminho;
        caminho = "D:\\Faculdade\\Trabalho Final - POO\\Version1\\arquivos\\arquivo2.txt";
        
        //Chamar os Métodos
        novo.criar(caminho);
        System.out.println(novo.verificacao());
        novo.mostrar();

        try{
            novo.distancia(0,5);
            novo.proxima(6);
        } catch (CidadeInvalida e) {
            System.out.println(e.toString());
        }
        
    }
    
}