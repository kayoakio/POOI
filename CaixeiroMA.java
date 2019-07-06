package caixeiroviajante;

public class CaixeiroMA extends CaixeiroAbstrato{
    
    //Matriz de Adjacência 
    private final double[][] ma;
    
    CaixeiroMA(int n, double[][] ma){
        
        super(n);
        this.ma = ma;
        
    }
    
    @Override 
    public void mostrar(){
        
        for (int i = 0; i < getN(); i++){
            for (int j = 0; j < getN(); j++){
                System.out.print(ma[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    @Override
    public double distancia(int cidade1, int cidade2) throws CidadeInvalida{
        
        //Distância
        double d;
        
        d = ma[cidade1][cidade2];
        //d = ma[cidade2][cidade1];
        
        return d;
        
    }
    
    @Override 
    public int proxima(int cidade) throws CidadeInvalida{
                
        int prox = cidade;
        double menorvalor = 1000.0;
        
        for (int i = 0; i < getN(); i++){
            
            if ((cidade != i) && (ma[cidade][i] < menorvalor)){
                menorvalor = ma[cidade][i];
                prox = i;
            }
        }
        
        return prox;
    }
    
    @Override
    public void criar(String caminho){
    }
    
} //CaixeiroMA
