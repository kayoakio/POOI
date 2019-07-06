package caixeiroviajante;

import java.io.*;

public abstract class CaixeiroAbstrato{
    
    //Número de Cidades
    private int n; 
    
    //Construtor
    CaixeiroAbstrato(int n){
        
        setN(n);
        
    }
    
    //GetN
    protected int getN(){
        
        return n;
        
    }
    
    //Set
    protected final void setN(int n){
        
        this.n = n;
        
    }
    
    //Métodos 
    public int verificacao(){
        
        return getN();
        
    }
    
    //Override
    public abstract void criar(String caminho) throws IOException;
    public abstract double distancia(int cidade1, int cidade2) throws CidadeInvalida;
    public abstract int proxima(int cidade) throws CidadeInvalida;
    public abstract void mostrar();
    
} //CaixeiroAbstrato