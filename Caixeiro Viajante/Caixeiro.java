package caixeiroviajante;

import java.io.*;

public class Caixeiro implements CaixeiroInterface{
    
    //Referência para CaixeiroAbstrato
    CaixeiroAbstrato caixeiro;
    
    //Número de Cidades
    @Override
    public int verificacao(){
        
        return caixeiro.verificacao();
        
    }
    
    //Criar um Objeto Caixeiro
    //Leitura de Arquivo
    @Override
    public void criar(String caminho) throws IOException{
        
        String linha; String[] split;
        int n, j = 0;
        double[][] tipo;
        
        //Abrir Arquivo
        BufferedReader arquivo; 
        arquivo = new BufferedReader(new FileReader(caminho));
        
        linha = arquivo.readLine();
        n = Integer.parseInt(arquivo.readLine());
        
        System.out.println(linha);
        
        if(linha.equals("MA")){
            
            tipo = new double[n][n];
            
            while (arquivo.ready()){
            
                linha = arquivo.readLine();
                split = linha.split(" ");
                
                for(int i = 0; i < n; i++){
                    
                    tipo[j][i] = Double.parseDouble(split[i]);
                    
                }
                
                j++;
                
            }
            
            //Contruir um Caixeiro MA
            caixeiro = new CaixeiroMA(n, tipo);
        
        } else if (linha.equals("POS")){
            
            tipo = new double[n][2];
            
            while (arquivo.ready()){
            
                linha = arquivo.readLine();
                split = linha.split(" ");
                
                for(int i = 0; i < 2; i++){
                    
                    tipo[j][i] = Double.parseDouble(split[i]);
                    
                }
                
                j++;
                
            }

            //Construir um Caixeiro POS
            caixeiro = new CaixeiroPOS(n, tipo);
            
        }
        
        //Fechamento do Arquivo 
        arquivo.close();
        
    }
    
    //Mostrar
    @Override
    public void mostrar(){
        
        caixeiro.mostrar();
        
    }
    
    //Distância entre duas(2) cidades
    @Override
    public double distancia(int cidade1, int cidade2){
        
        double d;
        d = caixeiro.distancia(cidade1, cidade2);
        System.out.println("Distância entre " + cidade1 + " e " + cidade2 + ": " + d);
        return d;
        
    }
    
    //Retorna a cidade mais próxima
    @Override
    public int proxima(int cidade){
        
        int prox;
        prox = caixeiro.proxima(cidade);
        System.out.println("Cidade mais próxima de " + cidade + ": " + prox);
        return prox;
        
    } 
    
    
} //CaixeiroConcreto