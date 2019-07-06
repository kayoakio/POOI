package caixeiroviajante;

import java.util.*;

public class CaixeiroPOS extends CaixeiroAbstrato{
    
    //Posição no Plano
    private final double[][] pos;
    
    CaixeiroPOS(int n, double[][] pos){
        
        super(n);
        this.pos = pos;
        
    }

    @Override 
    public void mostrar(){
        
        for (int i = 0; i < getN(); i++){
            for (int j = 0; j < 2; j++){
                System.out.print(pos[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    @Override
    public double distancia(int cidade1, int cidade2) throws CidadeInvalida {

        double xfinal, yfinal, d;
        
        xfinal = pos[cidade1][0] - pos[cidade2][0]; //x(cidade1) - x(cidade2)
        yfinal = pos[cidade1][1] - pos[cidade2][1]; //y(cidade1) - y(cidade2)
        
        xfinal = Math.pow(xfinal, 2); //xx
        yfinal = Math.pow(yfinal, 2); //yy
        
        d = xfinal + yfinal;
        d = Math.sqrt(d);
                
        return d;
    }
    
    @Override 
    public int proxima(int cidade) throws CidadeInvalida{
        
        int prox = cidade;        
        double[] distancias = new double[getN()];
        double menorvalor = 1000.0;
        
        for (int i = 0; i < getN(); i++){
            
            distancias[i] = distancia(cidade, i);
            
        }
        
        for (int i = 0; i < getN(); i++){
            
            if ((distancias[i] != 0) && (distancias[i] < menorvalor)){
                
                prox = i;
                menorvalor = distancias[i];
                
            }
            
        }
        
        return prox;
    }
    
    @Override
    public void criar(String caminho){    
    }
    
} //CaixeiroPOS
